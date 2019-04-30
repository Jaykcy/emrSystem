package com.emr.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HistorysheetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HistorysheetExample() {
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

        public Criteria andHIdIsNull() {
            addCriterion("h_id is null");
            return (Criteria) this;
        }

        public Criteria andHIdIsNotNull() {
            addCriterion("h_id is not null");
            return (Criteria) this;
        }

        public Criteria andHIdEqualTo(String value) {
            addCriterion("h_id =", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotEqualTo(String value) {
            addCriterion("h_id <>", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThan(String value) {
            addCriterion("h_id >", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdGreaterThanOrEqualTo(String value) {
            addCriterion("h_id >=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThan(String value) {
            addCriterion("h_id <", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLessThanOrEqualTo(String value) {
            addCriterion("h_id <=", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdLike(String value) {
            addCriterion("h_id like", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotLike(String value) {
            addCriterion("h_id not like", value, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdIn(List<String> values) {
            addCriterion("h_id in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotIn(List<String> values) {
            addCriterion("h_id not in", values, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdBetween(String value1, String value2) {
            addCriterion("h_id between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHIdNotBetween(String value1, String value2) {
            addCriterion("h_id not between", value1, value2, "hId");
            return (Criteria) this;
        }

        public Criteria andHNameIsNull() {
            addCriterion("h_name is null");
            return (Criteria) this;
        }

        public Criteria andHNameIsNotNull() {
            addCriterion("h_name is not null");
            return (Criteria) this;
        }

        public Criteria andHNameEqualTo(String value) {
            addCriterion("h_name =", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotEqualTo(String value) {
            addCriterion("h_name <>", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameGreaterThan(String value) {
            addCriterion("h_name >", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameGreaterThanOrEqualTo(String value) {
            addCriterion("h_name >=", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameLessThan(String value) {
            addCriterion("h_name <", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameLessThanOrEqualTo(String value) {
            addCriterion("h_name <=", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameLike(String value) {
            addCriterion("h_name like", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotLike(String value) {
            addCriterion("h_name not like", value, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameIn(List<String> values) {
            addCriterion("h_name in", values, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotIn(List<String> values) {
            addCriterion("h_name not in", values, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameBetween(String value1, String value2) {
            addCriterion("h_name between", value1, value2, "hName");
            return (Criteria) this;
        }

        public Criteria andHNameNotBetween(String value1, String value2) {
            addCriterion("h_name not between", value1, value2, "hName");
            return (Criteria) this;
        }

        public Criteria andHAgeIsNull() {
            addCriterion("h_age is null");
            return (Criteria) this;
        }

        public Criteria andHAgeIsNotNull() {
            addCriterion("h_age is not null");
            return (Criteria) this;
        }

        public Criteria andHAgeEqualTo(String value) {
            addCriterion("h_age =", value, "hAge");
            return (Criteria) this;
        }

        public Criteria andHAgeNotEqualTo(String value) {
            addCriterion("h_age <>", value, "hAge");
            return (Criteria) this;
        }

        public Criteria andHAgeGreaterThan(String value) {
            addCriterion("h_age >", value, "hAge");
            return (Criteria) this;
        }

        public Criteria andHAgeGreaterThanOrEqualTo(String value) {
            addCriterion("h_age >=", value, "hAge");
            return (Criteria) this;
        }

        public Criteria andHAgeLessThan(String value) {
            addCriterion("h_age <", value, "hAge");
            return (Criteria) this;
        }

        public Criteria andHAgeLessThanOrEqualTo(String value) {
            addCriterion("h_age <=", value, "hAge");
            return (Criteria) this;
        }

        public Criteria andHAgeLike(String value) {
            addCriterion("h_age like", value, "hAge");
            return (Criteria) this;
        }

        public Criteria andHAgeNotLike(String value) {
            addCriterion("h_age not like", value, "hAge");
            return (Criteria) this;
        }

        public Criteria andHAgeIn(List<String> values) {
            addCriterion("h_age in", values, "hAge");
            return (Criteria) this;
        }

        public Criteria andHAgeNotIn(List<String> values) {
            addCriterion("h_age not in", values, "hAge");
            return (Criteria) this;
        }

        public Criteria andHAgeBetween(String value1, String value2) {
            addCriterion("h_age between", value1, value2, "hAge");
            return (Criteria) this;
        }

        public Criteria andHAgeNotBetween(String value1, String value2) {
            addCriterion("h_age not between", value1, value2, "hAge");
            return (Criteria) this;
        }

        public Criteria andHBirthIsNull() {
            addCriterion("h_birth is null");
            return (Criteria) this;
        }

        public Criteria andHBirthIsNotNull() {
            addCriterion("h_birth is not null");
            return (Criteria) this;
        }

        public Criteria andHBirthEqualTo(String value) {
            addCriterion("h_birth =", value, "hBirth");
            return (Criteria) this;
        }

        public Criteria andHBirthNotEqualTo(String value) {
            addCriterion("h_birth <>", value, "hBirth");
            return (Criteria) this;
        }

        public Criteria andHBirthGreaterThan(String value) {
            addCriterion("h_birth >", value, "hBirth");
            return (Criteria) this;
        }

        public Criteria andHBirthGreaterThanOrEqualTo(String value) {
            addCriterion("h_birth >=", value, "hBirth");
            return (Criteria) this;
        }

        public Criteria andHBirthLessThan(String value) {
            addCriterion("h_birth <", value, "hBirth");
            return (Criteria) this;
        }

        public Criteria andHBirthLessThanOrEqualTo(String value) {
            addCriterion("h_birth <=", value, "hBirth");
            return (Criteria) this;
        }

        public Criteria andHBirthLike(String value) {
            addCriterion("h_birth like", value, "hBirth");
            return (Criteria) this;
        }

        public Criteria andHBirthNotLike(String value) {
            addCriterion("h_birth not like", value, "hBirth");
            return (Criteria) this;
        }

        public Criteria andHBirthIn(List<String> values) {
            addCriterion("h_birth in", values, "hBirth");
            return (Criteria) this;
        }

        public Criteria andHBirthNotIn(List<String> values) {
            addCriterion("h_birth not in", values, "hBirth");
            return (Criteria) this;
        }

        public Criteria andHBirthBetween(String value1, String value2) {
            addCriterion("h_birth between", value1, value2, "hBirth");
            return (Criteria) this;
        }

        public Criteria andHBirthNotBetween(String value1, String value2) {
            addCriterion("h_birth not between", value1, value2, "hBirth");
            return (Criteria) this;
        }

        public Criteria andHGenderIsNull() {
            addCriterion("h_gender is null");
            return (Criteria) this;
        }

        public Criteria andHGenderIsNotNull() {
            addCriterion("h_gender is not null");
            return (Criteria) this;
        }

        public Criteria andHGenderEqualTo(String value) {
            addCriterion("h_gender =", value, "hGender");
            return (Criteria) this;
        }

        public Criteria andHGenderNotEqualTo(String value) {
            addCriterion("h_gender <>", value, "hGender");
            return (Criteria) this;
        }

        public Criteria andHGenderGreaterThan(String value) {
            addCriterion("h_gender >", value, "hGender");
            return (Criteria) this;
        }

        public Criteria andHGenderGreaterThanOrEqualTo(String value) {
            addCriterion("h_gender >=", value, "hGender");
            return (Criteria) this;
        }

        public Criteria andHGenderLessThan(String value) {
            addCriterion("h_gender <", value, "hGender");
            return (Criteria) this;
        }

        public Criteria andHGenderLessThanOrEqualTo(String value) {
            addCriterion("h_gender <=", value, "hGender");
            return (Criteria) this;
        }

        public Criteria andHGenderLike(String value) {
            addCriterion("h_gender like", value, "hGender");
            return (Criteria) this;
        }

        public Criteria andHGenderNotLike(String value) {
            addCriterion("h_gender not like", value, "hGender");
            return (Criteria) this;
        }

        public Criteria andHGenderIn(List<String> values) {
            addCriterion("h_gender in", values, "hGender");
            return (Criteria) this;
        }

        public Criteria andHGenderNotIn(List<String> values) {
            addCriterion("h_gender not in", values, "hGender");
            return (Criteria) this;
        }

        public Criteria andHGenderBetween(String value1, String value2) {
            addCriterion("h_gender between", value1, value2, "hGender");
            return (Criteria) this;
        }

        public Criteria andHGenderNotBetween(String value1, String value2) {
            addCriterion("h_gender not between", value1, value2, "hGender");
            return (Criteria) this;
        }

        public Criteria andHAskIsNull() {
            addCriterion("h_ask is null");
            return (Criteria) this;
        }

        public Criteria andHAskIsNotNull() {
            addCriterion("h_ask is not null");
            return (Criteria) this;
        }

        public Criteria andHAskEqualTo(String value) {
            addCriterion("h_ask =", value, "hAsk");
            return (Criteria) this;
        }

        public Criteria andHAskNotEqualTo(String value) {
            addCriterion("h_ask <>", value, "hAsk");
            return (Criteria) this;
        }

        public Criteria andHAskGreaterThan(String value) {
            addCriterion("h_ask >", value, "hAsk");
            return (Criteria) this;
        }

        public Criteria andHAskGreaterThanOrEqualTo(String value) {
            addCriterion("h_ask >=", value, "hAsk");
            return (Criteria) this;
        }

        public Criteria andHAskLessThan(String value) {
            addCriterion("h_ask <", value, "hAsk");
            return (Criteria) this;
        }

        public Criteria andHAskLessThanOrEqualTo(String value) {
            addCriterion("h_ask <=", value, "hAsk");
            return (Criteria) this;
        }

        public Criteria andHAskLike(String value) {
            addCriterion("h_ask like", value, "hAsk");
            return (Criteria) this;
        }

        public Criteria andHAskNotLike(String value) {
            addCriterion("h_ask not like", value, "hAsk");
            return (Criteria) this;
        }

        public Criteria andHAskIn(List<String> values) {
            addCriterion("h_ask in", values, "hAsk");
            return (Criteria) this;
        }

        public Criteria andHAskNotIn(List<String> values) {
            addCriterion("h_ask not in", values, "hAsk");
            return (Criteria) this;
        }

        public Criteria andHAskBetween(String value1, String value2) {
            addCriterion("h_ask between", value1, value2, "hAsk");
            return (Criteria) this;
        }

        public Criteria andHAskNotBetween(String value1, String value2) {
            addCriterion("h_ask not between", value1, value2, "hAsk");
            return (Criteria) this;
        }

        public Criteria andHJudgeIsNull() {
            addCriterion("h_judge is null");
            return (Criteria) this;
        }

        public Criteria andHJudgeIsNotNull() {
            addCriterion("h_judge is not null");
            return (Criteria) this;
        }

        public Criteria andHJudgeEqualTo(String value) {
            addCriterion("h_judge =", value, "hJudge");
            return (Criteria) this;
        }

        public Criteria andHJudgeNotEqualTo(String value) {
            addCriterion("h_judge <>", value, "hJudge");
            return (Criteria) this;
        }

        public Criteria andHJudgeGreaterThan(String value) {
            addCriterion("h_judge >", value, "hJudge");
            return (Criteria) this;
        }

        public Criteria andHJudgeGreaterThanOrEqualTo(String value) {
            addCriterion("h_judge >=", value, "hJudge");
            return (Criteria) this;
        }

        public Criteria andHJudgeLessThan(String value) {
            addCriterion("h_judge <", value, "hJudge");
            return (Criteria) this;
        }

        public Criteria andHJudgeLessThanOrEqualTo(String value) {
            addCriterion("h_judge <=", value, "hJudge");
            return (Criteria) this;
        }

        public Criteria andHJudgeLike(String value) {
            addCriterion("h_judge like", value, "hJudge");
            return (Criteria) this;
        }

        public Criteria andHJudgeNotLike(String value) {
            addCriterion("h_judge not like", value, "hJudge");
            return (Criteria) this;
        }

        public Criteria andHJudgeIn(List<String> values) {
            addCriterion("h_judge in", values, "hJudge");
            return (Criteria) this;
        }

        public Criteria andHJudgeNotIn(List<String> values) {
            addCriterion("h_judge not in", values, "hJudge");
            return (Criteria) this;
        }

        public Criteria andHJudgeBetween(String value1, String value2) {
            addCriterion("h_judge between", value1, value2, "hJudge");
            return (Criteria) this;
        }

        public Criteria andHJudgeNotBetween(String value1, String value2) {
            addCriterion("h_judge not between", value1, value2, "hJudge");
            return (Criteria) this;
        }

        public Criteria andHCreateIsNull() {
            addCriterion("h_create is null");
            return (Criteria) this;
        }

        public Criteria andHCreateIsNotNull() {
            addCriterion("h_create is not null");
            return (Criteria) this;
        }

        public Criteria andHCreateEqualTo(Date value) {
            addCriterion("h_create =", value, "hCreate");
            return (Criteria) this;
        }

        public Criteria andHCreateNotEqualTo(Date value) {
            addCriterion("h_create <>", value, "hCreate");
            return (Criteria) this;
        }

        public Criteria andHCreateGreaterThan(Date value) {
            addCriterion("h_create >", value, "hCreate");
            return (Criteria) this;
        }

        public Criteria andHCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("h_create >=", value, "hCreate");
            return (Criteria) this;
        }

        public Criteria andHCreateLessThan(Date value) {
            addCriterion("h_create <", value, "hCreate");
            return (Criteria) this;
        }

        public Criteria andHCreateLessThanOrEqualTo(Date value) {
            addCriterion("h_create <=", value, "hCreate");
            return (Criteria) this;
        }

        public Criteria andHCreateIn(List<Date> values) {
            addCriterion("h_create in", values, "hCreate");
            return (Criteria) this;
        }

        public Criteria andHCreateNotIn(List<Date> values) {
            addCriterion("h_create not in", values, "hCreate");
            return (Criteria) this;
        }

        public Criteria andHCreateBetween(Date value1, Date value2) {
            addCriterion("h_create between", value1, value2, "hCreate");
            return (Criteria) this;
        }

        public Criteria andHCreateNotBetween(Date value1, Date value2) {
            addCriterion("h_create not between", value1, value2, "hCreate");
            return (Criteria) this;
        }

        public Criteria andHModifiedIsNull() {
            addCriterion("h_modified is null");
            return (Criteria) this;
        }

        public Criteria andHModifiedIsNotNull() {
            addCriterion("h_modified is not null");
            return (Criteria) this;
        }

        public Criteria andHModifiedEqualTo(Date value) {
            addCriterion("h_modified =", value, "hModified");
            return (Criteria) this;
        }

        public Criteria andHModifiedNotEqualTo(Date value) {
            addCriterion("h_modified <>", value, "hModified");
            return (Criteria) this;
        }

        public Criteria andHModifiedGreaterThan(Date value) {
            addCriterion("h_modified >", value, "hModified");
            return (Criteria) this;
        }

        public Criteria andHModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("h_modified >=", value, "hModified");
            return (Criteria) this;
        }

        public Criteria andHModifiedLessThan(Date value) {
            addCriterion("h_modified <", value, "hModified");
            return (Criteria) this;
        }

        public Criteria andHModifiedLessThanOrEqualTo(Date value) {
            addCriterion("h_modified <=", value, "hModified");
            return (Criteria) this;
        }

        public Criteria andHModifiedIn(List<Date> values) {
            addCriterion("h_modified in", values, "hModified");
            return (Criteria) this;
        }

        public Criteria andHModifiedNotIn(List<Date> values) {
            addCriterion("h_modified not in", values, "hModified");
            return (Criteria) this;
        }

        public Criteria andHModifiedBetween(Date value1, Date value2) {
            addCriterion("h_modified between", value1, value2, "hModified");
            return (Criteria) this;
        }

        public Criteria andHModifiedNotBetween(Date value1, Date value2) {
            addCriterion("h_modified not between", value1, value2, "hModified");
            return (Criteria) this;
        }

        public Criteria andHDepIsNull() {
            addCriterion("h_dep is null");
            return (Criteria) this;
        }

        public Criteria andHDepIsNotNull() {
            addCriterion("h_dep is not null");
            return (Criteria) this;
        }

        public Criteria andHDepEqualTo(String value) {
            addCriterion("h_dep =", value, "hDep");
            return (Criteria) this;
        }

        public Criteria andHDepNotEqualTo(String value) {
            addCriterion("h_dep <>", value, "hDep");
            return (Criteria) this;
        }

        public Criteria andHDepGreaterThan(String value) {
            addCriterion("h_dep >", value, "hDep");
            return (Criteria) this;
        }

        public Criteria andHDepGreaterThanOrEqualTo(String value) {
            addCriterion("h_dep >=", value, "hDep");
            return (Criteria) this;
        }

        public Criteria andHDepLessThan(String value) {
            addCriterion("h_dep <", value, "hDep");
            return (Criteria) this;
        }

        public Criteria andHDepLessThanOrEqualTo(String value) {
            addCriterion("h_dep <=", value, "hDep");
            return (Criteria) this;
        }

        public Criteria andHDepLike(String value) {
            addCriterion("h_dep like", value, "hDep");
            return (Criteria) this;
        }

        public Criteria andHDepNotLike(String value) {
            addCriterion("h_dep not like", value, "hDep");
            return (Criteria) this;
        }

        public Criteria andHDepIn(List<String> values) {
            addCriterion("h_dep in", values, "hDep");
            return (Criteria) this;
        }

        public Criteria andHDepNotIn(List<String> values) {
            addCriterion("h_dep not in", values, "hDep");
            return (Criteria) this;
        }

        public Criteria andHDepBetween(String value1, String value2) {
            addCriterion("h_dep between", value1, value2, "hDep");
            return (Criteria) this;
        }

        public Criteria andHDepNotBetween(String value1, String value2) {
            addCriterion("h_dep not between", value1, value2, "hDep");
            return (Criteria) this;
        }

        public Criteria andHDoctorIsNull() {
            addCriterion("h_doctor is null");
            return (Criteria) this;
        }

        public Criteria andHDoctorIsNotNull() {
            addCriterion("h_doctor is not null");
            return (Criteria) this;
        }

        public Criteria andHDoctorEqualTo(String value) {
            addCriterion("h_doctor =", value, "hDoctor");
            return (Criteria) this;
        }

        public Criteria andHDoctorNotEqualTo(String value) {
            addCriterion("h_doctor <>", value, "hDoctor");
            return (Criteria) this;
        }

        public Criteria andHDoctorGreaterThan(String value) {
            addCriterion("h_doctor >", value, "hDoctor");
            return (Criteria) this;
        }

        public Criteria andHDoctorGreaterThanOrEqualTo(String value) {
            addCriterion("h_doctor >=", value, "hDoctor");
            return (Criteria) this;
        }

        public Criteria andHDoctorLessThan(String value) {
            addCriterion("h_doctor <", value, "hDoctor");
            return (Criteria) this;
        }

        public Criteria andHDoctorLessThanOrEqualTo(String value) {
            addCriterion("h_doctor <=", value, "hDoctor");
            return (Criteria) this;
        }

        public Criteria andHDoctorLike(String value) {
            addCriterion("h_doctor like", value, "hDoctor");
            return (Criteria) this;
        }

        public Criteria andHDoctorNotLike(String value) {
            addCriterion("h_doctor not like", value, "hDoctor");
            return (Criteria) this;
        }

        public Criteria andHDoctorIn(List<String> values) {
            addCriterion("h_doctor in", values, "hDoctor");
            return (Criteria) this;
        }

        public Criteria andHDoctorNotIn(List<String> values) {
            addCriterion("h_doctor not in", values, "hDoctor");
            return (Criteria) this;
        }

        public Criteria andHDoctorBetween(String value1, String value2) {
            addCriterion("h_doctor between", value1, value2, "hDoctor");
            return (Criteria) this;
        }

        public Criteria andHDoctorNotBetween(String value1, String value2) {
            addCriterion("h_doctor not between", value1, value2, "hDoctor");
            return (Criteria) this;
        }

        public Criteria andHDrugIsNull() {
            addCriterion("h_drug is null");
            return (Criteria) this;
        }

        public Criteria andHDrugIsNotNull() {
            addCriterion("h_drug is not null");
            return (Criteria) this;
        }

        public Criteria andHDrugEqualTo(String value) {
            addCriterion("h_drug =", value, "hDrug");
            return (Criteria) this;
        }

        public Criteria andHDrugNotEqualTo(String value) {
            addCriterion("h_drug <>", value, "hDrug");
            return (Criteria) this;
        }

        public Criteria andHDrugGreaterThan(String value) {
            addCriterion("h_drug >", value, "hDrug");
            return (Criteria) this;
        }

        public Criteria andHDrugGreaterThanOrEqualTo(String value) {
            addCriterion("h_drug >=", value, "hDrug");
            return (Criteria) this;
        }

        public Criteria andHDrugLessThan(String value) {
            addCriterion("h_drug <", value, "hDrug");
            return (Criteria) this;
        }

        public Criteria andHDrugLessThanOrEqualTo(String value) {
            addCriterion("h_drug <=", value, "hDrug");
            return (Criteria) this;
        }

        public Criteria andHDrugLike(String value) {
            addCriterion("h_drug like", value, "hDrug");
            return (Criteria) this;
        }

        public Criteria andHDrugNotLike(String value) {
            addCriterion("h_drug not like", value, "hDrug");
            return (Criteria) this;
        }

        public Criteria andHDrugIn(List<String> values) {
            addCriterion("h_drug in", values, "hDrug");
            return (Criteria) this;
        }

        public Criteria andHDrugNotIn(List<String> values) {
            addCriterion("h_drug not in", values, "hDrug");
            return (Criteria) this;
        }

        public Criteria andHDrugBetween(String value1, String value2) {
            addCriterion("h_drug between", value1, value2, "hDrug");
            return (Criteria) this;
        }

        public Criteria andHDrugNotBetween(String value1, String value2) {
            addCriterion("h_drug not between", value1, value2, "hDrug");
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