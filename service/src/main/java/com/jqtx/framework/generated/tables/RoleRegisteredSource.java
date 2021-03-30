/*
 * This file is generated by jOOQ.
 */
package com.jqtx.framework.generated.tables;


import com.jqtx.framework.generated.Keys;
import com.jqtx.framework.generated.Toolkit;
import com.jqtx.framework.generated.tables.records.RoleRegisteredSourceRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoleRegisteredSource extends TableImpl<RoleRegisteredSourceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>toolkit.role_registered_source</code>
     */
    public static final RoleRegisteredSource ROLE_REGISTERED_SOURCE = new RoleRegisteredSource();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoleRegisteredSourceRecord> getRecordType() {
        return RoleRegisteredSourceRecord.class;
    }

    /**
     * The column <code>toolkit.role_registered_source.id</code>.
     */
    public final TableField<RoleRegisteredSourceRecord, UInteger> ID = createField(DSL.name("id"), SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>toolkit.role_registered_source.role_id</code>.
     */
    public final TableField<RoleRegisteredSourceRecord, UInteger> ROLE_ID = createField(DSL.name("role_id"), SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column <code>toolkit.role_registered_source.registered_id</code>.
     */
    public final TableField<RoleRegisteredSourceRecord, UInteger> REGISTERED_ID = createField(DSL.name("registered_id"), SQLDataType.INTEGERUNSIGNED, this, "");

    private RoleRegisteredSource(Name alias, Table<RoleRegisteredSourceRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoleRegisteredSource(Name alias, Table<RoleRegisteredSourceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>toolkit.role_registered_source</code> table reference
     */
    public RoleRegisteredSource(String alias) {
        this(DSL.name(alias), ROLE_REGISTERED_SOURCE);
    }

    /**
     * Create an aliased <code>toolkit.role_registered_source</code> table reference
     */
    public RoleRegisteredSource(Name alias) {
        this(alias, ROLE_REGISTERED_SOURCE);
    }

    /**
     * Create a <code>toolkit.role_registered_source</code> table reference
     */
    public RoleRegisteredSource() {
        this(DSL.name("role_registered_source"), null);
    }

    public <O extends Record> RoleRegisteredSource(Table<O> child, ForeignKey<O, RoleRegisteredSourceRecord> key) {
        super(child, key, ROLE_REGISTERED_SOURCE);
    }

    @Override
    public Schema getSchema() {
        return Toolkit.TOOLKIT;
    }

    @Override
    public Identity<RoleRegisteredSourceRecord, UInteger> getIdentity() {
        return (Identity<RoleRegisteredSourceRecord, UInteger>) super.getIdentity();
    }

    @Override
    public UniqueKey<RoleRegisteredSourceRecord> getPrimaryKey() {
        return Keys.KEY_ROLE_REGISTERED_SOURCE_PRIMARY;
    }

    @Override
    public List<UniqueKey<RoleRegisteredSourceRecord>> getKeys() {
        return Arrays.<UniqueKey<RoleRegisteredSourceRecord>>asList(Keys.KEY_ROLE_REGISTERED_SOURCE_PRIMARY);
    }

    @Override
    public RoleRegisteredSource as(String alias) {
        return new RoleRegisteredSource(DSL.name(alias), this);
    }

    @Override
    public RoleRegisteredSource as(Name alias) {
        return new RoleRegisteredSource(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleRegisteredSource rename(String name) {
        return new RoleRegisteredSource(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleRegisteredSource rename(Name name) {
        return new RoleRegisteredSource(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<UInteger, UInteger, UInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
