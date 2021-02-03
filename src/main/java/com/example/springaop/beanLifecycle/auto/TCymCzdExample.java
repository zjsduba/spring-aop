package com.example.springaop.beanLifecycle.auto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 集装箱出站单表(TCymCzd)实体Example类
 *
 * @author lsp
 * @since 2020-06-15 14:26:39
 */
public class TCymCzdExample implements Serializable {

    private static final long serialVersionUID = 634566547320638353L;
    
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    public TCymCzdExample() {
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
        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "Id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }
        public Criteria andCzdbmIsNull() {
            addCriterion("CZDBM is null");
            return (Criteria) this;
        }

        public Criteria andCzdbmIsNotNull() {
            addCriterion("CZDBM is not null");
            return (Criteria) this;
        }

        public Criteria andCzdbmEqualTo(String value) {
            addCriterion("CZDBM =", value, "czdbm");
            return (Criteria) this;
        }

        public Criteria andCzdbmNotEqualTo(String value) {
            addCriterion("CZDBM <>", value, "Czdbm");
            return (Criteria) this;
        }

        public Criteria andCzdbmGreaterThan(String value) {
            addCriterion("CZDBM >", value, "czdbm");
            return (Criteria) this;
        }

        public Criteria andCzdbmGreaterThanOrEqualTo(String value) {
            addCriterion("CZDBM >=", value, "czdbm");
            return (Criteria) this;
        }

        public Criteria andCzdbmLessThan(String value) {
            addCriterion("CZDBM <", value, "czdbm");
            return (Criteria) this;
        }

        public Criteria andCzdbmLessThanOrEqualTo(String value) {
            addCriterion("CZDBM <=", value, "czdbm");
            return (Criteria) this;
        }

        public Criteria andCzdbmIdLike(String value) {
            addCriterion("CZDBM like", value, "czdbm");
            return (Criteria) this;
        }

        public Criteria andCzdbmNotLike(String value) {
            addCriterion("CZDBM not like", value, "czdbm");
            return (Criteria) this;
        }

        public Criteria andCzdbmIdIn(List<String> values) {
            addCriterion("CZDBM in", values, "czdbm");
            return (Criteria) this;
        }

        public Criteria andCzdbmIdNotIn(List<String> values) {
            addCriterion("CZDBM not in", values, "czdbm");
            return (Criteria) this;
        }

        public Criteria andCzdbmIdBetween(String value1, String value2) {
            addCriterion("CZDBM between", value1, value2, "czdbm");
            return (Criteria) this;
        }

        public Criteria andCzdbmIdNotBetween(String value1, String value2) {
            addCriterion("CZDBM not between", value1, value2, "czdbm");
            return (Criteria) this;
        }
        public Criteria andCztmsIsNull() {
            addCriterion("CZTMS is null");
            return (Criteria) this;
        }

        public Criteria andCztmsIsNotNull() {
            addCriterion("CZTMS is not null");
            return (Criteria) this;
        }

        public Criteria andCztmsEqualTo(String value) {
            addCriterion("CZTMS =", value, "cztms");
            return (Criteria) this;
        }

        public Criteria andCztmsNotEqualTo(String value) {
            addCriterion("CZTMS <>", value, "Cztms");
            return (Criteria) this;
        }

        public Criteria andCztmsGreaterThan(String value) {
            addCriterion("CZTMS >", value, "cztms");
            return (Criteria) this;
        }

        public Criteria andCztmsGreaterThanOrEqualTo(String value) {
            addCriterion("CZTMS >=", value, "cztms");
            return (Criteria) this;
        }

        public Criteria andCztmsLessThan(String value) {
            addCriterion("CZTMS <", value, "cztms");
            return (Criteria) this;
        }

        public Criteria andCztmsLessThanOrEqualTo(String value) {
            addCriterion("CZTMS <=", value, "cztms");
            return (Criteria) this;
        }

        public Criteria andCztmsIdLike(String value) {
            addCriterion("CZTMS like", value, "cztms");
            return (Criteria) this;
        }

        public Criteria andCztmsNotLike(String value) {
            addCriterion("CZTMS not like", value, "cztms");
            return (Criteria) this;
        }

        public Criteria andCztmsIdIn(List<String> values) {
            addCriterion("CZTMS in", values, "cztms");
            return (Criteria) this;
        }

        public Criteria andCztmsIdNotIn(List<String> values) {
            addCriterion("CZTMS not in", values, "cztms");
            return (Criteria) this;
        }

        public Criteria andCztmsIdBetween(String value1, String value2) {
            addCriterion("CZTMS between", value1, value2, "cztms");
            return (Criteria) this;
        }

        public Criteria andCztmsIdNotBetween(String value1, String value2) {
            addCriterion("CZTMS not between", value1, value2, "cztms");
            return (Criteria) this;
        }
        public Criteria andCzmcIsNull() {
            addCriterion("CZMC is null");
            return (Criteria) this;
        }

        public Criteria andCzmcIsNotNull() {
            addCriterion("CZMC is not null");
            return (Criteria) this;
        }

        public Criteria andCzmcEqualTo(String value) {
            addCriterion("CZMC =", value, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcNotEqualTo(String value) {
            addCriterion("CZMC <>", value, "Czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcGreaterThan(String value) {
            addCriterion("CZMC >", value, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcGreaterThanOrEqualTo(String value) {
            addCriterion("CZMC >=", value, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcLessThan(String value) {
            addCriterion("CZMC <", value, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcLessThanOrEqualTo(String value) {
            addCriterion("CZMC <=", value, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcIdLike(String value) {
            addCriterion("CZMC like", value, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcNotLike(String value) {
            addCriterion("CZMC not like", value, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcIdIn(List<String> values) {
            addCriterion("CZMC in", values, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcIdNotIn(List<String> values) {
            addCriterion("CZMC not in", values, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcIdBetween(String value1, String value2) {
            addCriterion("CZMC between", value1, value2, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcIdNotBetween(String value1, String value2) {
            addCriterion("CZMC not between", value1, value2, "czmc");
            return (Criteria) this;
        }
        public Criteria andDjbhIsNull() {
            addCriterion("DJBH is null");
            return (Criteria) this;
        }

        public Criteria andDjbhIsNotNull() {
            addCriterion("DJBH is not null");
            return (Criteria) this;
        }

        public Criteria andDjbhEqualTo(String value) {
            addCriterion("DJBH =", value, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhNotEqualTo(String value) {
            addCriterion("DJBH <>", value, "Djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhGreaterThan(String value) {
            addCriterion("DJBH >", value, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhGreaterThanOrEqualTo(String value) {
            addCriterion("DJBH >=", value, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhLessThan(String value) {
            addCriterion("DJBH <", value, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhLessThanOrEqualTo(String value) {
            addCriterion("DJBH <=", value, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhIdLike(String value) {
            addCriterion("DJBH like", value, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhNotLike(String value) {
            addCriterion("DJBH not like", value, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhIdIn(List<String> values) {
            addCriterion("DJBH in", values, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhIdNotIn(List<String> values) {
            addCriterion("DJBH not in", values, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhIdBetween(String value1, String value2) {
            addCriterion("DJBH between", value1, value2, "djbh");
            return (Criteria) this;
        }

        public Criteria andDjbhIdNotBetween(String value1, String value2) {
            addCriterion("DJBH not between", value1, value2, "djbh");
            return (Criteria) this;
        }
        public Criteria andJzxhIsNull() {
            addCriterion("JZXH is null");
            return (Criteria) this;
        }

        public Criteria andJzxhIsNotNull() {
            addCriterion("JZXH is not null");
            return (Criteria) this;
        }

        public Criteria andJzxhEqualTo(String value) {
            addCriterion("JZXH =", value, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhNotEqualTo(String value) {
            addCriterion("JZXH <>", value, "Jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhGreaterThan(String value) {
            addCriterion("JZXH >", value, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhGreaterThanOrEqualTo(String value) {
            addCriterion("JZXH >=", value, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhLessThan(String value) {
            addCriterion("JZXH <", value, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhLessThanOrEqualTo(String value) {
            addCriterion("JZXH <=", value, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhIdLike(String value) {
            addCriterion("JZXH like", value, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhNotLike(String value) {
            addCriterion("JZXH not like", value, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhIdIn(List<String> values) {
            addCriterion("JZXH in", values, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhIdNotIn(List<String> values) {
            addCriterion("JZXH not in", values, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhIdBetween(String value1, String value2) {
            addCriterion("JZXH between", value1, value2, "jzxh");
            return (Criteria) this;
        }

        public Criteria andJzxhIdNotBetween(String value1, String value2) {
            addCriterion("JZXH not between", value1, value2, "jzxh");
            return (Criteria) this;
        }
        public Criteria andShrIsNull() {
            addCriterion("SHR is null");
            return (Criteria) this;
        }

        public Criteria andShrIsNotNull() {
            addCriterion("SHR is not null");
            return (Criteria) this;
        }

        public Criteria andShrEqualTo(String value) {
            addCriterion("SHR =", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrNotEqualTo(String value) {
            addCriterion("SHR <>", value, "Shr");
            return (Criteria) this;
        }

        public Criteria andShrGreaterThan(String value) {
            addCriterion("SHR >", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrGreaterThanOrEqualTo(String value) {
            addCriterion("SHR >=", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrLessThan(String value) {
            addCriterion("SHR <", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrLessThanOrEqualTo(String value) {
            addCriterion("SHR <=", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrIdLike(String value) {
            addCriterion("SHR like", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrNotLike(String value) {
            addCriterion("SHR not like", value, "shr");
            return (Criteria) this;
        }

        public Criteria andShrIdIn(List<String> values) {
            addCriterion("SHR in", values, "shr");
            return (Criteria) this;
        }

        public Criteria andShrIdNotIn(List<String> values) {
            addCriterion("SHR not in", values, "shr");
            return (Criteria) this;
        }

        public Criteria andShrIdBetween(String value1, String value2) {
            addCriterion("SHR between", value1, value2, "shr");
            return (Criteria) this;
        }

        public Criteria andShrIdNotBetween(String value1, String value2) {
            addCriterion("SHR not between", value1, value2, "shr");
            return (Criteria) this;
        }
        public Criteria andFhrIsNull() {
            addCriterion("FHR is null");
            return (Criteria) this;
        }

        public Criteria andFhrIsNotNull() {
            addCriterion("FHR is not null");
            return (Criteria) this;
        }

        public Criteria andFhrEqualTo(String value) {
            addCriterion("FHR =", value, "fhr");
            return (Criteria) this;
        }

        public Criteria andFhrNotEqualTo(String value) {
            addCriterion("FHR <>", value, "Fhr");
            return (Criteria) this;
        }

        public Criteria andFhrGreaterThan(String value) {
            addCriterion("FHR >", value, "fhr");
            return (Criteria) this;
        }

        public Criteria andFhrGreaterThanOrEqualTo(String value) {
            addCriterion("FHR >=", value, "fhr");
            return (Criteria) this;
        }

        public Criteria andFhrLessThan(String value) {
            addCriterion("FHR <", value, "fhr");
            return (Criteria) this;
        }

        public Criteria andFhrLessThanOrEqualTo(String value) {
            addCriterion("FHR <=", value, "fhr");
            return (Criteria) this;
        }

        public Criteria andFhrIdLike(String value) {
            addCriterion("FHR like", value, "fhr");
            return (Criteria) this;
        }

        public Criteria andFhrNotLike(String value) {
            addCriterion("FHR not like", value, "fhr");
            return (Criteria) this;
        }

        public Criteria andFhrIdIn(List<String> values) {
            addCriterion("FHR in", values, "fhr");
            return (Criteria) this;
        }

        public Criteria andFhrIdNotIn(List<String> values) {
            addCriterion("FHR not in", values, "fhr");
            return (Criteria) this;
        }

        public Criteria andFhrIdBetween(String value1, String value2) {
            addCriterion("FHR between", value1, value2, "fhr");
            return (Criteria) this;
        }

        public Criteria andFhrIdNotBetween(String value1, String value2) {
            addCriterion("FHR not between", value1, value2, "fhr");
            return (Criteria) this;
        }
        public Criteria andXxIsNull() {
            addCriterion("XX is null");
            return (Criteria) this;
        }

        public Criteria andXxIsNotNull() {
            addCriterion("XX is not null");
            return (Criteria) this;
        }

        public Criteria andXxEqualTo(String value) {
            addCriterion("XX =", value, "xx");
            return (Criteria) this;
        }

        public Criteria andXxNotEqualTo(String value) {
            addCriterion("XX <>", value, "Xx");
            return (Criteria) this;
        }

        public Criteria andXxGreaterThan(String value) {
            addCriterion("XX >", value, "xx");
            return (Criteria) this;
        }

        public Criteria andXxGreaterThanOrEqualTo(String value) {
            addCriterion("XX >=", value, "xx");
            return (Criteria) this;
        }

        public Criteria andXxLessThan(String value) {
            addCriterion("XX <", value, "xx");
            return (Criteria) this;
        }

        public Criteria andXxLessThanOrEqualTo(String value) {
            addCriterion("XX <=", value, "xx");
            return (Criteria) this;
        }

        public Criteria andXxIdLike(String value) {
            addCriterion("XX like", value, "xx");
            return (Criteria) this;
        }

        public Criteria andXxNotLike(String value) {
            addCriterion("XX not like", value, "xx");
            return (Criteria) this;
        }

        public Criteria andXxIdIn(List<String> values) {
            addCriterion("XX in", values, "xx");
            return (Criteria) this;
        }

        public Criteria andXxIdNotIn(List<String> values) {
            addCriterion("XX not in", values, "xx");
            return (Criteria) this;
        }

        public Criteria andXxIdBetween(String value1, String value2) {
            addCriterion("XX between", value1, value2, "xx");
            return (Criteria) this;
        }

        public Criteria andXxIdNotBetween(String value1, String value2) {
            addCriterion("XX not between", value1, value2, "xx");
            return (Criteria) this;
        }
        public Criteria andXlIsNull() {
            addCriterion("XL is null");
            return (Criteria) this;
        }

        public Criteria andXlIsNotNull() {
            addCriterion("XL is not null");
            return (Criteria) this;
        }

        public Criteria andXlEqualTo(String value) {
            addCriterion("XL =", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotEqualTo(String value) {
            addCriterion("XL <>", value, "Xl");
            return (Criteria) this;
        }

        public Criteria andXlGreaterThan(String value) {
            addCriterion("XL >", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlGreaterThanOrEqualTo(String value) {
            addCriterion("XL >=", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlLessThan(String value) {
            addCriterion("XL <", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlLessThanOrEqualTo(String value) {
            addCriterion("XL <=", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlIdLike(String value) {
            addCriterion("XL like", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlNotLike(String value) {
            addCriterion("XL not like", value, "xl");
            return (Criteria) this;
        }

        public Criteria andXlIdIn(List<String> values) {
            addCriterion("XL in", values, "xl");
            return (Criteria) this;
        }

        public Criteria andXlIdNotIn(List<String> values) {
            addCriterion("XL not in", values, "xl");
            return (Criteria) this;
        }

        public Criteria andXlIdBetween(String value1, String value2) {
            addCriterion("XL between", value1, value2, "xl");
            return (Criteria) this;
        }

        public Criteria andXlIdNotBetween(String value1, String value2) {
            addCriterion("XL not between", value1, value2, "xl");
            return (Criteria) this;
        }
        public Criteria andCzdztIsNull() {
            addCriterion("CZDZT is null");
            return (Criteria) this;
        }

        public Criteria andCzdztIsNotNull() {
            addCriterion("CZDZT is not null");
            return (Criteria) this;
        }

        public Criteria andCzdztEqualTo(String value) {
            addCriterion("CZDZT =", value, "czdzt");
            return (Criteria) this;
        }

        public Criteria andCzdztNotEqualTo(String value) {
            addCriterion("CZDZT <>", value, "Czdzt");
            return (Criteria) this;
        }

        public Criteria andCzdztGreaterThan(String value) {
            addCriterion("CZDZT >", value, "czdzt");
            return (Criteria) this;
        }

        public Criteria andCzdztGreaterThanOrEqualTo(String value) {
            addCriterion("CZDZT >=", value, "czdzt");
            return (Criteria) this;
        }

        public Criteria andCzdztLessThan(String value) {
            addCriterion("CZDZT <", value, "czdzt");
            return (Criteria) this;
        }

        public Criteria andCzdztLessThanOrEqualTo(String value) {
            addCriterion("CZDZT <=", value, "czdzt");
            return (Criteria) this;
        }

        public Criteria andCzdztIdLike(String value) {
            addCriterion("CZDZT like", value, "czdzt");
            return (Criteria) this;
        }

        public Criteria andCzdztNotLike(String value) {
            addCriterion("CZDZT not like", value, "czdzt");
            return (Criteria) this;
        }

        public Criteria andCzdztIdIn(List<String> values) {
            addCriterion("CZDZT in", values, "czdzt");
            return (Criteria) this;
        }

        public Criteria andCzdztIdNotIn(List<String> values) {
            addCriterion("CZDZT not in", values, "czdzt");
            return (Criteria) this;
        }

        public Criteria andCzdztIdBetween(String value1, String value2) {
            addCriterion("CZDZT between", value1, value2, "czdzt");
            return (Criteria) this;
        }

        public Criteria andCzdztIdNotBetween(String value1, String value2) {
            addCriterion("CZDZT not between", value1, value2, "czdzt");
            return (Criteria) this;
        }
        public Criteria andCzlxIsNull() {
            addCriterion("CZLX is null");
            return (Criteria) this;
        }

        public Criteria andCzlxIsNotNull() {
            addCriterion("CZLX is not null");
            return (Criteria) this;
        }

        public Criteria andCzlxEqualTo(String value) {
            addCriterion("CZLX =", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxNotEqualTo(String value) {
            addCriterion("CZLX <>", value, "Czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxGreaterThan(String value) {
            addCriterion("CZLX >", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxGreaterThanOrEqualTo(String value) {
            addCriterion("CZLX >=", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxLessThan(String value) {
            addCriterion("CZLX <", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxLessThanOrEqualTo(String value) {
            addCriterion("CZLX <=", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxIdLike(String value) {
            addCriterion("CZLX like", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxNotLike(String value) {
            addCriterion("CZLX not like", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxIdIn(List<String> values) {
            addCriterion("CZLX in", values, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxIdNotIn(List<String> values) {
            addCriterion("CZLX not in", values, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxIdBetween(String value1, String value2) {
            addCriterion("CZLX between", value1, value2, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxIdNotBetween(String value1, String value2) {
            addCriterion("CZLX not between", value1, value2, "czlx");
            return (Criteria) this;
        }
        public Criteria andDdmlhIsNull() {
            addCriterion("DDMLH is null");
            return (Criteria) this;
        }

        public Criteria andDdmlhIsNotNull() {
            addCriterion("DDMLH is not null");
            return (Criteria) this;
        }

        public Criteria andDdmlhEqualTo(String value) {
            addCriterion("DDMLH =", value, "ddmlh");
            return (Criteria) this;
        }

        public Criteria andDdmlhNotEqualTo(String value) {
            addCriterion("DDMLH <>", value, "Ddmlh");
            return (Criteria) this;
        }

        public Criteria andDdmlhGreaterThan(String value) {
            addCriterion("DDMLH >", value, "ddmlh");
            return (Criteria) this;
        }

        public Criteria andDdmlhGreaterThanOrEqualTo(String value) {
            addCriterion("DDMLH >=", value, "ddmlh");
            return (Criteria) this;
        }

        public Criteria andDdmlhLessThan(String value) {
            addCriterion("DDMLH <", value, "ddmlh");
            return (Criteria) this;
        }

        public Criteria andDdmlhLessThanOrEqualTo(String value) {
            addCriterion("DDMLH <=", value, "ddmlh");
            return (Criteria) this;
        }

        public Criteria andDdmlhIdLike(String value) {
            addCriterion("DDMLH like", value, "ddmlh");
            return (Criteria) this;
        }

        public Criteria andDdmlhNotLike(String value) {
            addCriterion("DDMLH not like", value, "ddmlh");
            return (Criteria) this;
        }

        public Criteria andDdmlhIdIn(List<String> values) {
            addCriterion("DDMLH in", values, "ddmlh");
            return (Criteria) this;
        }

        public Criteria andDdmlhIdNotIn(List<String> values) {
            addCriterion("DDMLH not in", values, "ddmlh");
            return (Criteria) this;
        }

        public Criteria andDdmlhIdBetween(String value1, String value2) {
            addCriterion("DDMLH between", value1, value2, "ddmlh");
            return (Criteria) this;
        }

        public Criteria andDdmlhIdNotBetween(String value1, String value2) {
            addCriterion("DDMLH not between", value1, value2, "ddmlh");
            return (Criteria) this;
        }
        public Criteria andJszmIsNull() {
            addCriterion("JSZM is null");
            return (Criteria) this;
        }

        public Criteria andJszmIsNotNull() {
            addCriterion("JSZM is not null");
            return (Criteria) this;
        }

        public Criteria andJszmEqualTo(String value) {
            addCriterion("JSZM =", value, "jszm");
            return (Criteria) this;
        }

        public Criteria andJszmNotEqualTo(String value) {
            addCriterion("JSZM <>", value, "Jszm");
            return (Criteria) this;
        }

        public Criteria andJszmGreaterThan(String value) {
            addCriterion("JSZM >", value, "jszm");
            return (Criteria) this;
        }

        public Criteria andJszmGreaterThanOrEqualTo(String value) {
            addCriterion("JSZM >=", value, "jszm");
            return (Criteria) this;
        }

        public Criteria andJszmLessThan(String value) {
            addCriterion("JSZM <", value, "jszm");
            return (Criteria) this;
        }

        public Criteria andJszmLessThanOrEqualTo(String value) {
            addCriterion("JSZM <=", value, "jszm");
            return (Criteria) this;
        }

        public Criteria andJszmIdLike(String value) {
            addCriterion("JSZM like", value, "jszm");
            return (Criteria) this;
        }

        public Criteria andJszmNotLike(String value) {
            addCriterion("JSZM not like", value, "jszm");
            return (Criteria) this;
        }

        public Criteria andJszmIdIn(List<String> values) {
            addCriterion("JSZM in", values, "jszm");
            return (Criteria) this;
        }

        public Criteria andJszmIdNotIn(List<String> values) {
            addCriterion("JSZM not in", values, "jszm");
            return (Criteria) this;
        }

        public Criteria andJszmIdBetween(String value1, String value2) {
            addCriterion("JSZM between", value1, value2, "jszm");
            return (Criteria) this;
        }

        public Criteria andJszmIdNotBetween(String value1, String value2) {
            addCriterion("JSZM not between", value1, value2, "jszm");
            return (Criteria) this;
        }
        public Criteria andDybjIsNull() {
            addCriterion("DYBJ is null");
            return (Criteria) this;
        }

        public Criteria andDybjIsNotNull() {
            addCriterion("DYBJ is not null");
            return (Criteria) this;
        }

        public Criteria andDybjEqualTo(String value) {
            addCriterion("DYBJ =", value, "dybj");
            return (Criteria) this;
        }

        public Criteria andDybjNotEqualTo(String value) {
            addCriterion("DYBJ <>", value, "Dybj");
            return (Criteria) this;
        }

        public Criteria andDybjGreaterThan(String value) {
            addCriterion("DYBJ >", value, "dybj");
            return (Criteria) this;
        }

        public Criteria andDybjGreaterThanOrEqualTo(String value) {
            addCriterion("DYBJ >=", value, "dybj");
            return (Criteria) this;
        }

        public Criteria andDybjLessThan(String value) {
            addCriterion("DYBJ <", value, "dybj");
            return (Criteria) this;
        }

        public Criteria andDybjLessThanOrEqualTo(String value) {
            addCriterion("DYBJ <=", value, "dybj");
            return (Criteria) this;
        }

        public Criteria andDybjIdLike(String value) {
            addCriterion("DYBJ like", value, "dybj");
            return (Criteria) this;
        }

        public Criteria andDybjNotLike(String value) {
            addCriterion("DYBJ not like", value, "dybj");
            return (Criteria) this;
        }

        public Criteria andDybjIdIn(List<String> values) {
            addCriterion("DYBJ in", values, "dybj");
            return (Criteria) this;
        }

        public Criteria andDybjIdNotIn(List<String> values) {
            addCriterion("DYBJ not in", values, "dybj");
            return (Criteria) this;
        }

        public Criteria andDybjIdBetween(String value1, String value2) {
            addCriterion("DYBJ between", value1, value2, "dybj");
            return (Criteria) this;
        }

        public Criteria andDybjIdNotBetween(String value1, String value2) {
            addCriterion("DYBJ not between", value1, value2, "dybj");
            return (Criteria) this;
        }
        public Criteria andYdhptmbhIsNull() {
            addCriterion("YDHPTMBH is null");
            return (Criteria) this;
        }

        public Criteria andYdhptmbhIsNotNull() {
            addCriterion("YDHPTMBH is not null");
            return (Criteria) this;
        }

        public Criteria andYdhptmbhEqualTo(String value) {
            addCriterion("YDHPTMBH =", value, "ydhptmbh");
            return (Criteria) this;
        }

        public Criteria andYdhptmbhNotEqualTo(String value) {
            addCriterion("YDHPTMBH <>", value, "Ydhptmbh");
            return (Criteria) this;
        }

        public Criteria andYdhptmbhGreaterThan(String value) {
            addCriterion("YDHPTMBH >", value, "ydhptmbh");
            return (Criteria) this;
        }

        public Criteria andYdhptmbhGreaterThanOrEqualTo(String value) {
            addCriterion("YDHPTMBH >=", value, "ydhptmbh");
            return (Criteria) this;
        }

        public Criteria andYdhptmbhLessThan(String value) {
            addCriterion("YDHPTMBH <", value, "ydhptmbh");
            return (Criteria) this;
        }

        public Criteria andYdhptmbhLessThanOrEqualTo(String value) {
            addCriterion("YDHPTMBH <=", value, "ydhptmbh");
            return (Criteria) this;
        }

        public Criteria andYdhptmbhIdLike(String value) {
            addCriterion("YDHPTMBH like", value, "ydhptmbh");
            return (Criteria) this;
        }

        public Criteria andYdhptmbhNotLike(String value) {
            addCriterion("YDHPTMBH not like", value, "ydhptmbh");
            return (Criteria) this;
        }

        public Criteria andYdhptmbhIdIn(List<String> values) {
            addCriterion("YDHPTMBH in", values, "ydhptmbh");
            return (Criteria) this;
        }

        public Criteria andYdhptmbhIdNotIn(List<String> values) {
            addCriterion("YDHPTMBH not in", values, "ydhptmbh");
            return (Criteria) this;
        }

        public Criteria andYdhptmbhIdBetween(String value1, String value2) {
            addCriterion("YDHPTMBH between", value1, value2, "ydhptmbh");
            return (Criteria) this;
        }

        public Criteria andYdhptmbhIdNotBetween(String value1, String value2) {
            addCriterion("YDHPTMBH not between", value1, value2, "ydhptmbh");
            return (Criteria) this;
        }
        public Criteria andTmbhIsNull() {
            addCriterion("TMBH is null");
            return (Criteria) this;
        }

        public Criteria andTmbhIsNotNull() {
            addCriterion("TMBH is not null");
            return (Criteria) this;
        }

        public Criteria andTmbhEqualTo(String value) {
            addCriterion("TMBH =", value, "tmbh");
            return (Criteria) this;
        }

        public Criteria andTmbhNotEqualTo(String value) {
            addCriterion("TMBH <>", value, "Tmbh");
            return (Criteria) this;
        }

        public Criteria andTmbhGreaterThan(String value) {
            addCriterion("TMBH >", value, "tmbh");
            return (Criteria) this;
        }

        public Criteria andTmbhGreaterThanOrEqualTo(String value) {
            addCriterion("TMBH >=", value, "tmbh");
            return (Criteria) this;
        }

        public Criteria andTmbhLessThan(String value) {
            addCriterion("TMBH <", value, "tmbh");
            return (Criteria) this;
        }

        public Criteria andTmbhLessThanOrEqualTo(String value) {
            addCriterion("TMBH <=", value, "tmbh");
            return (Criteria) this;
        }

        public Criteria andTmbhIdLike(String value) {
            addCriterion("TMBH like", value, "tmbh");
            return (Criteria) this;
        }

        public Criteria andTmbhNotLike(String value) {
            addCriterion("TMBH not like", value, "tmbh");
            return (Criteria) this;
        }

        public Criteria andTmbhIdIn(List<String> values) {
            addCriterion("TMBH in", values, "tmbh");
            return (Criteria) this;
        }

        public Criteria andTmbhIdNotIn(List<String> values) {
            addCriterion("TMBH not in", values, "tmbh");
            return (Criteria) this;
        }

        public Criteria andTmbhIdBetween(String value1, String value2) {
            addCriterion("TMBH between", value1, value2, "tmbh");
            return (Criteria) this;
        }

        public Criteria andTmbhIdNotBetween(String value1, String value2) {
            addCriterion("TMBH not between", value1, value2, "tmbh");
            return (Criteria) this;
        }
        public Criteria andMwsmrqsjIsNull() {
            addCriterion("MWSMRQSJ is null");
            return (Criteria) this;
        }

        public Criteria andMwsmrqsjIsNotNull() {
            addCriterion("MWSMRQSJ is not null");
            return (Criteria) this;
        }

        public Criteria andMwsmrqsjEqualTo(Date value) {
            addCriterion("MWSMRQSJ =", value, "mwsmrqsj");
            return (Criteria) this;
        }

        public Criteria andMwsmrqsjNotEqualTo(Date value) {
            addCriterion("MWSMRQSJ <>", value, "Mwsmrqsj");
            return (Criteria) this;
        }

        public Criteria andMwsmrqsjGreaterThan(Date value) {
            addCriterion("MWSMRQSJ >", value, "mwsmrqsj");
            return (Criteria) this;
        }

        public Criteria andMwsmrqsjGreaterThanOrEqualTo(Date value) {
            addCriterion("MWSMRQSJ >=", value, "mwsmrqsj");
            return (Criteria) this;
        }

        public Criteria andMwsmrqsjLessThan(Date value) {
            addCriterion("MWSMRQSJ <", value, "mwsmrqsj");
            return (Criteria) this;
        }

        public Criteria andMwsmrqsjLessThanOrEqualTo(Date value) {
            addCriterion("MWSMRQSJ <=", value, "mwsmrqsj");
            return (Criteria) this;
        }

        public Criteria andMwsmrqsjIdLike(Date value) {
            addCriterion("MWSMRQSJ like", value, "mwsmrqsj");
            return (Criteria) this;
        }

        public Criteria andMwsmrqsjNotLike(Date value) {
            addCriterion("MWSMRQSJ not like", value, "mwsmrqsj");
            return (Criteria) this;
        }

        public Criteria andMwsmrqsjIdIn(List<Date> values) {
            addCriterion("MWSMRQSJ in", values, "mwsmrqsj");
            return (Criteria) this;
        }

        public Criteria andMwsmrqsjIdNotIn(List<Date> values) {
            addCriterion("MWSMRQSJ not in", values, "mwsmrqsj");
            return (Criteria) this;
        }

        public Criteria andMwsmrqsjIdBetween(Date value1, Date value2) {
            addCriterion("MWSMRQSJ between", value1, value2, "mwsmrqsj");
            return (Criteria) this;
        }

        public Criteria andMwsmrqsjIdNotBetween(Date value1, Date value2) {
            addCriterion("MWSMRQSJ not between", value1, value2, "mwsmrqsj");
            return (Criteria) this;
        }
        public Criteria andJzbsmrqsjIsNull() {
            addCriterion("JZBSMRQSJ is null");
            return (Criteria) this;
        }

        public Criteria andJzbsmrqsjIsNotNull() {
            addCriterion("JZBSMRQSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJzbsmrqsjEqualTo(Date value) {
            addCriterion("JZBSMRQSJ =", value, "jzbsmrqsj");
            return (Criteria) this;
        }

        public Criteria andJzbsmrqsjNotEqualTo(Date value) {
            addCriterion("JZBSMRQSJ <>", value, "Jzbsmrqsj");
            return (Criteria) this;
        }

        public Criteria andJzbsmrqsjGreaterThan(Date value) {
            addCriterion("JZBSMRQSJ >", value, "jzbsmrqsj");
            return (Criteria) this;
        }

        public Criteria andJzbsmrqsjGreaterThanOrEqualTo(Date value) {
            addCriterion("JZBSMRQSJ >=", value, "jzbsmrqsj");
            return (Criteria) this;
        }

        public Criteria andJzbsmrqsjLessThan(Date value) {
            addCriterion("JZBSMRQSJ <", value, "jzbsmrqsj");
            return (Criteria) this;
        }

        public Criteria andJzbsmrqsjLessThanOrEqualTo(Date value) {
            addCriterion("JZBSMRQSJ <=", value, "jzbsmrqsj");
            return (Criteria) this;
        }

        public Criteria andJzbsmrqsjIdLike(Date value) {
            addCriterion("JZBSMRQSJ like", value, "jzbsmrqsj");
            return (Criteria) this;
        }

        public Criteria andJzbsmrqsjNotLike(Date value) {
            addCriterion("JZBSMRQSJ not like", value, "jzbsmrqsj");
            return (Criteria) this;
        }

        public Criteria andJzbsmrqsjIdIn(List<Date> values) {
            addCriterion("JZBSMRQSJ in", values, "jzbsmrqsj");
            return (Criteria) this;
        }

        public Criteria andJzbsmrqsjIdNotIn(List<Date> values) {
            addCriterion("JZBSMRQSJ not in", values, "jzbsmrqsj");
            return (Criteria) this;
        }

        public Criteria andJzbsmrqsjIdBetween(Date value1, Date value2) {
            addCriterion("JZBSMRQSJ between", value1, value2, "jzbsmrqsj");
            return (Criteria) this;
        }

        public Criteria andJzbsmrqsjIdNotBetween(Date value1, Date value2) {
            addCriterion("JZBSMRQSJ not between", value1, value2, "jzbsmrqsj");
            return (Criteria) this;
        }
        public Criteria andKzztIsNull() {
            addCriterion("KZZT is null");
            return (Criteria) this;
        }

        public Criteria andKzztIsNotNull() {
            addCriterion("KZZT is not null");
            return (Criteria) this;
        }

        public Criteria andKzztEqualTo(String value) {
            addCriterion("KZZT =", value, "kzzt");
            return (Criteria) this;
        }

        public Criteria andKzztNotEqualTo(String value) {
            addCriterion("KZZT <>", value, "Kzzt");
            return (Criteria) this;
        }

        public Criteria andKzztGreaterThan(String value) {
            addCriterion("KZZT >", value, "kzzt");
            return (Criteria) this;
        }

        public Criteria andKzztGreaterThanOrEqualTo(String value) {
            addCriterion("KZZT >=", value, "kzzt");
            return (Criteria) this;
        }

        public Criteria andKzztLessThan(String value) {
            addCriterion("KZZT <", value, "kzzt");
            return (Criteria) this;
        }

        public Criteria andKzztLessThanOrEqualTo(String value) {
            addCriterion("KZZT <=", value, "kzzt");
            return (Criteria) this;
        }

        public Criteria andKzztIdLike(String value) {
            addCriterion("KZZT like", value, "kzzt");
            return (Criteria) this;
        }

        public Criteria andKzztNotLike(String value) {
            addCriterion("KZZT not like", value, "kzzt");
            return (Criteria) this;
        }

        public Criteria andKzztIdIn(List<String> values) {
            addCriterion("KZZT in", values, "kzzt");
            return (Criteria) this;
        }

        public Criteria andKzztIdNotIn(List<String> values) {
            addCriterion("KZZT not in", values, "kzzt");
            return (Criteria) this;
        }

        public Criteria andKzztIdBetween(String value1, String value2) {
            addCriterion("KZZT between", value1, value2, "kzzt");
            return (Criteria) this;
        }

        public Criteria andKzztIdNotBetween(String value1, String value2) {
            addCriterion("KZZT not between", value1, value2, "kzzt");
            return (Criteria) this;
        }
        public Criteria andSyryIsNull() {
            addCriterion("SYRY is null");
            return (Criteria) this;
        }

        public Criteria andSyryIsNotNull() {
            addCriterion("SYRY is not null");
            return (Criteria) this;
        }

        public Criteria andSyryEqualTo(String value) {
            addCriterion("SYRY =", value, "syry");
            return (Criteria) this;
        }

        public Criteria andSyryNotEqualTo(String value) {
            addCriterion("SYRY <>", value, "Syry");
            return (Criteria) this;
        }

        public Criteria andSyryGreaterThan(String value) {
            addCriterion("SYRY >", value, "syry");
            return (Criteria) this;
        }

        public Criteria andSyryGreaterThanOrEqualTo(String value) {
            addCriterion("SYRY >=", value, "syry");
            return (Criteria) this;
        }

        public Criteria andSyryLessThan(String value) {
            addCriterion("SYRY <", value, "syry");
            return (Criteria) this;
        }

        public Criteria andSyryLessThanOrEqualTo(String value) {
            addCriterion("SYRY <=", value, "syry");
            return (Criteria) this;
        }

        public Criteria andSyryIdLike(String value) {
            addCriterion("SYRY like", value, "syry");
            return (Criteria) this;
        }

        public Criteria andSyryNotLike(String value) {
            addCriterion("SYRY not like", value, "syry");
            return (Criteria) this;
        }

        public Criteria andSyryIdIn(List<String> values) {
            addCriterion("SYRY in", values, "syry");
            return (Criteria) this;
        }

        public Criteria andSyryIdNotIn(List<String> values) {
            addCriterion("SYRY not in", values, "syry");
            return (Criteria) this;
        }

        public Criteria andSyryIdBetween(String value1, String value2) {
            addCriterion("SYRY between", value1, value2, "syry");
            return (Criteria) this;
        }

        public Criteria andSyryIdNotBetween(String value1, String value2) {
            addCriterion("SYRY not between", value1, value2, "syry");
            return (Criteria) this;
        }
        public Criteria andBychIsNull() {
            addCriterion("BYCH is null");
            return (Criteria) this;
        }

        public Criteria andBychIsNotNull() {
            addCriterion("BYCH is not null");
            return (Criteria) this;
        }

        public Criteria andBychEqualTo(String value) {
            addCriterion("BYCH =", value, "bych");
            return (Criteria) this;
        }

        public Criteria andBychNotEqualTo(String value) {
            addCriterion("BYCH <>", value, "Bych");
            return (Criteria) this;
        }

        public Criteria andBychGreaterThan(String value) {
            addCriterion("BYCH >", value, "bych");
            return (Criteria) this;
        }

        public Criteria andBychGreaterThanOrEqualTo(String value) {
            addCriterion("BYCH >=", value, "bych");
            return (Criteria) this;
        }

        public Criteria andBychLessThan(String value) {
            addCriterion("BYCH <", value, "bych");
            return (Criteria) this;
        }

        public Criteria andBychLessThanOrEqualTo(String value) {
            addCriterion("BYCH <=", value, "bych");
            return (Criteria) this;
        }

        public Criteria andBychIdLike(String value) {
            addCriterion("BYCH like", value, "bych");
            return (Criteria) this;
        }

        public Criteria andBychNotLike(String value) {
            addCriterion("BYCH not like", value, "bych");
            return (Criteria) this;
        }

        public Criteria andBychIdIn(List<String> values) {
            addCriterion("BYCH in", values, "bych");
            return (Criteria) this;
        }

        public Criteria andBychIdNotIn(List<String> values) {
            addCriterion("BYCH not in", values, "bych");
            return (Criteria) this;
        }

        public Criteria andBychIdBetween(String value1, String value2) {
            addCriterion("BYCH between", value1, value2, "bych");
            return (Criteria) this;
        }

        public Criteria andBychIdNotBetween(String value1, String value2) {
            addCriterion("BYCH not between", value1, value2, "bych");
            return (Criteria) this;
        }
        public Criteria andCzjbrdmIsNull() {
            addCriterion("CZJBRDM is null");
            return (Criteria) this;
        }

        public Criteria andCzjbrdmIsNotNull() {
            addCriterion("CZJBRDM is not null");
            return (Criteria) this;
        }

        public Criteria andCzjbrdmEqualTo(String value) {
            addCriterion("CZJBRDM =", value, "czjbrdm");
            return (Criteria) this;
        }

        public Criteria andCzjbrdmNotEqualTo(String value) {
            addCriterion("CZJBRDM <>", value, "Czjbrdm");
            return (Criteria) this;
        }

        public Criteria andCzjbrdmGreaterThan(String value) {
            addCriterion("CZJBRDM >", value, "czjbrdm");
            return (Criteria) this;
        }

        public Criteria andCzjbrdmGreaterThanOrEqualTo(String value) {
            addCriterion("CZJBRDM >=", value, "czjbrdm");
            return (Criteria) this;
        }

        public Criteria andCzjbrdmLessThan(String value) {
            addCriterion("CZJBRDM <", value, "czjbrdm");
            return (Criteria) this;
        }

        public Criteria andCzjbrdmLessThanOrEqualTo(String value) {
            addCriterion("CZJBRDM <=", value, "czjbrdm");
            return (Criteria) this;
        }

        public Criteria andCzjbrdmIdLike(String value) {
            addCriterion("CZJBRDM like", value, "czjbrdm");
            return (Criteria) this;
        }

        public Criteria andCzjbrdmNotLike(String value) {
            addCriterion("CZJBRDM not like", value, "czjbrdm");
            return (Criteria) this;
        }

        public Criteria andCzjbrdmIdIn(List<String> values) {
            addCriterion("CZJBRDM in", values, "czjbrdm");
            return (Criteria) this;
        }

        public Criteria andCzjbrdmIdNotIn(List<String> values) {
            addCriterion("CZJBRDM not in", values, "czjbrdm");
            return (Criteria) this;
        }

        public Criteria andCzjbrdmIdBetween(String value1, String value2) {
            addCriterion("CZJBRDM between", value1, value2, "czjbrdm");
            return (Criteria) this;
        }

        public Criteria andCzjbrdmIdNotBetween(String value1, String value2) {
            addCriterion("CZJBRDM not between", value1, value2, "czjbrdm");
            return (Criteria) this;
        }
        public Criteria andCzjbrxmIsNull() {
            addCriterion("CZJBRXM is null");
            return (Criteria) this;
        }

        public Criteria andCzjbrxmIsNotNull() {
            addCriterion("CZJBRXM is not null");
            return (Criteria) this;
        }

        public Criteria andCzjbrxmEqualTo(String value) {
            addCriterion("CZJBRXM =", value, "czjbrxm");
            return (Criteria) this;
        }

        public Criteria andCzjbrxmNotEqualTo(String value) {
            addCriterion("CZJBRXM <>", value, "Czjbrxm");
            return (Criteria) this;
        }

        public Criteria andCzjbrxmGreaterThan(String value) {
            addCriterion("CZJBRXM >", value, "czjbrxm");
            return (Criteria) this;
        }

        public Criteria andCzjbrxmGreaterThanOrEqualTo(String value) {
            addCriterion("CZJBRXM >=", value, "czjbrxm");
            return (Criteria) this;
        }

        public Criteria andCzjbrxmLessThan(String value) {
            addCriterion("CZJBRXM <", value, "czjbrxm");
            return (Criteria) this;
        }

        public Criteria andCzjbrxmLessThanOrEqualTo(String value) {
            addCriterion("CZJBRXM <=", value, "czjbrxm");
            return (Criteria) this;
        }

        public Criteria andCzjbrxmIdLike(String value) {
            addCriterion("CZJBRXM like", value, "czjbrxm");
            return (Criteria) this;
        }

        public Criteria andCzjbrxmNotLike(String value) {
            addCriterion("CZJBRXM not like", value, "czjbrxm");
            return (Criteria) this;
        }

        public Criteria andCzjbrxmIdIn(List<String> values) {
            addCriterion("CZJBRXM in", values, "czjbrxm");
            return (Criteria) this;
        }

        public Criteria andCzjbrxmIdNotIn(List<String> values) {
            addCriterion("CZJBRXM not in", values, "czjbrxm");
            return (Criteria) this;
        }

        public Criteria andCzjbrxmIdBetween(String value1, String value2) {
            addCriterion("CZJBRXM between", value1, value2, "czjbrxm");
            return (Criteria) this;
        }

        public Criteria andCzjbrxmIdNotBetween(String value1, String value2) {
            addCriterion("CZJBRXM not between", value1, value2, "czjbrxm");
            return (Criteria) this;
        }
        public Criteria andXtztsmIsNull() {
            addCriterion("XTZTSM is null");
            return (Criteria) this;
        }

        public Criteria andXtztsmIsNotNull() {
            addCriterion("XTZTSM is not null");
            return (Criteria) this;
        }

        public Criteria andXtztsmEqualTo(String value) {
            addCriterion("XTZTSM =", value, "xtztsm");
            return (Criteria) this;
        }

        public Criteria andXtztsmNotEqualTo(String value) {
            addCriterion("XTZTSM <>", value, "Xtztsm");
            return (Criteria) this;
        }

        public Criteria andXtztsmGreaterThan(String value) {
            addCriterion("XTZTSM >", value, "xtztsm");
            return (Criteria) this;
        }

        public Criteria andXtztsmGreaterThanOrEqualTo(String value) {
            addCriterion("XTZTSM >=", value, "xtztsm");
            return (Criteria) this;
        }

        public Criteria andXtztsmLessThan(String value) {
            addCriterion("XTZTSM <", value, "xtztsm");
            return (Criteria) this;
        }

        public Criteria andXtztsmLessThanOrEqualTo(String value) {
            addCriterion("XTZTSM <=", value, "xtztsm");
            return (Criteria) this;
        }

        public Criteria andXtztsmIdLike(String value) {
            addCriterion("XTZTSM like", value, "xtztsm");
            return (Criteria) this;
        }

        public Criteria andXtztsmNotLike(String value) {
            addCriterion("XTZTSM not like", value, "xtztsm");
            return (Criteria) this;
        }

        public Criteria andXtztsmIdIn(List<String> values) {
            addCriterion("XTZTSM in", values, "xtztsm");
            return (Criteria) this;
        }

        public Criteria andXtztsmIdNotIn(List<String> values) {
            addCriterion("XTZTSM not in", values, "xtztsm");
            return (Criteria) this;
        }

        public Criteria andXtztsmIdBetween(String value1, String value2) {
            addCriterion("XTZTSM between", value1, value2, "xtztsm");
            return (Criteria) this;
        }

        public Criteria andXtztsmIdNotBetween(String value1, String value2) {
            addCriterion("XTZTSM not between", value1, value2, "xtztsm");
            return (Criteria) this;
        }
        public Criteria andSfhmIsNull() {
            addCriterion("SFHM is null");
            return (Criteria) this;
        }

        public Criteria andSfhmIsNotNull() {
            addCriterion("SFHM is not null");
            return (Criteria) this;
        }

        public Criteria andSfhmEqualTo(String value) {
            addCriterion("SFHM =", value, "sfhm");
            return (Criteria) this;
        }

        public Criteria andSfhmNotEqualTo(String value) {
            addCriterion("SFHM <>", value, "Sfhm");
            return (Criteria) this;
        }

        public Criteria andSfhmGreaterThan(String value) {
            addCriterion("SFHM >", value, "sfhm");
            return (Criteria) this;
        }

        public Criteria andSfhmGreaterThanOrEqualTo(String value) {
            addCriterion("SFHM >=", value, "sfhm");
            return (Criteria) this;
        }

        public Criteria andSfhmLessThan(String value) {
            addCriterion("SFHM <", value, "sfhm");
            return (Criteria) this;
        }

        public Criteria andSfhmLessThanOrEqualTo(String value) {
            addCriterion("SFHM <=", value, "sfhm");
            return (Criteria) this;
        }

        public Criteria andSfhmIdLike(String value) {
            addCriterion("SFHM like", value, "sfhm");
            return (Criteria) this;
        }

        public Criteria andSfhmNotLike(String value) {
            addCriterion("SFHM not like", value, "sfhm");
            return (Criteria) this;
        }

        public Criteria andSfhmIdIn(List<String> values) {
            addCriterion("SFHM in", values, "sfhm");
            return (Criteria) this;
        }

        public Criteria andSfhmIdNotIn(List<String> values) {
            addCriterion("SFHM not in", values, "sfhm");
            return (Criteria) this;
        }

        public Criteria andSfhmIdBetween(String value1, String value2) {
            addCriterion("SFHM between", value1, value2, "sfhm");
            return (Criteria) this;
        }

        public Criteria andSfhmIdNotBetween(String value1, String value2) {
            addCriterion("SFHM not between", value1, value2, "sfhm");
            return (Criteria) this;
        }
        public Criteria andJsnrIsNull() {
            addCriterion("JSNR is null");
            return (Criteria) this;
        }

        public Criteria andJsnrIsNotNull() {
            addCriterion("JSNR is not null");
            return (Criteria) this;
        }

        public Criteria andJsnrEqualTo(String value) {
            addCriterion("JSNR =", value, "jsnr");
            return (Criteria) this;
        }

        public Criteria andJsnrNotEqualTo(String value) {
            addCriterion("JSNR <>", value, "Jsnr");
            return (Criteria) this;
        }

        public Criteria andJsnrGreaterThan(String value) {
            addCriterion("JSNR >", value, "jsnr");
            return (Criteria) this;
        }

        public Criteria andJsnrGreaterThanOrEqualTo(String value) {
            addCriterion("JSNR >=", value, "jsnr");
            return (Criteria) this;
        }

        public Criteria andJsnrLessThan(String value) {
            addCriterion("JSNR <", value, "jsnr");
            return (Criteria) this;
        }

        public Criteria andJsnrLessThanOrEqualTo(String value) {
            addCriterion("JSNR <=", value, "jsnr");
            return (Criteria) this;
        }

        public Criteria andJsnrIdLike(String value) {
            addCriterion("JSNR like", value, "jsnr");
            return (Criteria) this;
        }

        public Criteria andJsnrNotLike(String value) {
            addCriterion("JSNR not like", value, "jsnr");
            return (Criteria) this;
        }

        public Criteria andJsnrIdIn(List<String> values) {
            addCriterion("JSNR in", values, "jsnr");
            return (Criteria) this;
        }

        public Criteria andJsnrIdNotIn(List<String> values) {
            addCriterion("JSNR not in", values, "jsnr");
            return (Criteria) this;
        }

        public Criteria andJsnrIdBetween(String value1, String value2) {
            addCriterion("JSNR between", value1, value2, "jsnr");
            return (Criteria) this;
        }

        public Criteria andJsnrIdNotBetween(String value1, String value2) {
            addCriterion("JSNR not between", value1, value2, "jsnr");
            return (Criteria) this;
        }
        public Criteria andLrrqIsNull() {
            addCriterion("LRRQ is null");
            return (Criteria) this;
        }

        public Criteria andLrrqIsNotNull() {
            addCriterion("LRRQ is not null");
            return (Criteria) this;
        }

        public Criteria andLrrqEqualTo(Date value) {
            addCriterion("LRRQ =", value, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqNotEqualTo(Date value) {
            addCriterion("LRRQ <>", value, "Lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqGreaterThan(Date value) {
            addCriterion("LRRQ >", value, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqGreaterThanOrEqualTo(Date value) {
            addCriterion("LRRQ >=", value, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqLessThan(Date value) {
            addCriterion("LRRQ <", value, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqLessThanOrEqualTo(Date value) {
            addCriterion("LRRQ <=", value, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqIdLike(Date value) {
            addCriterion("LRRQ like", value, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqNotLike(Date value) {
            addCriterion("LRRQ not like", value, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqIdIn(List<Date> values) {
            addCriterion("LRRQ in", values, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqIdNotIn(List<Date> values) {
            addCriterion("LRRQ not in", values, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqIdBetween(Date value1, Date value2) {
            addCriterion("LRRQ between", value1, value2, "lrrq");
            return (Criteria) this;
        }

        public Criteria andLrrqIdNotBetween(Date value1, Date value2) {
            addCriterion("LRRQ not between", value1, value2, "lrrq");
            return (Criteria) this;
        }
        public Criteria andSfhzIsNull() {
            addCriterion("SFHZ is null");
            return (Criteria) this;
        }

        public Criteria andSfhzIsNotNull() {
            addCriterion("SFHZ is not null");
            return (Criteria) this;
        }

        public Criteria andSfhzEqualTo(String value) {
            addCriterion("SFHZ =", value, "sfhz");
            return (Criteria) this;
        }

        public Criteria andSfhzNotEqualTo(String value) {
            addCriterion("SFHZ <>", value, "Sfhz");
            return (Criteria) this;
        }

        public Criteria andSfhzGreaterThan(String value) {
            addCriterion("SFHZ >", value, "sfhz");
            return (Criteria) this;
        }

        public Criteria andSfhzGreaterThanOrEqualTo(String value) {
            addCriterion("SFHZ >=", value, "sfhz");
            return (Criteria) this;
        }

        public Criteria andSfhzLessThan(String value) {
            addCriterion("SFHZ <", value, "sfhz");
            return (Criteria) this;
        }

        public Criteria andSfhzLessThanOrEqualTo(String value) {
            addCriterion("SFHZ <=", value, "sfhz");
            return (Criteria) this;
        }

        public Criteria andSfhzIdLike(String value) {
            addCriterion("SFHZ like", value, "sfhz");
            return (Criteria) this;
        }

        public Criteria andSfhzNotLike(String value) {
            addCriterion("SFHZ not like", value, "sfhz");
            return (Criteria) this;
        }

        public Criteria andSfhzIdIn(List<String> values) {
            addCriterion("SFHZ in", values, "sfhz");
            return (Criteria) this;
        }

        public Criteria andSfhzIdNotIn(List<String> values) {
            addCriterion("SFHZ not in", values, "sfhz");
            return (Criteria) this;
        }

        public Criteria andSfhzIdBetween(String value1, String value2) {
            addCriterion("SFHZ between", value1, value2, "sfhz");
            return (Criteria) this;
        }

        public Criteria andSfhzIdNotBetween(String value1, String value2) {
            addCriterion("SFHZ not between", value1, value2, "sfhz");
            return (Criteria) this;
        }
        public Criteria andHzrqIsNull() {
            addCriterion("HZRQ is null");
            return (Criteria) this;
        }

        public Criteria andHzrqIsNotNull() {
            addCriterion("HZRQ is not null");
            return (Criteria) this;
        }

        public Criteria andHzrqEqualTo(Date value) {
            addCriterion("HZRQ =", value, "hzrq");
            return (Criteria) this;
        }

        public Criteria andHzrqNotEqualTo(Date value) {
            addCriterion("HZRQ <>", value, "Hzrq");
            return (Criteria) this;
        }

        public Criteria andHzrqGreaterThan(Date value) {
            addCriterion("HZRQ >", value, "hzrq");
            return (Criteria) this;
        }

        public Criteria andHzrqGreaterThanOrEqualTo(Date value) {
            addCriterion("HZRQ >=", value, "hzrq");
            return (Criteria) this;
        }

        public Criteria andHzrqLessThan(Date value) {
            addCriterion("HZRQ <", value, "hzrq");
            return (Criteria) this;
        }

        public Criteria andHzrqLessThanOrEqualTo(Date value) {
            addCriterion("HZRQ <=", value, "hzrq");
            return (Criteria) this;
        }

        public Criteria andHzrqIdLike(Date value) {
            addCriterion("HZRQ like", value, "hzrq");
            return (Criteria) this;
        }

        public Criteria andHzrqNotLike(Date value) {
            addCriterion("HZRQ not like", value, "hzrq");
            return (Criteria) this;
        }

        public Criteria andHzrqIdIn(List<Date> values) {
            addCriterion("HZRQ in", values, "hzrq");
            return (Criteria) this;
        }

        public Criteria andHzrqIdNotIn(List<Date> values) {
            addCriterion("HZRQ not in", values, "hzrq");
            return (Criteria) this;
        }

        public Criteria andHzrqIdBetween(Date value1, Date value2) {
            addCriterion("HZRQ between", value1, value2, "hzrq");
            return (Criteria) this;
        }

        public Criteria andHzrqIdNotBetween(Date value1, Date value2) {
            addCriterion("HZRQ not between", value1, value2, "hzrq");
            return (Criteria) this;
        }
        public Criteria andLastModifyNameIsNull() {
            addCriterion("LAST_MODIFY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameIsNotNull() {
            addCriterion("LAST_MODIFY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameEqualTo(String value) {
            addCriterion("LAST_MODIFY_NAME =", value, "lastModifyName");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameNotEqualTo(String value) {
            addCriterion("LAST_MODIFY_NAME <>", value, "LastModifyName");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameGreaterThan(String value) {
            addCriterion("LAST_MODIFY_NAME >", value, "lastModifyName");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFY_NAME >=", value, "lastModifyName");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameLessThan(String value) {
            addCriterion("LAST_MODIFY_NAME <", value, "lastModifyName");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameLessThanOrEqualTo(String value) {
            addCriterion("LAST_MODIFY_NAME <=", value, "lastModifyName");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameIdLike(String value) {
            addCriterion("LAST_MODIFY_NAME like", value, "lastModifyName");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameNotLike(String value) {
            addCriterion("LAST_MODIFY_NAME not like", value, "lastModifyName");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameIdIn(List<String> values) {
            addCriterion("LAST_MODIFY_NAME in", values, "lastModifyName");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameIdNotIn(List<String> values) {
            addCriterion("LAST_MODIFY_NAME not in", values, "lastModifyName");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameIdBetween(String value1, String value2) {
            addCriterion("LAST_MODIFY_NAME between", value1, value2, "lastModifyName");
            return (Criteria) this;
        }

        public Criteria andLastModifyNameIdNotBetween(String value1, String value2) {
            addCriterion("LAST_MODIFY_NAME not between", value1, value2, "lastModifyName");
            return (Criteria) this;
        }
        public Criteria andLastModifyTimeIsNull() {
            addCriterion("LAST_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIsNotNull() {
            addCriterion("LAST_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeEqualTo(Date value) {
            addCriterion("LAST_MODIFY_TIME =", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotEqualTo(Date value) {
            addCriterion("LAST_MODIFY_TIME <>", value, "LastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThan(Date value) {
            addCriterion("LAST_MODIFY_TIME >", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFY_TIME >=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThan(Date value) {
            addCriterion("LAST_MODIFY_TIME <", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_MODIFY_TIME <=", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIdLike(Date value) {
            addCriterion("LAST_MODIFY_TIME like", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeNotLike(Date value) {
            addCriterion("LAST_MODIFY_TIME not like", value, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIdIn(List<Date> values) {
            addCriterion("LAST_MODIFY_TIME in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIdNotIn(List<Date> values) {
            addCriterion("LAST_MODIFY_TIME not in", values, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIdBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFY_TIME between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        public Criteria andLastModifyTimeIdNotBetween(Date value1, Date value2) {
            addCriterion("LAST_MODIFY_TIME not between", value1, value2, "lastModifyTime");
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