package com.b2b.web.wx.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import net.sf.json.JSONException;
import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.b2b.web.util.MyX509TrustManager;

/**
 * https请求
 * @author aaa
 *
 */
public class CommonUtil {
	private static final Logger logger = LoggerFactory
			.getLogger(CommonUtil.class);
	
	private static String token_url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
	private static String ticket_url = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=ACCESS_TOKEN&type=jsapi";
	/**
     * 发送https请求
     * 
     * @param requestUrl 请求地址
     * @param requestMethod 请求方式（GET、POST）
     * @param outputStr 提交的数据
     * @return JSONObject(通过JSONObject.get(key)的方式获取json对象的属性值)
     */
	public static JSONObject httpsRequest(String requestUrl, String requestMethod, String outputStr) {
	            JSONObject jsonObject = null;
	            try {
	                    // 创建SSLContext对象，并使用我们指定的信任管理器初始化
	                    TrustManager[] tm = { new MyX509TrustManager() };
	                    SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
	                    sslContext.init(null, tm, new java.security.SecureRandom());
	                    // 从上述SSLContext对象中得到SSLSocketFactory对象
	                    SSLSocketFactory ssf = sslContext.getSocketFactory();
	                    URL url = new URL(requestUrl);
	                    HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
	                    conn.setSSLSocketFactory(ssf);
	                    conn.setDoOutput(true);
	                    conn.setDoInput(true);
	                    conn.setUseCaches(false);
	                    // 设置请求方式（GET/POST）
	                    conn.setRequestMethod(requestMethod);
	                    //conn.setRequestProperty("content-type", "application/x-www-form-urlencoded"); 
	                    // 当outputStr不为null时向输出流写数据
	                    if (null != outputStr) {
	                            OutputStream outputStream = conn.getOutputStream();
	                            // 注意编码格式
	                            outputStream.write(outputStr.getBytes("UTF-8"));
	                            outputStream.close();
	                    }
	                    // 从输入流读取返回内容
	                    InputStream inputStream = conn.getInputStream();
	                    InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
	                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	                    String str = null;
	                    StringBuffer buffer = new StringBuffer();
	                    while ((str = bufferedReader.readLine()) != null) {
	                            buffer.append(str);
	                    }
	                    // 释放资源
	                    bufferedReader.close();
	                    inputStreamReader.close();
	                    inputStream.close();
	                    inputStream = null;
	                    conn.disconnect();
	                    jsonObject = JSONObject.fromObject(buffer.toString());
	            } catch (ConnectException ce) {
	            	logger.error("连接超时：{}", ce);
	            } catch (Exception e) {
	            	logger.error("https请求异常：{}", e);
	            }
	            return jsonObject;
	}
	
	
	  public static Token getToken(String appid, String appsecret) {
		  Token token = null;
	        String requestUrl = token_url.replace("APPID", appid).replace("APPSECRET", appsecret);
	        // 发起GET请求获取凭证
	        JSONObject jsonObject = httpsRequest(requestUrl, "GET", null);

	        if (null != jsonObject) {
	            try {
	            	token = new Token();
	            	token.setAccessToken(jsonObject.getString("access_token"));
	            	token.setExpiresIn(jsonObject.getInt("expires_in"));
	            } catch (JSONException e) {
	                token = null;
	                // 获取token失败
	                logger.error("获取token失败 errcode:{} errmsg:{}", jsonObject.getInt("errcode"), jsonObject.getString("errmsg"));
	            }
	        }
	        return token;
	    }
	  
	  public static Token getJsapiTicket(String token) {
		  Token ticket = null;
	        String requestUrl = ticket_url.replace("ACCESS_TOKEN", token);
	        // 发起GET请求获取凭证
	        JSONObject jsonObject = httpsRequest(requestUrl, "GET", null);

	        if (null != jsonObject) {
	            try {
	            	ticket = new Token();
	            	ticket.setAccessToken(jsonObject.getString("ticket"));
	            	ticket.setExpiresIn(jsonObject.getInt("expires_in"));
	            } catch (JSONException e) {
	                token = null;
	                // 获取token失败
	                logger.error("获取JsapiTicket失败 errcode:{} errmsg:{}", jsonObject.getInt("errcode"), jsonObject.getString("errmsg"));
	            }
	        }
	        return ticket;
	    }
	  
	  public static String urlEncodeUTF8(String source) {
	        String result = source;
	        try {
	            result = java.net.URLEncoder.encode(source, "utf-8");
	        } catch (UnsupportedEncodingException e) {
	            e.printStackTrace();
	        }
	        return result;
	    }
}