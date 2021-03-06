/*
 * This file is generated by jOOQ.
 */
package com.jqtx.framework.generated.tables;


import com.jqtx.framework.generated.Keys;
import com.jqtx.framework.generated.Toolkit;
import com.jqtx.framework.generated.tables.records.RoleModuleRecord;

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
public class RoleModule extends TableImpl<RoleModuleRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>toolkit.role_module</code>
     */
    public static final RoleModule ROLE_MODULE = new RoleModule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoleModuleRecord> getRecordType() {
        return RoleModuleRecord.class;
    }

    /**
     * The column <code>toolkit.role_module.id</code>.
     */
    public final TableField<RoleModuleRecord, UInteger> ID = createField(DSL.name("id"), SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>toolkit.role_module.role_id</code>.
     */
    public final TableField<RoleModuleRecord, Integer> ROLE_ID = createField(DSL.name("role_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>toolkit.role_module.module_id</code>.
     */
    public final TableField<RoleModuleRecord, UInteger> MODULE_ID = createField(DSL.name("module_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    private RoleModule(Name alias, Table<RoleModuleRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoleModule(Name alias, Table<RoleModuleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>toolkit.role_module</code> table reference
     */
    public RoleModule(String alias) {
        this(DSL.name(alias), ROLE_MODULE);
    }

    /**
     * Create an aliased <code>toolkit.role_module</code> table reference
     */
    public RoleModule(Name alias) {
        this(alias, ROLE_MODULE);
    }

    /**
     * Create a <code>toolkit.role_module</code> table reference
     */
    public RoleModule() {
        this(DSL.name("role_module"), null);
    }

    public <O extends Record> RoleModule(Table<O> child, ForeignKey<O, RoleModuleRecord> key) {
        super(child, key, ROLE_MODULE);
    }

    @Override
    public Schema getSchema() {
        return Toolkit.TOOLKIT;
    }

    @Override
    public Identity<RoleModuleRecord, UInteger> getIdentity() {
        return (Identity<RoleModuleRecord, UInteger>) super.getIdentity();
    }

    @Override
    public UniqueKey<RoleModuleRecord> getPrimaryKey() {
        return Keys.KEY_ROLE_MODULE_PRIMARY;
    }

    @Override
    public List<UniqueKey<RoleModuleRecord>> getKeys() {
        return Arrays.<UniqueKey<RoleModuleRecord>>asList(Keys.KEY_ROLE_MODULE_PRIMARY);
    }

    @Override
    public RoleModule as(String alias) {
        return new RoleModule(DSL.name(alias), this);
    }

    @Override
    public RoleModule as(Name alias) {
        return new RoleModule(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleModule rename(String name) {
        return new RoleModule(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleModule rename(Name name) {
        return new RoleModule(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<UInteger, Integer, UInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
