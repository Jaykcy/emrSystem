package com.emr.pojo;

import java.util.ArrayList;
import java.util.List;

public class DrugExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrugExample() {
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

        public Criteria andDrIdIsNull() {
            addCriterion("dr_id is null");
            return (Criteria) this;
        }

        public Criteria andDrIdIsNotNull() {
            addCriterion("dr_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrIdEqualTo(String value) {
            addCriterion("dr_id =", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdNotEqualTo(String value) {
            addCriterion("dr_id <>", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdGreaterThan(String value) {
            addCriterion("dr_id >", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdGreaterThanOrEqualTo(String value) {
            addCriterion("dr_id >=", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdLessThan(String value) {
            addCriterion("dr_id <", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdLessThanOrEqualTo(String value) {
            addCriterion("dr_id <=", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdLike(String value) {
            addCriterion("dr_id like", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdNotLike(String value) {
            addCriterion("dr_id not like", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdIn(List<String> values) {
            addCriterion("dr_id in", values, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdNotIn(List<String> values) {
            addCriterion("dr_id not in", values, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdBetween(String value1, String value2) {
            addCriterion("dr_id between", value1, value2, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdNotBetween(String value1, String value2) {
            addCriterion("dr_id not between", value1, value2, "drId");
            return (Criteria) this;
        }

        public Criteria andDrNameIsNull() {
            addCriterion("dr_name is null");
            return (Criteria) this;
        }

        public Criteria andDrNameIsNotNull() {
            addCriterion("dr_name is not null");
            return (Criteria) this;
        }

        public Criteria andDrNameEqualTo(String value) {
            addCriterion("dr_name =", value, "drName");
            return (Criteria) this;
        }

        public Criteria andDrNameNotEqualTo(String value) {
            addCriterion("dr_name <>", value, "drName");
            return (Criteria) this;
        }

        public Criteria andDrNameGreaterThan(String value) {
            addCriterion("dr_name >", value, "drName");
            return (Criteria) this;
        }

        public Criteria andDrNameGreaterThanOrEqualTo(String value) {
            addCriterion("dr_name >=", value, "drName");
            return (Criteria) this;
        }

        public Criteria andDrNameLessThan(String value) {
            addCriterion("dr_name <", value, "drName");
            return (Criteria) this;
        }

        public Criteria andDrNameLessThanOrEqualTo(String value) {
            addCriterion("dr_name <=", value, "drName");
            return (Criteria) this;
        }

        public Criteria andDrNameLike(String value) {
            addCriterion("dr_name like", value, "drName");
            return (Criteria) this;
        }

        public Criteria andDrNameNotLike(String value) {
            addCriterion("dr_name not like", value, "drName");
            return (Criteria) this;
        }

        public Criteria andDrNameIn(List<String> values) {
            addCriterion("dr_name in", values, "drName");
            return (Criteria) this;
        }

        public Criteria andDrNameNotIn(List<String> values) {
            addCriterion("dr_name not in", values, "drName");
            return (Criteria) this;
        }

        public Criteria andDrNameBetween(String value1, String value2) {
            addCriterion("dr_name between", value1, value2, "drName");
            return (Criteria) this;
        }

        public Criteria andDrNameNotBetween(String value1, String value2) {
            addCriterion("dr_name not between", value1, value2, "drName");
            return (Criteria) this;
        }

        public Criteria andDrSpecIsNull() {
            addCriterion("dr_spec is null");
            return (Criteria) this;
        }

        public Criteria andDrSpecIsNotNull() {
            addCriterion("dr_spec is not null");
            return (Criteria) this;
        }

        public Criteria andDrSpecEqualTo(String value) {
            addCriterion("dr_spec =", value, "drSpec");
            return (Criteria) this;
        }

        public Criteria andDrSpecNotEqualTo(String value) {
            addCriterion("dr_spec <>", value, "drSpec");
            return (Criteria) this;
        }

        public Criteria andDrSpecGreaterThan(String value) {
            addCriterion("dr_spec >", value, "drSpec");
            return (Criteria) this;
        }

        public Criteria andDrSpecGreaterThanOrEqualTo(String value) {
            addCriterion("dr_spec >=", value, "drSpec");
            return (Criteria) this;
        }

        public Criteria andDrSpecLessThan(String value) {
            addCriterion("dr_spec <", value, "drSpec");
            return (Criteria) this;
        }

        public Criteria andDrSpecLessThanOrEqualTo(String value) {
            addCriterion("dr_spec <=", value, "drSpec");
            return (Criteria) this;
        }

        public Criteria andDrSpecLike(String value) {
            addCriterion("dr_spec like", value, "drSpec");
            return (Criteria) this;
        }

        public Criteria andDrSpecNotLike(String value) {
            addCriterion("dr_spec not like", value, "drSpec");
            return (Criteria) this;
        }

        public Criteria andDrSpecIn(List<String> values) {
            addCriterion("dr_spec in", values, "drSpec");
            return (Criteria) this;
        }

        public Criteria andDrSpecNotIn(List<String> values) {
            addCriterion("dr_spec not in", values, "drSpec");
            return (Criteria) this;
        }

        public Criteria andDrSpecBetween(String value1, String value2) {
            addCriterion("dr_spec between", value1, value2, "drSpec");
            return (Criteria) this;
        }

        public Criteria andDrSpecNotBetween(String value1, String value2) {
            addCriterion("dr_spec not between", value1, value2, "drSpec");
            return (Criteria) this;
        }

        public Criteria andDrUseIsNull() {
            addCriterion("dr_use is null");
            return (Criteria) this;
        }

        public Criteria andDrUseIsNotNull() {
            addCriterion("dr_use is not null");
            return (Criteria) this;
        }

        public Criteria andDrUseEqualTo(String value) {
            addCriterion("dr_use =", value, "drUse");
            return (Criteria) this;
        }

        public Criteria andDrUseNotEqualTo(String value) {
            addCriterion("dr_use <>", value, "drUse");
            return (Criteria) this;
        }

        public Criteria andDrUseGreaterThan(String value) {
            addCriterion("dr_use >", value, "drUse");
            return (Criteria) this;
        }

        public Criteria andDrUseGreaterThanOrEqualTo(String value) {
            addCriterion("dr_use >=", value, "drUse");
            return (Criteria) this;
        }

        public Criteria andDrUseLessThan(String value) {
            addCriterion("dr_use <", value, "drUse");
            return (Criteria) this;
        }

        public Criteria andDrUseLessThanOrEqualTo(String value) {
            addCriterion("dr_use <=", value, "drUse");
            return (Criteria) this;
        }

        public Criteria andDrUseLike(String value) {
            addCriterion("dr_use like", value, "drUse");
            return (Criteria) this;
        }

        public Criteria andDrUseNotLike(String value) {
            addCriterion("dr_use not like", value, "drUse");
            return (Criteria) this;
        }

        public Criteria andDrUseIn(List<String> values) {
            addCriterion("dr_use in", values, "drUse");
            return (Criteria) this;
        }

        public Criteria andDrUseNotIn(List<String> values) {
            addCriterion("dr_use not in", values, "drUse");
            return (Criteria) this;
        }

        public Criteria andDrUseBetween(String value1, String value2) {
            addCriterion("dr_use between", value1, value2, "drUse");
            return (Criteria) this;
        }

        public Criteria andDrUseNotBetween(String value1, String value2) {
            addCriterion("dr_use not between", value1, value2, "drUse");
            return (Criteria) this;
        }

        public Criteria andDrBelongIsNull() {
            addCriterion("dr_belong is null");
            return (Criteria) this;
        }

        public Criteria andDrBelongIsNotNull() {
            addCriterion("dr_belong is not null");
            return (Criteria) this;
        }

        public Criteria andDrBelongEqualTo(String value) {
            addCriterion("dr_belong =", value, "drBelong");
            return (Criteria) this;
        }

        public Criteria andDrBelongNotEqualTo(String value) {
            addCriterion("dr_belong <>", value, "drBelong");
            return (Criteria) this;
        }

        public Criteria andDrBelongGreaterThan(String value) {
            addCriterion("dr_belong >", value, "drBelong");
            return (Criteria) this;
        }

        public Criteria andDrBelongGreaterThanOrEqualTo(String value) {
            addCriterion("dr_belong >=", value, "drBelong");
            return (Criteria) this;
        }

        public Criteria andDrBelongLessThan(String value) {
            addCriterion("dr_belong <", value, "drBelong");
            return (Criteria) this;
        }

        public Criteria andDrBelongLessThanOrEqualTo(String value) {
            addCriterion("dr_belong <=", value, "drBelong");
            return (Criteria) this;
        }

        public Criteria andDrBelongLike(String value) {
            addCriterion("dr_belong like", value, "drBelong");
            return (Criteria) this;
        }

        public Criteria andDrBelongNotLike(String value) {
            addCriterion("dr_belong not like", value, "drBelong");
            return (Criteria) this;
        }

        public Criteria andDrBelongIn(List<String> values) {
            addCriterion("dr_belong in", values, "drBelong");
            return (Criteria) this;
        }

        public Criteria andDrBelongNotIn(List<String> values) {
            addCriterion("dr_belong not in", values, "drBelong");
            return (Criteria) this;
        }

        public Criteria andDrBelongBetween(String value1, String value2) {
            addCriterion("dr_belong between", value1, value2, "drBelong");
            return (Criteria) this;
        }

        public Criteria andDrBelongNotBetween(String value1, String value2) {
            addCriterion("dr_belong not between", value1, value2, "drBelong");
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