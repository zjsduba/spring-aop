package com.example.springaop.tx.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 角色管理(OrgRole)实体类
 *
 * @author lsp
 * @since 2021-02-01 14:06:12
 */
public class OrgRole implements Serializable {
    private static final long serialVersionUID = 401984198300006365L;
    
    private String id_;
    //角色名称
    private String name_;
    //别名
    private String alias_;
    //0：禁用，1：启用
    private Integer enabled_;
    //描述
    private String description;
    //创建时间
    private Date createTime_;
    //创建人
    private String createBy_;
    //更新时间
    private Date updateTime_;
    //更新人
    private String updateBy_;
    //分类ID
    private String typeId_;
    //分类名字
    private String typeName_;


    public String getId_() {
        return id_;
    }

    public void setId_(String id_) {
        this.id_ = id_;
    }

    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public String getAlias_() {
        return alias_;
    }

    public void setAlias_(String alias_) {
        this.alias_ = alias_;
    }

    public Integer getEnabled_() {
        return enabled_;
    }

    public void setEnabled_(Integer enabled_) {
        this.enabled_ = enabled_;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime_() {
        return createTime_;
    }

    public void setCreateTime_(Date createTime_) {
        this.createTime_ = createTime_;
    }

    public String getCreateBy_() {
        return createBy_;
    }

    public void setCreateBy_(String createBy_) {
        this.createBy_ = createBy_;
    }

    public Date getUpdateTime_() {
        return updateTime_;
    }

    public void setUpdateTime_(Date updateTime_) {
        this.updateTime_ = updateTime_;
    }

    public String getUpdateBy_() {
        return updateBy_;
    }

    public void setUpdateBy_(String updateBy_) {
        this.updateBy_ = updateBy_;
    }

    public String getTypeId_() {
        return typeId_;
    }

    public void setTypeId_(String typeId_) {
        this.typeId_ = typeId_;
    }

    public String getTypeName_() {
        return typeName_;
    }

    public void setTypeName_(String typeName_) {
        this.typeName_ = typeName_;
    }

}