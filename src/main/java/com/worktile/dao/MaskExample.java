package com.worktile.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaskExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMarknameIsNull() {
            addCriterion("markname is null");
            return (Criteria) this;
        }

        public Criteria andMarknameIsNotNull() {
            addCriterion("markname is not null");
            return (Criteria) this;
        }

        public Criteria andMarknameEqualTo(String value) {
            addCriterion("markname =", value, "markname");
            return (Criteria) this;
        }

        public Criteria andMarknameNotEqualTo(String value) {
            addCriterion("markname <>", value, "markname");
            return (Criteria) this;
        }

        public Criteria andMarknameGreaterThan(String value) {
            addCriterion("markname >", value, "markname");
            return (Criteria) this;
        }

        public Criteria andMarknameGreaterThanOrEqualTo(String value) {
            addCriterion("markname >=", value, "markname");
            return (Criteria) this;
        }

        public Criteria andMarknameLessThan(String value) {
            addCriterion("markname <", value, "markname");
            return (Criteria) this;
        }

        public Criteria andMarknameLessThanOrEqualTo(String value) {
            addCriterion("markname <=", value, "markname");
            return (Criteria) this;
        }

        public Criteria andMarknameLike(String value) {
            addCriterion("markname like", value, "markname");
            return (Criteria) this;
        }

        public Criteria andMarknameNotLike(String value) {
            addCriterion("markname not like", value, "markname");
            return (Criteria) this;
        }

        public Criteria andMarknameIn(List<String> values) {
            addCriterion("markname in", values, "markname");
            return (Criteria) this;
        }

        public Criteria andMarknameNotIn(List<String> values) {
            addCriterion("markname not in", values, "markname");
            return (Criteria) this;
        }

        public Criteria andMarknameBetween(String value1, String value2) {
            addCriterion("markname between", value1, value2, "markname");
            return (Criteria) this;
        }

        public Criteria andMarknameNotBetween(String value1, String value2) {
            addCriterion("markname not between", value1, value2, "markname");
            return (Criteria) this;
        }

        public Criteria andListidIsNull() {
            addCriterion("listid is null");
            return (Criteria) this;
        }

        public Criteria andListidIsNotNull() {
            addCriterion("listid is not null");
            return (Criteria) this;
        }

        public Criteria andListidEqualTo(Integer value) {
            addCriterion("listid =", value, "listid");
            return (Criteria) this;
        }

        public Criteria andListidNotEqualTo(Integer value) {
            addCriterion("listid <>", value, "listid");
            return (Criteria) this;
        }

        public Criteria andListidGreaterThan(Integer value) {
            addCriterion("listid >", value, "listid");
            return (Criteria) this;
        }

        public Criteria andListidGreaterThanOrEqualTo(Integer value) {
            addCriterion("listid >=", value, "listid");
            return (Criteria) this;
        }

        public Criteria andListidLessThan(Integer value) {
            addCriterion("listid <", value, "listid");
            return (Criteria) this;
        }

        public Criteria andListidLessThanOrEqualTo(Integer value) {
            addCriterion("listid <=", value, "listid");
            return (Criteria) this;
        }

        public Criteria andListidIn(List<Integer> values) {
            addCriterion("listid in", values, "listid");
            return (Criteria) this;
        }

        public Criteria andListidNotIn(List<Integer> values) {
            addCriterion("listid not in", values, "listid");
            return (Criteria) this;
        }

        public Criteria andListidBetween(Integer value1, Integer value2) {
            addCriterion("listid between", value1, value2, "listid");
            return (Criteria) this;
        }

        public Criteria andListidNotBetween(Integer value1, Integer value2) {
            addCriterion("listid not between", value1, value2, "listid");
            return (Criteria) this;
        }

        public Criteria andParentmarkIsNull() {
            addCriterion("parentmark is null");
            return (Criteria) this;
        }

        public Criteria andParentmarkIsNotNull() {
            addCriterion("parentmark is not null");
            return (Criteria) this;
        }

        public Criteria andParentmarkEqualTo(Integer value) {
            addCriterion("parentmark =", value, "parentmark");
            return (Criteria) this;
        }

        public Criteria andParentmarkNotEqualTo(Integer value) {
            addCriterion("parentmark <>", value, "parentmark");
            return (Criteria) this;
        }

        public Criteria andParentmarkGreaterThan(Integer value) {
            addCriterion("parentmark >", value, "parentmark");
            return (Criteria) this;
        }

        public Criteria andParentmarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentmark >=", value, "parentmark");
            return (Criteria) this;
        }

        public Criteria andParentmarkLessThan(Integer value) {
            addCriterion("parentmark <", value, "parentmark");
            return (Criteria) this;
        }

        public Criteria andParentmarkLessThanOrEqualTo(Integer value) {
            addCriterion("parentmark <=", value, "parentmark");
            return (Criteria) this;
        }

        public Criteria andParentmarkIn(List<Integer> values) {
            addCriterion("parentmark in", values, "parentmark");
            return (Criteria) this;
        }

        public Criteria andParentmarkNotIn(List<Integer> values) {
            addCriterion("parentmark not in", values, "parentmark");
            return (Criteria) this;
        }

        public Criteria andParentmarkBetween(Integer value1, Integer value2) {
            addCriterion("parentmark between", value1, value2, "parentmark");
            return (Criteria) this;
        }

        public Criteria andParentmarkNotBetween(Integer value1, Integer value2) {
            addCriterion("parentmark not between", value1, value2, "parentmark");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatortimeIsNull() {
            addCriterion("creatortime is null");
            return (Criteria) this;
        }

        public Criteria andCreatortimeIsNotNull() {
            addCriterion("creatortime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatortimeEqualTo(Date value) {
            addCriterion("creatortime =", value, "creatortime");
            return (Criteria) this;
        }

        public Criteria andCreatortimeNotEqualTo(Date value) {
            addCriterion("creatortime <>", value, "creatortime");
            return (Criteria) this;
        }

        public Criteria andCreatortimeGreaterThan(Date value) {
            addCriterion("creatortime >", value, "creatortime");
            return (Criteria) this;
        }

        public Criteria andCreatortimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creatortime >=", value, "creatortime");
            return (Criteria) this;
        }

        public Criteria andCreatortimeLessThan(Date value) {
            addCriterion("creatortime <", value, "creatortime");
            return (Criteria) this;
        }

        public Criteria andCreatortimeLessThanOrEqualTo(Date value) {
            addCriterion("creatortime <=", value, "creatortime");
            return (Criteria) this;
        }

        public Criteria andCreatortimeIn(List<Date> values) {
            addCriterion("creatortime in", values, "creatortime");
            return (Criteria) this;
        }

        public Criteria andCreatortimeNotIn(List<Date> values) {
            addCriterion("creatortime not in", values, "creatortime");
            return (Criteria) this;
        }

        public Criteria andCreatortimeBetween(Date value1, Date value2) {
            addCriterion("creatortime between", value1, value2, "creatortime");
            return (Criteria) this;
        }

        public Criteria andCreatortimeNotBetween(Date value1, Date value2) {
            addCriterion("creatortime not between", value1, value2, "creatortime");
            return (Criteria) this;
        }

        public Criteria andUptotimeIsNull() {
            addCriterion("uptotime is null");
            return (Criteria) this;
        }

        public Criteria andUptotimeIsNotNull() {
            addCriterion("uptotime is not null");
            return (Criteria) this;
        }

        public Criteria andUptotimeEqualTo(Date value) {
            addCriterion("uptotime =", value, "uptotime");
            return (Criteria) this;
        }

        public Criteria andUptotimeNotEqualTo(Date value) {
            addCriterion("uptotime <>", value, "uptotime");
            return (Criteria) this;
        }

        public Criteria andUptotimeGreaterThan(Date value) {
            addCriterion("uptotime >", value, "uptotime");
            return (Criteria) this;
        }

        public Criteria andUptotimeGreaterThanOrEqualTo(Date value) {
            addCriterion("uptotime >=", value, "uptotime");
            return (Criteria) this;
        }

        public Criteria andUptotimeLessThan(Date value) {
            addCriterion("uptotime <", value, "uptotime");
            return (Criteria) this;
        }

        public Criteria andUptotimeLessThanOrEqualTo(Date value) {
            addCriterion("uptotime <=", value, "uptotime");
            return (Criteria) this;
        }

        public Criteria andUptotimeIn(List<Date> values) {
            addCriterion("uptotime in", values, "uptotime");
            return (Criteria) this;
        }

        public Criteria andUptotimeNotIn(List<Date> values) {
            addCriterion("uptotime not in", values, "uptotime");
            return (Criteria) this;
        }

        public Criteria andUptotimeBetween(Date value1, Date value2) {
            addCriterion("uptotime between", value1, value2, "uptotime");
            return (Criteria) this;
        }

        public Criteria andUptotimeNotBetween(Date value1, Date value2) {
            addCriterion("uptotime not between", value1, value2, "uptotime");
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