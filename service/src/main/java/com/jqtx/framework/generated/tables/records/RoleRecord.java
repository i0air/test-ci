/*
 * This file is generated by jOOQ.
 */
package com.jqtx.framework.generated.tables.records;


import com.jqtx.framework.generated.tables.Role;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoleRecord extends UpdatableRecordImpl<RoleRecord> implements Record6<UInteger, Integer, String, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>toolkit.role.id</code>. 主键ID
     */
    public RoleRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.role.id</code>. 主键ID
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>toolkit.role.pid</code>. 父编码
     */
    public RoleRecord setPid(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.role.pid</code>. 父编码
     */
    public Integer getPid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>toolkit.role.code</code>. 编码
     */
    public RoleRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.role.code</code>. 编码
     */
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>toolkit.role.name</code>. 显示名
     */
    public RoleRecord setName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.role.name</code>. 显示名
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>toolkit.role.create_time</code>. 创建时间
     */
    public RoleRecord setCreateTime(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.role.create_time</code>. 创建时间
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>toolkit.role.update_time</code>. 更新时间
     */
    public RoleRecord setUpdateTime(LocalDateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.role.update_time</code>. 更新时间
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<UInteger, Integer, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<UInteger, Integer, String, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return Role.ROLE.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Role.ROLE.PID;
    }

    @Override
    public Field<String> field3() {
        return Role.ROLE.CODE;
    }

    @Override
    public Field<String> field4() {
        return Role.ROLE.NAME;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return Role.ROLE.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return Role.ROLE.UPDATE_TIME;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getPid();
    }

    @Override
    public String component3() {
        return getCode();
    }

    @Override
    public String component4() {
        return getName();
    }

    @Override
    public LocalDateTime component5() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component6() {
        return getUpdateTime();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getPid();
    }

    @Override
    public String value3() {
        return getCode();
    }

    @Override
    public String value4() {
        return getName();
    }

    @Override
    public LocalDateTime value5() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value6() {
        return getUpdateTime();
    }

    @Override
    public RoleRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public RoleRecord value2(Integer value) {
        setPid(value);
        return this;
    }

    @Override
    public RoleRecord value3(String value) {
        setCode(value);
        return this;
    }

    @Override
    public RoleRecord value4(String value) {
        setName(value);
        return this;
    }

    @Override
    public RoleRecord value5(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public RoleRecord value6(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    @Override
    public RoleRecord values(UInteger value1, Integer value2, String value3, String value4, LocalDateTime value5, LocalDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoleRecord
     */
    public RoleRecord() {
        super(Role.ROLE);
    }

    /**
     * Create a detached, initialised RoleRecord
     */
    public RoleRecord(UInteger id, Integer pid, String code, String name, LocalDateTime createTime, LocalDateTime updateTime) {
        super(Role.ROLE);

        setId(id);
        setPid(pid);
        setCode(code);
        setName(name);
        setCreateTime(createTime);
        setUpdateTime(updateTime);
    }
}
