/*
 * This file is generated by jOOQ.
 */
package com.jqtx.framework.generated.tables.records;


import com.jqtx.framework.generated.tables.ModuleMenu;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ModuleMenuRecord extends UpdatableRecordImpl<ModuleMenuRecord> implements Record3<UInteger, UInteger, UInteger> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>toolkit.module_menu.id</code>.
     */
    public ModuleMenuRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.module_menu.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>toolkit.module_menu.module_id</code>.
     */
    public ModuleMenuRecord setModuleId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.module_menu.module_id</code>.
     */
    public UInteger getModuleId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>toolkit.module_menu.menu_id</code>.
     */
    public ModuleMenuRecord setMenuId(UInteger value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.module_menu.menu_id</code>.
     */
    public UInteger getMenuId() {
        return (UInteger) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<UInteger, UInteger, UInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<UInteger, UInteger, UInteger> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return ModuleMenu.MODULE_MENU.ID;
    }

    @Override
    public Field<UInteger> field2() {
        return ModuleMenu.MODULE_MENU.MODULE_ID;
    }

    @Override
    public Field<UInteger> field3() {
        return ModuleMenu.MODULE_MENU.MENU_ID;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public UInteger component2() {
        return getModuleId();
    }

    @Override
    public UInteger component3() {
        return getMenuId();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public UInteger value2() {
        return getModuleId();
    }

    @Override
    public UInteger value3() {
        return getMenuId();
    }

    @Override
    public ModuleMenuRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public ModuleMenuRecord value2(UInteger value) {
        setModuleId(value);
        return this;
    }

    @Override
    public ModuleMenuRecord value3(UInteger value) {
        setMenuId(value);
        return this;
    }

    @Override
    public ModuleMenuRecord values(UInteger value1, UInteger value2, UInteger value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ModuleMenuRecord
     */
    public ModuleMenuRecord() {
        super(ModuleMenu.MODULE_MENU);
    }

    /**
     * Create a detached, initialised ModuleMenuRecord
     */
    public ModuleMenuRecord(UInteger id, UInteger moduleId, UInteger menuId) {
        super(ModuleMenu.MODULE_MENU);

        setId(id);
        setModuleId(moduleId);
        setMenuId(menuId);
    }
}
