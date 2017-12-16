package yg.blog.pojo;

import java.util.ArrayList;
import java.util.List;

public class BlogForumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogForumExample() {
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

        public Criteria andForumTitleIsNull() {
            addCriterion("forum_title is null");
            return (Criteria) this;
        }

        public Criteria andForumTitleIsNotNull() {
            addCriterion("forum_title is not null");
            return (Criteria) this;
        }

        public Criteria andForumTitleEqualTo(String value) {
            addCriterion("forum_title =", value, "forumTitle");
            return (Criteria) this;
        }

        public Criteria andForumTitleNotEqualTo(String value) {
            addCriterion("forum_title <>", value, "forumTitle");
            return (Criteria) this;
        }

        public Criteria andForumTitleGreaterThan(String value) {
            addCriterion("forum_title >", value, "forumTitle");
            return (Criteria) this;
        }

        public Criteria andForumTitleGreaterThanOrEqualTo(String value) {
            addCriterion("forum_title >=", value, "forumTitle");
            return (Criteria) this;
        }

        public Criteria andForumTitleLessThan(String value) {
            addCriterion("forum_title <", value, "forumTitle");
            return (Criteria) this;
        }

        public Criteria andForumTitleLessThanOrEqualTo(String value) {
            addCriterion("forum_title <=", value, "forumTitle");
            return (Criteria) this;
        }

        public Criteria andForumTitleLike(String value) {
            addCriterion("forum_title like", value, "forumTitle");
            return (Criteria) this;
        }

        public Criteria andForumTitleNotLike(String value) {
            addCriterion("forum_title not like", value, "forumTitle");
            return (Criteria) this;
        }

        public Criteria andForumTitleIn(List<String> values) {
            addCriterion("forum_title in", values, "forumTitle");
            return (Criteria) this;
        }

        public Criteria andForumTitleNotIn(List<String> values) {
            addCriterion("forum_title not in", values, "forumTitle");
            return (Criteria) this;
        }

        public Criteria andForumTitleBetween(String value1, String value2) {
            addCriterion("forum_title between", value1, value2, "forumTitle");
            return (Criteria) this;
        }

        public Criteria andForumTitleNotBetween(String value1, String value2) {
            addCriterion("forum_title not between", value1, value2, "forumTitle");
            return (Criteria) this;
        }

        public Criteria andForumContentIsNull() {
            addCriterion("forum_content is null");
            return (Criteria) this;
        }

        public Criteria andForumContentIsNotNull() {
            addCriterion("forum_content is not null");
            return (Criteria) this;
        }

        public Criteria andForumContentEqualTo(String value) {
            addCriterion("forum_content =", value, "forumContent");
            return (Criteria) this;
        }

        public Criteria andForumContentNotEqualTo(String value) {
            addCriterion("forum_content <>", value, "forumContent");
            return (Criteria) this;
        }

        public Criteria andForumContentGreaterThan(String value) {
            addCriterion("forum_content >", value, "forumContent");
            return (Criteria) this;
        }

        public Criteria andForumContentGreaterThanOrEqualTo(String value) {
            addCriterion("forum_content >=", value, "forumContent");
            return (Criteria) this;
        }

        public Criteria andForumContentLessThan(String value) {
            addCriterion("forum_content <", value, "forumContent");
            return (Criteria) this;
        }

        public Criteria andForumContentLessThanOrEqualTo(String value) {
            addCriterion("forum_content <=", value, "forumContent");
            return (Criteria) this;
        }

        public Criteria andForumContentLike(String value) {
            addCriterion("forum_content like", value, "forumContent");
            return (Criteria) this;
        }

        public Criteria andForumContentNotLike(String value) {
            addCriterion("forum_content not like", value, "forumContent");
            return (Criteria) this;
        }

        public Criteria andForumContentIn(List<String> values) {
            addCriterion("forum_content in", values, "forumContent");
            return (Criteria) this;
        }

        public Criteria andForumContentNotIn(List<String> values) {
            addCriterion("forum_content not in", values, "forumContent");
            return (Criteria) this;
        }

        public Criteria andForumContentBetween(String value1, String value2) {
            addCriterion("forum_content between", value1, value2, "forumContent");
            return (Criteria) this;
        }

        public Criteria andForumContentNotBetween(String value1, String value2) {
            addCriterion("forum_content not between", value1, value2, "forumContent");
            return (Criteria) this;
        }

        public Criteria andForumImgIsNull() {
            addCriterion("forum_img is null");
            return (Criteria) this;
        }

        public Criteria andForumImgIsNotNull() {
            addCriterion("forum_img is not null");
            return (Criteria) this;
        }

        public Criteria andForumImgEqualTo(String value) {
            addCriterion("forum_img =", value, "forumImg");
            return (Criteria) this;
        }

        public Criteria andForumImgNotEqualTo(String value) {
            addCriterion("forum_img <>", value, "forumImg");
            return (Criteria) this;
        }

        public Criteria andForumImgGreaterThan(String value) {
            addCriterion("forum_img >", value, "forumImg");
            return (Criteria) this;
        }

        public Criteria andForumImgGreaterThanOrEqualTo(String value) {
            addCriterion("forum_img >=", value, "forumImg");
            return (Criteria) this;
        }

        public Criteria andForumImgLessThan(String value) {
            addCriterion("forum_img <", value, "forumImg");
            return (Criteria) this;
        }

        public Criteria andForumImgLessThanOrEqualTo(String value) {
            addCriterion("forum_img <=", value, "forumImg");
            return (Criteria) this;
        }

        public Criteria andForumImgLike(String value) {
            addCriterion("forum_img like", value, "forumImg");
            return (Criteria) this;
        }

        public Criteria andForumImgNotLike(String value) {
            addCriterion("forum_img not like", value, "forumImg");
            return (Criteria) this;
        }

        public Criteria andForumImgIn(List<String> values) {
            addCriterion("forum_img in", values, "forumImg");
            return (Criteria) this;
        }

        public Criteria andForumImgNotIn(List<String> values) {
            addCriterion("forum_img not in", values, "forumImg");
            return (Criteria) this;
        }

        public Criteria andForumImgBetween(String value1, String value2) {
            addCriterion("forum_img between", value1, value2, "forumImg");
            return (Criteria) this;
        }

        public Criteria andForumImgNotBetween(String value1, String value2) {
            addCriterion("forum_img not between", value1, value2, "forumImg");
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