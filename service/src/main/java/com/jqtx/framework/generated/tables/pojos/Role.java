/*
 * This file is generated by jOOQ.
 */
package com.jqtx.framework.generated.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    private UInteger      id;
    private String        parentCode;
    private String        code;
    private String        name;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    public Role() {}

    public Role(Role value) {
        this.id = value.id;
        this.parentCode = value.parentCode;
        this.code = value.code;
        this.name = value.name;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public Role(
        UInteger      id,
        String        parentCode,
        String        code,
        String        name,
        LocalDateTime createTime,
        LocalDateTime updateTime
    ) {
        this.id = id;
        this.parentCode = parentCode;
        this.code = code;
        this.name = name;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    /**
     * Getter for <code>toolkit.role.id</code>. 主键ID
     */
    public UInteger getId() {
        return this.id;
    }

    /**
     * Setter for <code>toolkit.role.id</code>. 主键ID
     */
    public Role setId(UInteger id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>toolkit.role.parent_code</code>. 父编码
     */
    public String getParentCode() {
        return this.parentCode;
    }

    /**
     * Setter for <code>toolkit.role.parent_code</code>. 父编码
     */
    public Role setParentCode(String parentCode) {
        this.parentCode = parentCode;
        return this;
    }

    /**
     * Getter for <code>toolkit.role.code</code>. 编码
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>toolkit.role.code</code>. 编码
     */
    public Role setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>toolkit.role.name</code>. 显示名
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>toolkit.role.name</code>. 显示名
     */
    public Role setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>toolkit.role.create_time</code>. 创建时间
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>toolkit.role.create_time</code>. 创建时间
     */
    public Role setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Getter for <code>toolkit.role.update_time</code>. 更新时间
     */
    public LocalDateTime getUpdateTime() {
        return this.updateTime;
    }

    /**
     * Setter for <code>toolkit.role.update_time</code>. 更新时间
     */
    public Role setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Role (");

        sb.append(id);
        sb.append(", ").append(parentCode);
        sb.append(", ").append(code);
        sb.append(", ").append(name);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}