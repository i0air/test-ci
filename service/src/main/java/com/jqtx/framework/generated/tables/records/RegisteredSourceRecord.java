/*
 * This file is generated by jOOQ.
 */
package com.jqtx.framework.generated.tables.records;


import com.jqtx.framework.generated.tables.RegisteredSource;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RegisteredSourceRecord extends UpdatableRecordImpl<RegisteredSourceRecord> implements Record8<UInteger, String, UByte, String, Byte, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>toolkit.registered_source.id</code>.
     */
    public RegisteredSourceRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.registered_source.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>toolkit.registered_source.name</code>.
     */
    public RegisteredSourceRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.registered_source.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>toolkit.registered_source.type</code>. 类型，0-自有表，1-外来表
     */
    public RegisteredSourceRecord setType(UByte value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.registered_source.type</code>. 类型，0-自有表，1-外来表
     */
    public UByte getType() {
        return (UByte) get(2);
    }

    /**
     * Setter for <code>toolkit.registered_source.source</code>. 来源，表/文件/上游接口
     */
    public RegisteredSourceRecord setSource(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.registered_source.source</code>. 来源，表/文件/上游接口
     */
    public String getSource() {
        return (String) get(3);
    }

    /**
     * Setter for <code>toolkit.registered_source.structure</code>. 结构，0-tree，1-flat
     */
    public RegisteredSourceRecord setStructure(Byte value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.registered_source.structure</code>. 结构，0-tree，1-flat
     */
    public Byte getStructure() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>toolkit.registered_source.remark</code>.
     */
    public RegisteredSourceRecord setRemark(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.registered_source.remark</code>.
     */
    public String getRemark() {
        return (String) get(5);
    }

    /**
     * Setter for <code>toolkit.registered_source.create_time</code>.
     */
    public RegisteredSourceRecord setCreateTime(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.registered_source.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>toolkit.registered_source.update_time</code>.
     */
    public RegisteredSourceRecord setUpdateTime(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.registered_source.update_time</code>.
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<UInteger, String, UByte, String, Byte, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<UInteger, String, UByte, String, Byte, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return RegisteredSource.REGISTERED_SOURCE.ID;
    }

    @Override
    public Field<String> field2() {
        return RegisteredSource.REGISTERED_SOURCE.NAME;
    }

    @Override
    public Field<UByte> field3() {
        return RegisteredSource.REGISTERED_SOURCE.TYPE;
    }

    @Override
    public Field<String> field4() {
        return RegisteredSource.REGISTERED_SOURCE.SOURCE;
    }

    @Override
    public Field<Byte> field5() {
        return RegisteredSource.REGISTERED_SOURCE.STRUCTURE;
    }

    @Override
    public Field<String> field6() {
        return RegisteredSource.REGISTERED_SOURCE.REMARK;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return RegisteredSource.REGISTERED_SOURCE.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return RegisteredSource.REGISTERED_SOURCE.UPDATE_TIME;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public UByte component3() {
        return getType();
    }

    @Override
    public String component4() {
        return getSource();
    }

    @Override
    public Byte component5() {
        return getStructure();
    }

    @Override
    public String component6() {
        return getRemark();
    }

    @Override
    public LocalDateTime component7() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component8() {
        return getUpdateTime();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public UByte value3() {
        return getType();
    }

    @Override
    public String value4() {
        return getSource();
    }

    @Override
    public Byte value5() {
        return getStructure();
    }

    @Override
    public String value6() {
        return getRemark();
    }

    @Override
    public LocalDateTime value7() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value8() {
        return getUpdateTime();
    }

    @Override
    public RegisteredSourceRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public RegisteredSourceRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public RegisteredSourceRecord value3(UByte value) {
        setType(value);
        return this;
    }

    @Override
    public RegisteredSourceRecord value4(String value) {
        setSource(value);
        return this;
    }

    @Override
    public RegisteredSourceRecord value5(Byte value) {
        setStructure(value);
        return this;
    }

    @Override
    public RegisteredSourceRecord value6(String value) {
        setRemark(value);
        return this;
    }

    @Override
    public RegisteredSourceRecord value7(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public RegisteredSourceRecord value8(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    @Override
    public RegisteredSourceRecord values(UInteger value1, String value2, UByte value3, String value4, Byte value5, String value6, LocalDateTime value7, LocalDateTime value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RegisteredSourceRecord
     */
    public RegisteredSourceRecord() {
        super(RegisteredSource.REGISTERED_SOURCE);
    }

    /**
     * Create a detached, initialised RegisteredSourceRecord
     */
    public RegisteredSourceRecord(UInteger id, String name, UByte type, String source, Byte structure, String remark, LocalDateTime createTime, LocalDateTime updateTime) {
        super(RegisteredSource.REGISTERED_SOURCE);

        setId(id);
        setName(name);
        setType(type);
        setSource(source);
        setStructure(structure);
        setRemark(remark);
        setCreateTime(createTime);
        setUpdateTime(updateTime);
    }
}
