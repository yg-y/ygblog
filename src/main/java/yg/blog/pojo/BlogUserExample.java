package yg.blog.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BlogUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogUserExample() {
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

        public Criteria andImgIdIsNull() {
            addCriterion("img_id is null");
            return (Criteria) this;
        }

        public Criteria andImgIdIsNotNull() {
            addCriterion("img_id is not null");
            return (Criteria) this;
        }

        public Criteria andImgIdEqualTo(Integer value) {
            addCriterion("img_id =", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotEqualTo(Integer value) {
            addCriterion("img_id <>", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThan(Integer value) {
            addCriterion("img_id >", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("img_id >=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThan(Integer value) {
            addCriterion("img_id <", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdLessThanOrEqualTo(Integer value) {
            addCriterion("img_id <=", value, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdIn(List<Integer> values) {
            addCriterion("img_id in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotIn(List<Integer> values) {
            addCriterion("img_id not in", values, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdBetween(Integer value1, Integer value2) {
            addCriterion("img_id between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andImgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("img_id not between", value1, value2, "imgId");
            return (Criteria) this;
        }

        public Criteria andForumIdIsNull() {
            addCriterion("forum_id is null");
            return (Criteria) this;
        }

        public Criteria andForumIdIsNotNull() {
            addCriterion("forum_id is not null");
            return (Criteria) this;
        }

        public Criteria andForumIdEqualTo(Integer value) {
            addCriterion("forum_id =", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdNotEqualTo(Integer value) {
            addCriterion("forum_id <>", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdGreaterThan(Integer value) {
            addCriterion("forum_id >", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("forum_id >=", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdLessThan(Integer value) {
            addCriterion("forum_id <", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdLessThanOrEqualTo(Integer value) {
            addCriterion("forum_id <=", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdIn(List<Integer> values) {
            addCriterion("forum_id in", values, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdNotIn(List<Integer> values) {
            addCriterion("forum_id not in", values, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdBetween(Integer value1, Integer value2) {
            addCriterion("forum_id between", value1, value2, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdNotBetween(Integer value1, Integer value2) {
            addCriterion("forum_id not between", value1, value2, "forumId");
            return (Criteria) this;
        }

        public Criteria andLikeIdIsNull() {
            addCriterion("like_id is null");
            return (Criteria) this;
        }

        public Criteria andLikeIdIsNotNull() {
            addCriterion("like_id is not null");
            return (Criteria) this;
        }

        public Criteria andLikeIdEqualTo(Integer value) {
            addCriterion("like_id =", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdNotEqualTo(Integer value) {
            addCriterion("like_id <>", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdGreaterThan(Integer value) {
            addCriterion("like_id >", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("like_id >=", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdLessThan(Integer value) {
            addCriterion("like_id <", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdLessThanOrEqualTo(Integer value) {
            addCriterion("like_id <=", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdIn(List<Integer> values) {
            addCriterion("like_id in", values, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdNotIn(List<Integer> values) {
            addCriterion("like_id not in", values, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdBetween(Integer value1, Integer value2) {
            addCriterion("like_id between", value1, value2, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("like_id not between", value1, value2, "likeId");
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

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNull() {
            addCriterion("user_gender is null");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNotNull() {
            addCriterion("user_gender is not null");
            return (Criteria) this;
        }

        public Criteria andUserGenderEqualTo(String value) {
            addCriterion("user_gender =", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotEqualTo(String value) {
            addCriterion("user_gender <>", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThan(String value) {
            addCriterion("user_gender >", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThanOrEqualTo(String value) {
            addCriterion("user_gender >=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThan(String value) {
            addCriterion("user_gender <", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThanOrEqualTo(String value) {
            addCriterion("user_gender <=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLike(String value) {
            addCriterion("user_gender like", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotLike(String value) {
            addCriterion("user_gender not like", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderIn(List<String> values) {
            addCriterion("user_gender in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotIn(List<String> values) {
            addCriterion("user_gender not in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderBetween(String value1, String value2) {
            addCriterion("user_gender between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotBetween(String value1, String value2) {
            addCriterion("user_gender not between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserAgeIsNull() {
            addCriterion("user_age is null");
            return (Criteria) this;
        }

        public Criteria andUserAgeIsNotNull() {
            addCriterion("user_age is not null");
            return (Criteria) this;
        }

        public Criteria andUserAgeEqualTo(Integer value) {
            addCriterion("user_age =", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotEqualTo(Integer value) {
            addCriterion("user_age <>", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeGreaterThan(Integer value) {
            addCriterion("user_age >", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_age >=", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLessThan(Integer value) {
            addCriterion("user_age <", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLessThanOrEqualTo(Integer value) {
            addCriterion("user_age <=", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeIn(List<Integer> values) {
            addCriterion("user_age in", values, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotIn(List<Integer> values) {
            addCriterion("user_age not in", values, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeBetween(Integer value1, Integer value2) {
            addCriterion("user_age between", value1, value2, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_age not between", value1, value2, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserDateIsNull() {
            addCriterion("user_date is null");
            return (Criteria) this;
        }

        public Criteria andUserDateIsNotNull() {
            addCriterion("user_date is not null");
            return (Criteria) this;
        }

        public Criteria andUserDateEqualTo(Date value) {
            addCriterionForJDBCDate("user_date =", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_date <>", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateGreaterThan(Date value) {
            addCriterionForJDBCDate("user_date >", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_date >=", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateLessThan(Date value) {
            addCriterionForJDBCDate("user_date <", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_date <=", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateIn(List<Date> values) {
            addCriterionForJDBCDate("user_date in", values, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_date not in", values, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_date between", value1, value2, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_date not between", value1, value2, "userDate");
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