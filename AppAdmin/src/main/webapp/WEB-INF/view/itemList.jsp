<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
    
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
        <meta name="apple-mobile-web-app-capable" content="no">
        <meta name="apple-mobile-web-app-status-bar-style" content="black">
        <meta content="telephone=no" name="format-detection">
        <title> 500mi生活圈 </title>
        <meta name="description" content="随时随地，连接您附近的便利店，满足您生活所需。">
        
        <link type="text/css" rel="stylesheet" href="/static/ui/common/css/mui.min.css">
        <link type="text/css" rel="stylesheet" href="/static/ui/mobile/css/consumer/mui.css">
        <link type="text/css" rel="stylesheet" href="http://at.alicdn.com/t/font_1418886866_9914722.css">
        <link type="text/css" rel="stylesheet" href="/static/ui/mobile/css/consumer/common.css">
        <link type="text/css" rel="stylesheet" href="/static/ui/mobile/css/consumer/shop_view.css">
        <style>
            [ms-controller],[ms-important],.ms-controller,.ms-important{visibility:hidden}
        </style>
        <script>
            window.MiMobile = {
                from: 'browser',
                app_id: '501',
                user_id: '',
                domains: {
                    base_url: 'http://work.500mi.com',
                    work_url: 'http://work.500mi.com',
                    passport_url: 'http://passport.500mi.com',
                    cp_url: 'http://www.500mi.com',
                    weixin_url: 'http://weixin.500mi.com',
                    img_url: 'http://img.500mi.com',
                    res_url: 'http://res.500mi.com',
                    assets_url: ''
                },
                assets_version: 201503170025
            };
            function substr(str, len) {
                var temp;
                var icount = 0;
                var patrn = /[^\x00-\xff]/;
                var strre = "";
                for (var i = 0; i < str.length; i++) {
                    if (icount < len - 1) {
                        temp = str.substr(i, 1);
                        if (patrn.exec(temp) == null) {
                            icount += 1;
                        } else {
                            icount += 2;
                        }
                        strre += temp;
                    } else {
                        break;
                    }
                }
                return strre;
            }
            //选项卡点击事件
            mui.ready(function() {
                mui('.mui-bar-tab').on('tap', 'a',
                function(e) {
                    var targetTab = this.getAttribute('href');
                    if (targetTab == '#') {
                        return;
                    }
                    location.href = targetTab;
                });
            });
        </script>
        <script type="text/javascript" src="ui/mobile/js/consumer/require.config.js"></script>
        <script type="text/javascript" src="ui/mobile/js/consumer/shop_view.js"></script>
        <script type="text/javascript" src="ui/common/js/require/domReady.js"></script> 
        <script type="text/javascript" src="ui/common/js/avalon/avalon.mi.min.js"></script>
        <script type="text/javascript" src="ui/common/js/avalon/mobile/avalon.iscroll4.js"></script>
        <script type="text/javascript" src="ui/mobile/js/consumer/common.js"></script>
        <script type="text/javascript" src="ui/common/js/zepto.min.js"></script>
        <script type="text/javascript" src="ui/common/js/store.js"></script>
        <script type="text/javascript" src="ui/common/js/micart-0.0.1.js"></script>
    </head>
    
    <body>
        
        <div class="router_shop_view" avalonctrl="consumer_shop_view">
            <header class="mui-bar mui-bar-nav mi-bg-gray">
                <!--ms-if-->
                <a href="/mobile/consumer/shop" class="mui-btn mui-btn-link mui-btn-nav mui-pull-left">
                    <i class="mui-icon mui-icon-arrowthinleft"></i>
                </a>
                <h1 class="mui-title">
                    旗放烟酒超市
                </h1>
                <a class="mui-icon iconfont icon-dianpu mui-pull-right" href="/mobile/consumer/shop/detail?shop_code=3611">
                </a>
            </header>
            <div class="shop-detail-notify" style="display: block;">
                <div class="shop-detail-notify-inner">
                    <i class="iconfont icon-laba">
                    </i>
                    <marquee direction="left" behaviour="scroll" scrollamount="1" scrolldelay="1"
                    height="20" style="height: 20px;">
                        <span>
                            配送范围：以本店为中心方圆 1km的范围满30元，1 小时送货上门，也可预约下单送货。方圆3km满50元送货上门。
                        </span>
                    </marquee>
                    <a href="javascript:void(0)" class="close-shop-detail-notify iconfont icon-guanbi">
                    </a>
                </div>
            </div>
            <!--ms-if-->
            <div>
                <div id="cate-content" class="cate-box shop-detail-notify-top" data-scroll="cateIscroll, cateIscrollOpt"
                data-init-scroll="ready" style="overflow: hidden;">
                    <ul style="transition-property: transform; -webkit-transition-property: transform; transition-duration: 0ms; -webkit-transition-duration: 0ms; transform-origin: 0px 0px 0px; transform: translate(0px, 0px) translateZ(0px);">
                        <li class="search-alias">
                            <span class="iconfont icon-sousuo">
                            </span>
                        </li>
                        <!--ms-repeat-->
                        <li class="active">
                            <div class="search-cate">
                                休闲零食
                                <!--ms-if-->
                            </div>
                            <div class="second-cate-list" style="display: none;">
                                <!--ms-repeat-->
                                <!--ms-repeat-end-->
                            </div>
                        </li>
                        <li>
                            <div class="search-cate">
                                方便速食
                                <!--ms-if-->
                            </div>
                            <div class="second-cate-list" style="display: none;">
                                <!--ms-repeat-->
                                <!--ms-repeat-end-->
                            </div>
                        </li>
                        <li>
                            <div class="search-cate">
                                饮料饮品
                                <!--ms-if-->
                            </div>
                            <div class="second-cate-list" style="display: none;">
                                <!--ms-repeat-->
                                <!--ms-repeat-end-->
                            </div>
                        </li>
                        <li>
                            <div class="search-cate">
                                乳品饮料
                                <!--ms-if-->
                            </div>
                            <div class="second-cate-list" style="display: none;">
                                <!--ms-repeat-->
                                <!--ms-repeat-end-->
                            </div>
                        </li>
                        <li>
                            <div class="search-cate">
                                家庭清洁
                                <!--ms-if-->
                            </div>
                            <div class="second-cate-list" style="display: none;">
                                <!--ms-repeat-->
                                <!--ms-repeat-end-->
                            </div>
                        </li>
                        <li>
                            <div class="search-cate">
                                其他
                                <!--ms-if-->
                            </div>
                            <div class="second-cate-list" style="display: none;">
                                <!--ms-repeat-->
                                <!--ms-repeat-end-->
                            </div>
                        </li>
                        <!--ms-repeat-end-->
                    </ul>
                </div>
                <div id="item-content" data-scroll="itemIscroll, itemIscrollOpt" class="shop-detail-notify-top"
                data-init-scroll="ready" style="overflow: hidden;">
                    <div id="scroller" style="display: block; transition-property: transform; -webkit-transition-property: transform; transition-duration: 0ms; -webkit-transition-duration: 0ms; transform-origin: 0px 0px 0px; transition-timing-function: cubic-bezier(0.33, 0.66, 0.66, 1); -webkit-transition-timing-function: cubic-bezier(0.33, 0.66, 0.66, 1); transform: translate(0px, 0px) translateZ(0px);">
                        <div id="pullDown" style="display:none">
                            <span class="pullDownIcon">
                            </span>
                            <span class="pullDownLabel">
                                下拉刷新...
                            </span>
                        </div>
                        <ul class="item-list">
                            <!--ms-repeat-->
                            <li>
                                <img class="item-img lazyimg" src="http://res.500mi.com/data/item/c31d2a7072b279bbdc67aff0aca861fc.jpeg!80x80">
                                <div class="promotion-title" style="display: none;">
                                </div>
                                <div class="item-info">
                                    <div class="item-name">
                                        乐事翡翠黄瓜味
                                    </div>
                                    <div class="spec">
                                        104g/罐
                                    </div>
                                    <div class="price">
                                        ￥
                                        <b>
                                            8.50
                                        </b>
                                        <!--ms-if-->
                                    </div>
                                </div>
                                <small class="cart-panel clearfix only-plus">
                                    <i class="icon iconfont icon-jian minus">
                                    </i>
                                    <input type="text" class="num" readonly="readonly">
                                    <i class="icon iconfont icon-jia plus">
                                    </i>
                                </small>
                            </li>
                            <li>
                                <img class="item-img lazyimg" src="http://res.500mi.com/data/item/0975a4b6bf4f0fcc8c077080a0e390fa.jpeg!80x80">
                                <div class="promotion-title" style="display: none;">
                                </div>
                                <div class="item-info">
                                    <div class="item-name">
                                        乐事鲜浓番茄味104g
                                    </div>
                                    <div class="spec">
                                        104g/罐
                                    </div>
                                    <div class="price">
                                        ￥
                                        <b>
                                            8.50
                                        </b>
                                        <!--ms-if-->
                                    </div>
                                </div>
                                <small class="cart-panel clearfix only-plus">
                                    <i class="icon iconfont icon-jian minus">
                                    </i>
                                    <input type="text" class="num" readonly="readonly">
                                    <i class="icon iconfont icon-jia plus">
                                    </i>
                                </small>
                            </li>
                            <li>
                                <img class="item-img lazyimg" src="http://res.500mi.com/data/item/9160ffdaecbd19a19e18178d1739d3b2.jpg!80x80">
                                <div class="promotion-title" style="display: none;">
                                </div>
                                <div class="item-info">
                                    <div class="item-name">
                                        乐事意大利香浓红绘味45g
                                    </div>
                                    <div class="spec">
                                        45g/包
                                    </div>
                                    <div class="price">
                                        ￥
                                        <b>
                                            3.50
                                        </b>
                                        <!--ms-if-->
                                    </div>
                                </div>
                                <small class="cart-panel clearfix only-plus">
                                    <i class="icon iconfont icon-jian minus">
                                    </i>
                                    <input type="text" class="num" readonly="readonly">
                                    <i class="icon iconfont icon-jia plus">
                                    </i>
                                </small>
                            </li>
                            <li>
                                <img class="item-img lazyimg" src="http://res.500mi.com/data/item/02d24a56f9ef3945042dce8e85e3b7c9.jpeg!80x80">
                                <div class="promotion-title" style="display: none;">
                                </div>
                                <div class="item-info">
                                    <div class="item-name">
                                        旺旺雪饼84g
                                    </div>
                                    <div class="spec">
                                        84g/袋
                                    </div>
                                    <div class="price">
                                        ￥
                                        <b>
                                            7.00
                                        </b>
                                        <!--ms-if-->
                                    </div>
                                </div>
                                <small class="cart-panel clearfix only-plus">
                                    <i class="icon iconfont icon-jian minus">
                                    </i>
                                    <input type="text" class="num" readonly="readonly">
                                    <i class="icon iconfont icon-jia plus">
                                    </i>
                                </small>
                            </li>
                            <li>
                                <img class="item-img lazyimg" src="http://res.500mi.com/data/item/83fef4eda11267de0c563116b0c8a454.jpeg!80x80">
                                <div class="promotion-title" style="display: none;">
                                </div>
                                <div class="item-info">
                                    <div class="item-name">
                                        旺旺碎冰冰果味饮料（桃子味）78ml*20支*4包
                                    </div>
                                    <div class="spec">
                                        78ml*20支*4包/件
                                    </div>
                                    <div class="price">
                                        ￥
                                        <b>
                                            1.00
                                        </b>
                                        <!--ms-if-->
                                    </div>
                                </div>
                                <small class="cart-panel clearfix only-plus">
                                    <i class="icon iconfont icon-jian minus">
                                    </i>
                                    <input type="text" class="num" readonly="readonly">
                                    <i class="icon iconfont icon-jia plus">
                                    </i>
                                </small>
                            </li>
                            <li>
                                <img class="item-img lazyimg" src="http://res.500mi.com/data/item/94c448fcb896a7db8d5cb7f519a996ab.jpeg!80x80">
                                <div class="promotion-title" style="display: none;">
                                </div>
                                <div class="item-info">
                                    <div class="item-name">
                                        乐事薯片（德克萨斯烧烤味）45g
                                    </div>
                                    <div class="spec">
                                        45g/包
                                    </div>
                                    <div class="price">
                                        ￥
                                        <b>
                                            3.50
                                        </b>
                                        <!--ms-if-->
                                    </div>
                                </div>
                                <small class="cart-panel clearfix only-plus">
                                    <i class="icon iconfont icon-jian minus">
                                    </i>
                                    <input type="text" class="num" readonly="readonly">
                                    <i class="icon iconfont icon-jia plus">
                                    </i>
                                </small>
                            </li>
                            <li>
                                <img class="item-img lazyimg" src="http://res.500mi.com/data/item/c835829e5e504a1b6c04b62d724be1c8.jpeg!80x80">
                                <div class="promotion-title" style="display: none;">
                                </div>
                                <div class="item-info">
                                    <div class="item-name">
                                        旺旺碎冰冰（菠萝味）
                                    </div>
                                    <div class="spec">
                                        78ml/只
                                    </div>
                                    <div class="price">
                                        ￥
                                        <b>
                                            1.00
                                        </b>
                                        <!--ms-if-->
                                    </div>
                                </div>
                                <small class="cart-panel clearfix only-plus">
                                    <i class="icon iconfont icon-jian minus">
                                    </i>
                                    <input type="text" class="num" readonly="readonly">
                                    <i class="icon iconfont icon-jia plus">
                                    </i>
                                </small>
                            </li>
                            <li>
                                <img class="item-img lazyimg" src="http://res.500mi.com/data/item/c835829e5e504a1b6c04b62d724be1c8.jpeg!80x80">
                                <div class="promotion-title" style="display: none;">
                                </div>
                                <div class="item-info">
                                    <div class="item-name">
                                        旺旺碎冰冰（菠萝味）
                                    </div>
                                    <div class="spec">
                                        78ml/只
                                    </div>
                                    <div class="price">
                                        ￥
                                        <b>
                                            1.00
                                        </b>
                                        <!--ms-if-->
                                    </div>
                                </div>
                                <small class="cart-panel clearfix only-plus">
                                    <i class="icon iconfont icon-jian minus">
                                    </i>
                                    <input type="text" class="num" readonly="readonly">
                                    <i class="icon iconfont icon-jia plus">
                                    </i>
                                </small>
                            </li>
                            <li>
                                <img class="item-img lazyimg" src="http://res.500mi.com/data/item/7ab58205dba738966f4e35272f6e78a1.jpeg!80x80">
                                <div class="promotion-title" style="display: none;">
                                </div>
                                <div class="item-info">
                                    <div class="item-name">
                                        乐事红烧肉味104g
                                    </div>
                                    <div class="spec">
                                        104g/罐
                                    </div>
                                    <div class="price">
                                        ￥
                                        <b>
                                            8.50
                                        </b>
                                        <!--ms-if-->
                                    </div>
                                </div>
                                <small class="cart-panel clearfix only-plus">
                                    <i class="icon iconfont icon-jian minus">
                                    </i>
                                    <input type="text" class="num" readonly="readonly">
                                    <i class="icon iconfont icon-jia plus">
                                    </i>
                                </small>
                            </li>
                            <!--ms-repeat-end-->
                        </ul>
                        <div id="pullUp" style="padding-left:70px" class="nomore">
                            <span class="pullUpIcon">
                            </span>
                            <span class="pullUpLabel">
                                没有更多了...
                            </span>
                        </div>
                    </div>
                    <!--ms-if-->
                    <!--ms-if-->
                </div>
                <!--ms-if-->
                <div class="item-search-box" style="display: none;">
                    <div class="item-search-bar">
                        <i class="iconfont icon-sousuo">
                        </i>
                        <form>
                            <input type="text" class="keywords" name="keywords" placeholder="请输入商品名称">
                            <button type="submit" class="mui-btn mui-btn-primary">
                                搜索
                            </button>
                        </form>
                        <a href="javascript:void(0)">
                            取消
                        </a>
                    </div>
                    <div class="search-item-list" style="display: none;">
                        <div id="search-item-inner" data-scroll="itemSearchIscroll, itemSearchIscrollOpt"
                        data-init-scroll="ready">
                            <ul class="item-list">
                                <!--ms-repeat-->
                                <!--ms-repeat-end-->
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="item-search-overlay" style="display: none;">
                </div>
                <div class="dailog-item" style="display: none;">
                    <h3>
                    </h3>
                    <!--ms-if-->
                    <div class="clearfix">
                        <span class="spec pull-left">
                            规格：
                        </span>
                        <span class="price pull-right">
                            ￥
                        </span>
                    </div>
                    <a href="javascript:void(0)" class="close-btn">
                        ✕
                    </a>
                </div>
                <div class="dailog-item-overlay" style="display: none;">
                </div>
            </div>
            <footer class="mui-bar mui-bar-footer mi-bg-orange">
                <div class="cart-info">
                    <span class="cart-num">
                        0
                    </span>
                    件, 共
                    <span class="cart-total">
                        0.00
                    </span>
                    元
                    <!--ms-if-->
                </div>
                <!--ms-if-->
                <!--ms-if-->
                <div class="buy-help" style="right:5px;">
                    30元起送
                </div>
            </footer>
        </div>
        <script>
            require(['/ui/mobile/js/consumer/require.config.js?v=201503170025'],
            function() {
                require(['avalon', 'shop_view', 'domReady!'],
                function(avalon, shop_view) {
                    shop_view.index();
                    avalon.scan();
                });
            });
        </script>
        <script>
        </script>
    </body>

</html>