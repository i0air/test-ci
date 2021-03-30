/*
 * This file is generated by jOOQ.
 */
package com.jqtx.framework.generated.tables;


import com.jqtx.framework.generated.tables.records.DimDepartmentRecord;
import com.jqtx.framework.generated.Keys;
import com.jqtx.framework.generated.Toolkit;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class DimDepartment extends TableImpl<DimDepartmentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>toolkit.dim_department</code>
     */
    public static final DimDepartment DIM_DEPARTMENT = new DimDepartment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DimDepartmentRecord> getRecordType() {
        return DimDepartmentRecord.class;
    }

    /**
     * The column <code>toolkit.dim_department.id</code>.
     */
    public final TableField<DimDepartmentRecord, UInteger> ID = createField(DSL.name("id"), SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>toolkit.dim_department.code</code>.
     */
    public final TableField<DimDepartmentRecord, String> CODE = createField(DSL.name("code"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>toolkit.dim_department.pcode</code>.
     */
    public final TableField<DimDepartmentRecord, String> PCODE = createField(DSL.name("pcode"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>toolkit.dim_department.name</code>.
     */
    public final TableField<DimDepartmentRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    private DimDepartment(Name alias, Table<DimDepartmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private DimDepartment(Name alias, Table<DimDepartmentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>toolkit.dim_department</code> table reference
     */
    public DimDepartment(String alias) {
        this(DSL.name(alias), DIM_DEPARTMENT);
    }

    /**
     * Create an aliased <code>toolkit.dim_department</code> table reference
     */
    public DimDepartment(Name alias) {
        this(alias, DIM_DEPARTMENT);
    }

    /**
     * Create a <code>toolkit.dim_department</code> table reference
     */
    public DimDepartment() {
        this(DSL.name("dim_department"), null);
    }

    public <O extends Record> DimDepartment(Table<O> child, ForeignKey<O, DimDepartmentRecord> key) {
        super(child, key, DIM_DEPARTMENT);
    }

    @Override
    public Schema getSchema() {
        return Toolkit.TOOLKIT;
    }

    @Override
    public Identity<DimDepartmentRecord, UInteger> getIdentity() {
        return (Identity<DimDepartmentRecord, UInteger>) super.getIdentity();
    }

    @Override
    public UniqueKey<DimDepartmentRecord> getPrimaryKey() {
        return Keys.KEY_DIM_DEPARTMENT_PRIMARY;
    }

    @Override
    public List<UniqueKey<DimDepartmentRecord>> getKeys() {
        return Arrays.<UniqueKey<DimDepartmentRecord>>asList(Keys.KEY_DIM_DEPARTMENT_PRIMARY);
    }

    @Override
    public DimDepartment as(String alias) {
        return new DimDepartment(DSL.name(alias), this);
    }

    @Override
    public DimDepartment as(Name alias) {
        return new DimDepartment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DimDepartment rename(String name) {
        return new DimDepartment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DimDepartment rename(Name name) {
        return new DimDepartment(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<UInteger, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
