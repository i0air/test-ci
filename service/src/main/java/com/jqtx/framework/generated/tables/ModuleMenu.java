/*
 * This file is generated by jOOQ.
 */
package com.jqtx.framework.generated.tables;


import com.jqtx.framework.generated.Keys;
import com.jqtx.framework.generated.Toolkit;
import com.jqtx.framework.generated.tables.records.ModuleMenuRecord;

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
public class ModuleMenu extends TableImpl<ModuleMenuRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>toolkit.module_menu</code>
     */
    public static final ModuleMenu MODULE_MENU = new ModuleMenu();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ModuleMenuRecord> getRecordType() {
        return ModuleMenuRecord.class;
    }

    /**
     * The column <code>toolkit.module_menu.id</code>.
     */
    public final TableField<ModuleMenuRecord, UInteger> ID = createField(DSL.name("id"), SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>toolkit.module_menu.module_id</code>.
     */
    public final TableField<ModuleMenuRecord, UInteger> MODULE_ID = createField(DSL.name("module_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>toolkit.module_menu.menu_id</code>.
     */
    public final TableField<ModuleMenuRecord, UInteger> MENU_ID = createField(DSL.name("menu_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    private ModuleMenu(Name alias, Table<ModuleMenuRecord> aliased) {
        this(alias, aliased, null);
    }

    private ModuleMenu(Name alias, Table<ModuleMenuRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>toolkit.module_menu</code> table reference
     */
    public ModuleMenu(String alias) {
        this(DSL.name(alias), MODULE_MENU);
    }

    /**
     * Create an aliased <code>toolkit.module_menu</code> table reference
     */
    public ModuleMenu(Name alias) {
        this(alias, MODULE_MENU);
    }

    /**
     * Create a <code>toolkit.module_menu</code> table reference
     */
    public ModuleMenu() {
        this(DSL.name("module_menu"), null);
    }

    public <O extends Record> ModuleMenu(Table<O> child, ForeignKey<O, ModuleMenuRecord> key) {
        super(child, key, MODULE_MENU);
    }

    @Override
    public Schema getSchema() {
        return Toolkit.TOOLKIT;
    }

    @Override
    public Identity<ModuleMenuRecord, UInteger> getIdentity() {
        return (Identity<ModuleMenuRecord, UInteger>) super.getIdentity();
    }

    @Override
    public UniqueKey<ModuleMenuRecord> getPrimaryKey() {
        return Keys.KEY_MODULE_MENU_PRIMARY;
    }

    @Override
    public List<UniqueKey<ModuleMenuRecord>> getKeys() {
        return Arrays.<UniqueKey<ModuleMenuRecord>>asList(Keys.KEY_MODULE_MENU_PRIMARY);
    }

    @Override
    public ModuleMenu as(String alias) {
        return new ModuleMenu(DSL.name(alias), this);
    }

    @Override
    public ModuleMenu as(Name alias) {
        return new ModuleMenu(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ModuleMenu rename(String name) {
        return new ModuleMenu(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ModuleMenu rename(Name name) {
        return new ModuleMenu(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<UInteger, UInteger, UInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
