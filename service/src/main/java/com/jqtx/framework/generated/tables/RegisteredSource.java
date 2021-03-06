/*
 * This file is generated by jOOQ.
 */
package com.jqtx.framework.generated.tables;


import com.jqtx.framework.generated.Keys;
import com.jqtx.framework.generated.Toolkit;
import com.jqtx.framework.generated.tables.records.RegisteredSourceRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RegisteredSource extends TableImpl<RegisteredSourceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>toolkit.registered_source</code>
     */
    public static final RegisteredSource REGISTERED_SOURCE = new RegisteredSource();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RegisteredSourceRecord> getRecordType() {
        return RegisteredSourceRecord.class;
    }

    /**
     * The column <code>toolkit.registered_source.id</code>.
     */
    public final TableField<RegisteredSourceRecord, UInteger> ID = createField(DSL.name("id"), SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>toolkit.registered_source.name</code>.
     */
    public final TableField<RegisteredSourceRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>toolkit.registered_source.type</code>. 类型，0-自有表，1-外来表
     */
    public final TableField<RegisteredSourceRecord, UByte> TYPE = createField(DSL.name("type"), SQLDataType.TINYINTUNSIGNED.nullable(false), this, "类型，0-自有表，1-外来表");

    /**
     * The column <code>toolkit.registered_source.source</code>. 来源，表/文件/上游接口
     */
    public final TableField<RegisteredSourceRecord, String> SOURCE = createField(DSL.name("source"), SQLDataType.VARCHAR(255).nullable(false), this, "来源，表/文件/上游接口");

    /**
     * The column <code>toolkit.registered_source.structure</code>. 结构，0-tree，1-flat
     */
    public final TableField<RegisteredSourceRecord, Byte> STRUCTURE = createField(DSL.name("structure"), SQLDataType.TINYINT.nullable(false), this, "结构，0-tree，1-flat");

    /**
     * The column <code>toolkit.registered_source.remark</code>.
     */
    public final TableField<RegisteredSourceRecord, String> REMARK = createField(DSL.name("remark"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>toolkit.registered_source.create_time</code>.
     */
    public final TableField<RegisteredSourceRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    /**
     * The column <code>toolkit.registered_source.update_time</code>.
     */
    public final TableField<RegisteredSourceRecord, LocalDateTime> UPDATE_TIME = createField(DSL.name("update_time"), SQLDataType.LOCALDATETIME(0), this, "");

    private RegisteredSource(Name alias, Table<RegisteredSourceRecord> aliased) {
        this(alias, aliased, null);
    }

    private RegisteredSource(Name alias, Table<RegisteredSourceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>toolkit.registered_source</code> table reference
     */
    public RegisteredSource(String alias) {
        this(DSL.name(alias), REGISTERED_SOURCE);
    }

    /**
     * Create an aliased <code>toolkit.registered_source</code> table reference
     */
    public RegisteredSource(Name alias) {
        this(alias, REGISTERED_SOURCE);
    }

    /**
     * Create a <code>toolkit.registered_source</code> table reference
     */
    public RegisteredSource() {
        this(DSL.name("registered_source"), null);
    }

    public <O extends Record> RegisteredSource(Table<O> child, ForeignKey<O, RegisteredSourceRecord> key) {
        super(child, key, REGISTERED_SOURCE);
    }

    @Override
    public Schema getSchema() {
        return Toolkit.TOOLKIT;
    }

    @Override
    public Identity<RegisteredSourceRecord, UInteger> getIdentity() {
        return (Identity<RegisteredSourceRecord, UInteger>) super.getIdentity();
    }

    @Override
    public UniqueKey<RegisteredSourceRecord> getPrimaryKey() {
        return Keys.KEY_REGISTERED_SOURCE_PRIMARY;
    }

    @Override
    public List<UniqueKey<RegisteredSourceRecord>> getKeys() {
        return Arrays.<UniqueKey<RegisteredSourceRecord>>asList(Keys.KEY_REGISTERED_SOURCE_PRIMARY);
    }

    @Override
    public RegisteredSource as(String alias) {
        return new RegisteredSource(DSL.name(alias), this);
    }

    @Override
    public RegisteredSource as(Name alias) {
        return new RegisteredSource(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RegisteredSource rename(String name) {
        return new RegisteredSource(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RegisteredSource rename(Name name) {
        return new RegisteredSource(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<UInteger, String, UByte, String, Byte, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
