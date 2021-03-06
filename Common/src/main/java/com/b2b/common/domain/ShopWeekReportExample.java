package com.b2b.common.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ShopWeekReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopWeekReportExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andSumdateIsNull() {
            addCriterion("sumdate is null");
            return (Criteria) this;
        }

        public Criteria andSumdateIsNotNull() {
            addCriterion("sumdate is not null");
            return (Criteria) this;
        }

        public Criteria andSumdateEqualTo(Date value) {
            addCriterionForJDBCDate("sumdate =", value, "sumdate");
            return (Criteria) this;
        }

        public Criteria andSumdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sumdate <>", value, "sumdate");
            return (Criteria) this;
        }

        public Criteria andSumdateGreaterThan(Date value) {
            addCriterionForJDBCDate("sumdate >", value, "sumdate");
            return (Criteria) this;
        }

        public Criteria andSumdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sumdate >=", value, "sumdate");
            return (Criteria) this;
        }

        public Criteria andSumdateLessThan(Date value) {
            addCriterionForJDBCDate("sumdate <", value, "sumdate");
            return (Criteria) this;
        }

        public Criteria andSumdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sumdate <=", value, "sumdate");
            return (Criteria) this;
        }

        public Criteria andSumdateIn(List<Date> values) {
            addCriterionForJDBCDate("sumdate in", values, "sumdate");
            return (Criteria) this;
        }

        public Criteria andSumdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sumdate not in", values, "sumdate");
            return (Criteria) this;
        }

        public Criteria andSumdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sumdate between", value1, value2, "sumdate");
            return (Criteria) this;
        }

        public Criteria andSumdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sumdate not between", value1, value2, "sumdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterionForJDBCDate("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterionForJDBCDate("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterionForJDBCDate("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterionForJDBCDate("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enddate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andConsumeFeeIsNull() {
            addCriterion("consume_fee is null");
            return (Criteria) this;
        }

        public Criteria andConsumeFeeIsNotNull() {
            addCriterion("consume_fee is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeFeeEqualTo(Long value) {
            addCriterion("consume_fee =", value, "consumeFee");
            return (Criteria) this;
        }

        public Criteria andConsumeFeeNotEqualTo(Long value) {
            addCriterion("consume_fee <>", value, "consumeFee");
            return (Criteria) this;
        }

        public Criteria andConsumeFeeGreaterThan(Long value) {
            addCriterion("consume_fee >", value, "consumeFee");
            return (Criteria) this;
        }

        public Criteria andConsumeFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("consume_fee >=", value, "consumeFee");
            return (Criteria) this;
        }

        public Criteria andConsumeFeeLessThan(Long value) {
            addCriterion("consume_fee <", value, "consumeFee");
            return (Criteria) this;
        }

        public Criteria andConsumeFeeLessThanOrEqualTo(Long value) {
            addCriterion("consume_fee <=", value, "consumeFee");
            return (Criteria) this;
        }

        public Criteria andConsumeFeeIn(List<Long> values) {
            addCriterion("consume_fee in", values, "consumeFee");
            return (Criteria) this;
        }

        public Criteria andConsumeFeeNotIn(List<Long> values) {
            addCriterion("consume_fee not in", values, "consumeFee");
            return (Criteria) this;
        }

        public Criteria andConsumeFeeBetween(Long value1, Long value2) {
            addCriterion("consume_fee between", value1, value2, "consumeFee");
            return (Criteria) this;
        }

        public Criteria andConsumeFeeNotBetween(Long value1, Long value2) {
            addCriterion("consume_fee not between", value1, value2, "consumeFee");
            return (Criteria) this;
        }

        public Criteria andBeforeConsumeFeeIsNull() {
            addCriterion("before_consume_fee is null");
            return (Criteria) this;
        }

        public Criteria andBeforeConsumeFeeIsNotNull() {
            addCriterion("before_consume_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeConsumeFeeEqualTo(BigDecimal value) {
            addCriterion("before_consume_fee =", value, "beforeConsumeFee");
            return (Criteria) this;
        }

        public Criteria andBeforeConsumeFeeNotEqualTo(BigDecimal value) {
            addCriterion("before_consume_fee <>", value, "beforeConsumeFee");
            return (Criteria) this;
        }

        public Criteria andBeforeConsumeFeeGreaterThan(BigDecimal value) {
            addCriterion("before_consume_fee >", value, "beforeConsumeFee");
            return (Criteria) this;
        }

        public Criteria andBeforeConsumeFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("before_consume_fee >=", value, "beforeConsumeFee");
            return (Criteria) this;
        }

        public Criteria andBeforeConsumeFeeLessThan(BigDecimal value) {
            addCriterion("before_consume_fee <", value, "beforeConsumeFee");
            return (Criteria) this;
        }

        public Criteria andBeforeConsumeFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("before_consume_fee <=", value, "beforeConsumeFee");
            return (Criteria) this;
        }

        public Criteria andBeforeConsumeFeeIn(List<BigDecimal> values) {
            addCriterion("before_consume_fee in", values, "beforeConsumeFee");
            return (Criteria) this;
        }

        public Criteria andBeforeConsumeFeeNotIn(List<BigDecimal> values) {
            addCriterion("before_consume_fee not in", values, "beforeConsumeFee");
            return (Criteria) this;
        }

        public Criteria andBeforeConsumeFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("before_consume_fee between", value1, value2, "beforeConsumeFee");
            return (Criteria) this;
        }

        public Criteria andBeforeConsumeFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("before_consume_fee not between", value1, value2, "beforeConsumeFee");
            return (Criteria) this;
        }

        public Criteria andExpendFeeIsNull() {
            addCriterion("expend_fee is null");
            return (Criteria) this;
        }

        public Criteria andExpendFeeIsNotNull() {
            addCriterion("expend_fee is not null");
            return (Criteria) this;
        }

        public Criteria andExpendFeeEqualTo(Long value) {
            addCriterion("expend_fee =", value, "expendFee");
            return (Criteria) this;
        }

        public Criteria andExpendFeeNotEqualTo(Long value) {
            addCriterion("expend_fee <>", value, "expendFee");
            return (Criteria) this;
        }

        public Criteria andExpendFeeGreaterThan(Long value) {
            addCriterion("expend_fee >", value, "expendFee");
            return (Criteria) this;
        }

        public Criteria andExpendFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("expend_fee >=", value, "expendFee");
            return (Criteria) this;
        }

        public Criteria andExpendFeeLessThan(Long value) {
            addCriterion("expend_fee <", value, "expendFee");
            return (Criteria) this;
        }

        public Criteria andExpendFeeLessThanOrEqualTo(Long value) {
            addCriterion("expend_fee <=", value, "expendFee");
            return (Criteria) this;
        }

        public Criteria andExpendFeeIn(List<Long> values) {
            addCriterion("expend_fee in", values, "expendFee");
            return (Criteria) this;
        }

        public Criteria andExpendFeeNotIn(List<Long> values) {
            addCriterion("expend_fee not in", values, "expendFee");
            return (Criteria) this;
        }

        public Criteria andExpendFeeBetween(Long value1, Long value2) {
            addCriterion("expend_fee between", value1, value2, "expendFee");
            return (Criteria) this;
        }

        public Criteria andExpendFeeNotBetween(Long value1, Long value2) {
            addCriterion("expend_fee not between", value1, value2, "expendFee");
            return (Criteria) this;
        }

        public Criteria andAvgFeeIsNull() {
            addCriterion("avg_fee is null");
            return (Criteria) this;
        }

        public Criteria andAvgFeeIsNotNull() {
            addCriterion("avg_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAvgFeeEqualTo(Long value) {
            addCriterion("avg_fee =", value, "avgFee");
            return (Criteria) this;
        }

        public Criteria andAvgFeeNotEqualTo(Long value) {
            addCriterion("avg_fee <>", value, "avgFee");
            return (Criteria) this;
        }

        public Criteria andAvgFeeGreaterThan(Long value) {
            addCriterion("avg_fee >", value, "avgFee");
            return (Criteria) this;
        }

        public Criteria andAvgFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("avg_fee >=", value, "avgFee");
            return (Criteria) this;
        }

        public Criteria andAvgFeeLessThan(Long value) {
            addCriterion("avg_fee <", value, "avgFee");
            return (Criteria) this;
        }

        public Criteria andAvgFeeLessThanOrEqualTo(Long value) {
            addCriterion("avg_fee <=", value, "avgFee");
            return (Criteria) this;
        }

        public Criteria andAvgFeeIn(List<Long> values) {
            addCriterion("avg_fee in", values, "avgFee");
            return (Criteria) this;
        }

        public Criteria andAvgFeeNotIn(List<Long> values) {
            addCriterion("avg_fee not in", values, "avgFee");
            return (Criteria) this;
        }

        public Criteria andAvgFeeBetween(Long value1, Long value2) {
            addCriterion("avg_fee between", value1, value2, "avgFee");
            return (Criteria) this;
        }

        public Criteria andAvgFeeNotBetween(Long value1, Long value2) {
            addCriterion("avg_fee not between", value1, value2, "avgFee");
            return (Criteria) this;
        }

        public Criteria andConsumePenIsNull() {
            addCriterion("consume_pen is null");
            return (Criteria) this;
        }

        public Criteria andConsumePenIsNotNull() {
            addCriterion("consume_pen is not null");
            return (Criteria) this;
        }

        public Criteria andConsumePenEqualTo(Integer value) {
            addCriterion("consume_pen =", value, "consumePen");
            return (Criteria) this;
        }

        public Criteria andConsumePenNotEqualTo(Integer value) {
            addCriterion("consume_pen <>", value, "consumePen");
            return (Criteria) this;
        }

        public Criteria andConsumePenGreaterThan(Integer value) {
            addCriterion("consume_pen >", value, "consumePen");
            return (Criteria) this;
        }

        public Criteria andConsumePenGreaterThanOrEqualTo(Integer value) {
            addCriterion("consume_pen >=", value, "consumePen");
            return (Criteria) this;
        }

        public Criteria andConsumePenLessThan(Integer value) {
            addCriterion("consume_pen <", value, "consumePen");
            return (Criteria) this;
        }

        public Criteria andConsumePenLessThanOrEqualTo(Integer value) {
            addCriterion("consume_pen <=", value, "consumePen");
            return (Criteria) this;
        }

        public Criteria andConsumePenIn(List<Integer> values) {
            addCriterion("consume_pen in", values, "consumePen");
            return (Criteria) this;
        }

        public Criteria andConsumePenNotIn(List<Integer> values) {
            addCriterion("consume_pen not in", values, "consumePen");
            return (Criteria) this;
        }

        public Criteria andConsumePenBetween(Integer value1, Integer value2) {
            addCriterion("consume_pen between", value1, value2, "consumePen");
            return (Criteria) this;
        }

        public Criteria andConsumePenNotBetween(Integer value1, Integer value2) {
            addCriterion("consume_pen not between", value1, value2, "consumePen");
            return (Criteria) this;
        }

        public Criteria andConsumeNumIsNull() {
            addCriterion("consume_num is null");
            return (Criteria) this;
        }

        public Criteria andConsumeNumIsNotNull() {
            addCriterion("consume_num is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeNumEqualTo(Integer value) {
            addCriterion("consume_num =", value, "consumeNum");
            return (Criteria) this;
        }

        public Criteria andConsumeNumNotEqualTo(Integer value) {
            addCriterion("consume_num <>", value, "consumeNum");
            return (Criteria) this;
        }

        public Criteria andConsumeNumGreaterThan(Integer value) {
            addCriterion("consume_num >", value, "consumeNum");
            return (Criteria) this;
        }

        public Criteria andConsumeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("consume_num >=", value, "consumeNum");
            return (Criteria) this;
        }

        public Criteria andConsumeNumLessThan(Integer value) {
            addCriterion("consume_num <", value, "consumeNum");
            return (Criteria) this;
        }

        public Criteria andConsumeNumLessThanOrEqualTo(Integer value) {
            addCriterion("consume_num <=", value, "consumeNum");
            return (Criteria) this;
        }

        public Criteria andConsumeNumIn(List<Integer> values) {
            addCriterion("consume_num in", values, "consumeNum");
            return (Criteria) this;
        }

        public Criteria andConsumeNumNotIn(List<Integer> values) {
            addCriterion("consume_num not in", values, "consumeNum");
            return (Criteria) this;
        }

        public Criteria andConsumeNumBetween(Integer value1, Integer value2) {
            addCriterion("consume_num between", value1, value2, "consumeNum");
            return (Criteria) this;
        }

        public Criteria andConsumeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("consume_num not between", value1, value2, "consumeNum");
            return (Criteria) this;
        }

        public Criteria andAvgManFeeIsNull() {
            addCriterion("avg_man_fee is null");
            return (Criteria) this;
        }

        public Criteria andAvgManFeeIsNotNull() {
            addCriterion("avg_man_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAvgManFeeEqualTo(Long value) {
            addCriterion("avg_man_fee =", value, "avgManFee");
            return (Criteria) this;
        }

        public Criteria andAvgManFeeNotEqualTo(Long value) {
            addCriterion("avg_man_fee <>", value, "avgManFee");
            return (Criteria) this;
        }

        public Criteria andAvgManFeeGreaterThan(Long value) {
            addCriterion("avg_man_fee >", value, "avgManFee");
            return (Criteria) this;
        }

        public Criteria andAvgManFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("avg_man_fee >=", value, "avgManFee");
            return (Criteria) this;
        }

        public Criteria andAvgManFeeLessThan(Long value) {
            addCriterion("avg_man_fee <", value, "avgManFee");
            return (Criteria) this;
        }

        public Criteria andAvgManFeeLessThanOrEqualTo(Long value) {
            addCriterion("avg_man_fee <=", value, "avgManFee");
            return (Criteria) this;
        }

        public Criteria andAvgManFeeIn(List<Long> values) {
            addCriterion("avg_man_fee in", values, "avgManFee");
            return (Criteria) this;
        }

        public Criteria andAvgManFeeNotIn(List<Long> values) {
            addCriterion("avg_man_fee not in", values, "avgManFee");
            return (Criteria) this;
        }

        public Criteria andAvgManFeeBetween(Long value1, Long value2) {
            addCriterion("avg_man_fee between", value1, value2, "avgManFee");
            return (Criteria) this;
        }

        public Criteria andAvgManFeeNotBetween(Long value1, Long value2) {
            addCriterion("avg_man_fee not between", value1, value2, "avgManFee");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}