/*
 * This file is generated by jOOQ.
 */
package com.jqtx.framework.generated.tables.records;


import com.jqtx.framework.generated.tables.DimDepartment;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DimDepartmentRecord extends UpdatableRecordImpl<DimDepartmentRecord> implements Record4<UInteger, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>toolkit.dim_department.id</code>.
     */
    public DimDepartmentRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.dim_department.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>toolkit.dim_department.code</code>.
     */
    public DimDepartmentRecord setCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.dim_department.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>toolkit.dim_department.pcode</code>.
     */
    public DimDepartmentRecord setPcode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.dim_department.pcode</code>.
     */
    public String getPcode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>toolkit.dim_department.name</code>.
     */
    public DimDepartmentRecord setName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.dim_department.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<UInteger, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<UInteger, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return DimDepartment.DIM_DEPARTMENT.ID;
    }

    @Override
    public Field<String> field2() {
        return DimDepartment.DIM_DEPARTMENT.CODE;
    }

    @Override
    public Field<String> field3() {
        return DimDepartment.DIM_DEPARTMENT.PCODE;
    }

    @Override
    public Field<String> field4() {
        return DimDepartment.DIM_DEPARTMENT.NAME;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getCode();
    }

    @Override
    public String component3() {
        return getPcode();
    }

    @Override
    public String component4() {
        return getName();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getCode();
    }

    @Override
    public String value3() {
        return getPcode();
    }

    @Override
    public String value4() {
        return getName();
    }

    @Override
    public DimDepartmentRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public DimDepartmentRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public DimDepartmentRecord value3(String value) {
        setPcode(value);
        return this;
    }

    @Override
    public DimDepartmentRecord value4(String value) {
        setName(value);
        return this;
    }

    @Override
    public DimDepartmentRecord values(UInteger value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DimDepartmentRecord
     */
    public DimDepartmentRecord() {
        super(DimDepartment.DIM_DEPARTMENT);
    }

    /**
     * Create a detached, initialised DimDepartmentRecord
     */
    public DimDepartmentRecord(UInteger id, String code, String pcode, String name) {
        super(DimDepartment.DIM_DEPARTMENT);

        setId(id);
        setCode(code);
        setPcode(pcode);
        setName(name);
    }
}
