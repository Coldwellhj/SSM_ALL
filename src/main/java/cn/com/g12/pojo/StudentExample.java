package cn.com.g12.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table student
     *
     * @mbggenerated Wed Apr 11 08:40:28 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table student
     *
     * @mbggenerated Wed Apr 11 08:40:28 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table student
     *
     * @mbggenerated Wed Apr 11 08:40:28 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Wed Apr 11 08:40:28 CST 2018
     */
    public StudentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Wed Apr 11 08:40:28 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Wed Apr 11 08:40:28 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Wed Apr 11 08:40:28 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Wed Apr 11 08:40:28 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Wed Apr 11 08:40:28 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Wed Apr 11 08:40:28 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Wed Apr 11 08:40:28 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Wed Apr 11 08:40:28 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Wed Apr 11 08:40:28 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbggenerated Wed Apr 11 08:40:28 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table student
     *
     * @mbggenerated Wed Apr 11 08:40:28 CST 2018
     */
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

        public Criteria andStudidIsNull() {
            addCriterion("studid is null");
            return (Criteria) this;
        }

        public Criteria andStudidIsNotNull() {
            addCriterion("studid is not null");
            return (Criteria) this;
        }

        public Criteria andStudidEqualTo(String value) {
            addCriterion("studid =", value, "studid");
            return (Criteria) this;
        }

        public Criteria andStudidNotEqualTo(String value) {
            addCriterion("studid <>", value, "studid");
            return (Criteria) this;
        }

        public Criteria andStudidGreaterThan(String value) {
            addCriterion("studid >", value, "studid");
            return (Criteria) this;
        }

        public Criteria andStudidGreaterThanOrEqualTo(String value) {
            addCriterion("studid >=", value, "studid");
            return (Criteria) this;
        }

        public Criteria andStudidLessThan(String value) {
            addCriterion("studid <", value, "studid");
            return (Criteria) this;
        }

        public Criteria andStudidLessThanOrEqualTo(String value) {
            addCriterion("studid <=", value, "studid");
            return (Criteria) this;
        }

        public Criteria andStudidLike(String value) {
            addCriterion("studid like", value, "studid");
            return (Criteria) this;
        }

        public Criteria andStudidNotLike(String value) {
            addCriterion("studid not like", value, "studid");
            return (Criteria) this;
        }

        public Criteria andStudidIn(List<String> values) {
            addCriterion("studid in", values, "studid");
            return (Criteria) this;
        }

        public Criteria andStudidNotIn(List<String> values) {
            addCriterion("studid not in", values, "studid");
            return (Criteria) this;
        }

        public Criteria andStudidBetween(String value1, String value2) {
            addCriterion("studid between", value1, value2, "studid");
            return (Criteria) this;
        }

        public Criteria andStudidNotBetween(String value1, String value2) {
            addCriterion("studid not between", value1, value2, "studid");
            return (Criteria) this;
        }

        public Criteria andStudnameIsNull() {
            addCriterion("studname is null");
            return (Criteria) this;
        }

        public Criteria andStudnameIsNotNull() {
            addCriterion("studname is not null");
            return (Criteria) this;
        }

        public Criteria andStudnameEqualTo(String value) {
            addCriterion("studname =", value, "studname");
            return (Criteria) this;
        }

        public Criteria andStudnameNotEqualTo(String value) {
            addCriterion("studname <>", value, "studname");
            return (Criteria) this;
        }

        public Criteria andStudnameGreaterThan(String value) {
            addCriterion("studname >", value, "studname");
            return (Criteria) this;
        }

        public Criteria andStudnameGreaterThanOrEqualTo(String value) {
            addCriterion("studname >=", value, "studname");
            return (Criteria) this;
        }

        public Criteria andStudnameLessThan(String value) {
            addCriterion("studname <", value, "studname");
            return (Criteria) this;
        }

        public Criteria andStudnameLessThanOrEqualTo(String value) {
            addCriterion("studname <=", value, "studname");
            return (Criteria) this;
        }

        public Criteria andStudnameLike(String value) {
            addCriterion("studname like", value, "studname");
            return (Criteria) this;
        }

        public Criteria andStudnameNotLike(String value) {
            addCriterion("studname not like", value, "studname");
            return (Criteria) this;
        }

        public Criteria andStudnameIn(List<String> values) {
            addCriterion("studname in", values, "studname");
            return (Criteria) this;
        }

        public Criteria andStudnameNotIn(List<String> values) {
            addCriterion("studname not in", values, "studname");
            return (Criteria) this;
        }

        public Criteria andStudnameBetween(String value1, String value2) {
            addCriterion("studname between", value1, value2, "studname");
            return (Criteria) this;
        }

        public Criteria andStudnameNotBetween(String value1, String value2) {
            addCriterion("studname not between", value1, value2, "studname");
            return (Criteria) this;
        }

        public Criteria andStudsexIsNull() {
            addCriterion("studsex is null");
            return (Criteria) this;
        }

        public Criteria andStudsexIsNotNull() {
            addCriterion("studsex is not null");
            return (Criteria) this;
        }

        public Criteria andStudsexEqualTo(String value) {
            addCriterion("studsex =", value, "studsex");
            return (Criteria) this;
        }

        public Criteria andStudsexNotEqualTo(String value) {
            addCriterion("studsex <>", value, "studsex");
            return (Criteria) this;
        }

        public Criteria andStudsexGreaterThan(String value) {
            addCriterion("studsex >", value, "studsex");
            return (Criteria) this;
        }

        public Criteria andStudsexGreaterThanOrEqualTo(String value) {
            addCriterion("studsex >=", value, "studsex");
            return (Criteria) this;
        }

        public Criteria andStudsexLessThan(String value) {
            addCriterion("studsex <", value, "studsex");
            return (Criteria) this;
        }

        public Criteria andStudsexLessThanOrEqualTo(String value) {
            addCriterion("studsex <=", value, "studsex");
            return (Criteria) this;
        }

        public Criteria andStudsexLike(String value) {
            addCriterion("studsex like", value, "studsex");
            return (Criteria) this;
        }

        public Criteria andStudsexNotLike(String value) {
            addCriterion("studsex not like", value, "studsex");
            return (Criteria) this;
        }

        public Criteria andStudsexIn(List<String> values) {
            addCriterion("studsex in", values, "studsex");
            return (Criteria) this;
        }

        public Criteria andStudsexNotIn(List<String> values) {
            addCriterion("studsex not in", values, "studsex");
            return (Criteria) this;
        }

        public Criteria andStudsexBetween(String value1, String value2) {
            addCriterion("studsex between", value1, value2, "studsex");
            return (Criteria) this;
        }

        public Criteria andStudsexNotBetween(String value1, String value2) {
            addCriterion("studsex not between", value1, value2, "studsex");
            return (Criteria) this;
        }

        public Criteria andStudbirthdayIsNull() {
            addCriterion("studbirthday is null");
            return (Criteria) this;
        }

        public Criteria andStudbirthdayIsNotNull() {
            addCriterion("studbirthday is not null");
            return (Criteria) this;
        }

        public Criteria andStudbirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("studbirthday =", value, "studbirthday");
            return (Criteria) this;
        }

        public Criteria andStudbirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("studbirthday <>", value, "studbirthday");
            return (Criteria) this;
        }

        public Criteria andStudbirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("studbirthday >", value, "studbirthday");
            return (Criteria) this;
        }

        public Criteria andStudbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("studbirthday >=", value, "studbirthday");
            return (Criteria) this;
        }

        public Criteria andStudbirthdayLessThan(Date value) {
            addCriterionForJDBCDate("studbirthday <", value, "studbirthday");
            return (Criteria) this;
        }

        public Criteria andStudbirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("studbirthday <=", value, "studbirthday");
            return (Criteria) this;
        }

        public Criteria andStudbirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("studbirthday in", values, "studbirthday");
            return (Criteria) this;
        }

        public Criteria andStudbirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("studbirthday not in", values, "studbirthday");
            return (Criteria) this;
        }

        public Criteria andStudbirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("studbirthday between", value1, value2, "studbirthday");
            return (Criteria) this;
        }

        public Criteria andStudbirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("studbirthday not between", value1, value2, "studbirthday");
            return (Criteria) this;
        }

        public Criteria andStuclassIsNull() {
            addCriterion("stuclass is null");
            return (Criteria) this;
        }

        public Criteria andStuclassIsNotNull() {
            addCriterion("stuclass is not null");
            return (Criteria) this;
        }

        public Criteria andStuclassEqualTo(String value) {
            addCriterion("stuclass =", value, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassNotEqualTo(String value) {
            addCriterion("stuclass <>", value, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassGreaterThan(String value) {
            addCriterion("stuclass >", value, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassGreaterThanOrEqualTo(String value) {
            addCriterion("stuclass >=", value, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassLessThan(String value) {
            addCriterion("stuclass <", value, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassLessThanOrEqualTo(String value) {
            addCriterion("stuclass <=", value, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassLike(String value) {
            addCriterion("stuclass like", value, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassNotLike(String value) {
            addCriterion("stuclass not like", value, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassIn(List<String> values) {
            addCriterion("stuclass in", values, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassNotIn(List<String> values) {
            addCriterion("stuclass not in", values, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassBetween(String value1, String value2) {
            addCriterion("stuclass between", value1, value2, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStuclassNotBetween(String value1, String value2) {
            addCriterion("stuclass not between", value1, value2, "stuclass");
            return (Criteria) this;
        }

        public Criteria andStudaddressIsNull() {
            addCriterion("studaddress is null");
            return (Criteria) this;
        }

        public Criteria andStudaddressIsNotNull() {
            addCriterion("studaddress is not null");
            return (Criteria) this;
        }

        public Criteria andStudaddressEqualTo(String value) {
            addCriterion("studaddress =", value, "studaddress");
            return (Criteria) this;
        }

        public Criteria andStudaddressNotEqualTo(String value) {
            addCriterion("studaddress <>", value, "studaddress");
            return (Criteria) this;
        }

        public Criteria andStudaddressGreaterThan(String value) {
            addCriterion("studaddress >", value, "studaddress");
            return (Criteria) this;
        }

        public Criteria andStudaddressGreaterThanOrEqualTo(String value) {
            addCriterion("studaddress >=", value, "studaddress");
            return (Criteria) this;
        }

        public Criteria andStudaddressLessThan(String value) {
            addCriterion("studaddress <", value, "studaddress");
            return (Criteria) this;
        }

        public Criteria andStudaddressLessThanOrEqualTo(String value) {
            addCriterion("studaddress <=", value, "studaddress");
            return (Criteria) this;
        }

        public Criteria andStudaddressLike(String value) {
            addCriterion("studaddress like", value, "studaddress");
            return (Criteria) this;
        }

        public Criteria andStudaddressNotLike(String value) {
            addCriterion("studaddress not like", value, "studaddress");
            return (Criteria) this;
        }

        public Criteria andStudaddressIn(List<String> values) {
            addCriterion("studaddress in", values, "studaddress");
            return (Criteria) this;
        }

        public Criteria andStudaddressNotIn(List<String> values) {
            addCriterion("studaddress not in", values, "studaddress");
            return (Criteria) this;
        }

        public Criteria andStudaddressBetween(String value1, String value2) {
            addCriterion("studaddress between", value1, value2, "studaddress");
            return (Criteria) this;
        }

        public Criteria andStudaddressNotBetween(String value1, String value2) {
            addCriterion("studaddress not between", value1, value2, "studaddress");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("postcode is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("postcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("postcode =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("postcode <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("postcode >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postcode >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("postcode <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("postcode <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("postcode like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("postcode not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("postcode in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("postcode not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("postcode between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("postcode not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andIngradeIsNull() {
            addCriterion("ingrade is null");
            return (Criteria) this;
        }

        public Criteria andIngradeIsNotNull() {
            addCriterion("ingrade is not null");
            return (Criteria) this;
        }

        public Criteria andIngradeEqualTo(Float value) {
            addCriterion("ingrade =", value, "ingrade");
            return (Criteria) this;
        }

        public Criteria andIngradeNotEqualTo(Float value) {
            addCriterion("ingrade <>", value, "ingrade");
            return (Criteria) this;
        }

        public Criteria andIngradeGreaterThan(Float value) {
            addCriterion("ingrade >", value, "ingrade");
            return (Criteria) this;
        }

        public Criteria andIngradeGreaterThanOrEqualTo(Float value) {
            addCriterion("ingrade >=", value, "ingrade");
            return (Criteria) this;
        }

        public Criteria andIngradeLessThan(Float value) {
            addCriterion("ingrade <", value, "ingrade");
            return (Criteria) this;
        }

        public Criteria andIngradeLessThanOrEqualTo(Float value) {
            addCriterion("ingrade <=", value, "ingrade");
            return (Criteria) this;
        }

        public Criteria andIngradeIn(List<Float> values) {
            addCriterion("ingrade in", values, "ingrade");
            return (Criteria) this;
        }

        public Criteria andIngradeNotIn(List<Float> values) {
            addCriterion("ingrade not in", values, "ingrade");
            return (Criteria) this;
        }

        public Criteria andIngradeBetween(Float value1, Float value2) {
            addCriterion("ingrade between", value1, value2, "ingrade");
            return (Criteria) this;
        }

        public Criteria andIngradeNotBetween(Float value1, Float value2) {
            addCriterion("ingrade not between", value1, value2, "ingrade");
            return (Criteria) this;
        }

        public Criteria andBurseIsNull() {
            addCriterion("burse is null");
            return (Criteria) this;
        }

        public Criteria andBurseIsNotNull() {
            addCriterion("burse is not null");
            return (Criteria) this;
        }

        public Criteria andBurseEqualTo(BigDecimal value) {
            addCriterion("burse =", value, "burse");
            return (Criteria) this;
        }

        public Criteria andBurseNotEqualTo(BigDecimal value) {
            addCriterion("burse <>", value, "burse");
            return (Criteria) this;
        }

        public Criteria andBurseGreaterThan(BigDecimal value) {
            addCriterion("burse >", value, "burse");
            return (Criteria) this;
        }

        public Criteria andBurseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("burse >=", value, "burse");
            return (Criteria) this;
        }

        public Criteria andBurseLessThan(BigDecimal value) {
            addCriterion("burse <", value, "burse");
            return (Criteria) this;
        }

        public Criteria andBurseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("burse <=", value, "burse");
            return (Criteria) this;
        }

        public Criteria andBurseIn(List<BigDecimal> values) {
            addCriterion("burse in", values, "burse");
            return (Criteria) this;
        }

        public Criteria andBurseNotIn(List<BigDecimal> values) {
            addCriterion("burse not in", values, "burse");
            return (Criteria) this;
        }

        public Criteria andBurseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("burse between", value1, value2, "burse");
            return (Criteria) this;
        }

        public Criteria andBurseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("burse not between", value1, value2, "burse");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table student
     *
     * @mbggenerated do_not_delete_during_merge Wed Apr 11 08:40:28 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table student
     *
     * @mbggenerated Wed Apr 11 08:40:28 CST 2018
     */
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