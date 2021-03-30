/*
 * This file is generated by jOOQ.
 */
package com.jqtx.framework.generated.tables;


import com.jqtx.framework.generated.Keys;
import com.jqtx.framework.generated.Toolkit;
import com.jqtx.framework.generated.tables.records.DimensionRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class Dimension extends TableImpl<DimensionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>toolkit.dimension</code>
     */
    public static final Dimension DIMENSION = new Dimension();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DimensionRecord> getRecordType() {
        return DimensionRecord.class;
    }

    /**
     * The column <code>toolkit.dimension.id</code>.
     */
    public final TableField<DimensionRecord, UInteger> ID = createField(DSL.name("id"), SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>toolkit.dimension.dept_code</code>.
     */
    public final TableField<DimensionRecord, String> DEPT_CODE = createField(DSL.name("dept_code"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>toolkit.dimension.region_lv0_code</code>.
     */
    public final TableField<DimensionRecord, String> REGION_LV0_CODE = createField(DSL.name("region_lv0_code"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>toolkit.dimension.region_lv1_code</code>.
     */
    public final TableField<DimensionRecord, String> REGION_LV1_CODE = createField(DSL.name("region_lv1_code"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>toolkit.dimension.region_lv2_code</code>.
     */
    public final TableField<DimensionRecord, String> REGION_LV2_CODE = createField(DSL.name("region_lv2_code"), SQLDataType.VARCHAR(50), this, "");

    private Dimension(Name alias, Table<DimensionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Dimension(Name alias, Table<DimensionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>toolkit.dimension</code> table reference
     */
    public Dimension(String alias) {
        this(DSL.name(alias), DIMENSION);
    }

    /**
     * Create an aliased <code>toolkit.dimension</code> table reference
     */
    public Dimension(Name alias) {
        this(alias, DIMENSION);
    }

    /**
     * Create a <code>toolkit.dimension</code> table reference
     */
    public Dimension() {
        this(DSL.name("dimension"), null);
    }

    public <O extends Record> Dimension(Table<O> child, ForeignKey<O, DimensionRecord> key) {
        super(child, key, DIMENSION);
    }

    @Override
    public Schema getSchema() {
        return Toolkit.TOOLKIT;
    }

    @Override
    public Identity<DimensionRecord, UInteger> getIdentity() {
        return (Identity<DimensionRecord, UInteger>) super.getIdentity();
    }

    @Override
    public UniqueKey<DimensionRecord> getPrimaryKey() {
        return Keys.KEY_DIMENSION_PRIMARY;
    }

    @Override
    public List<UniqueKey<DimensionRecord>> getKeys() {
        return Arrays.<UniqueKey<DimensionRecord>>asList(Keys.KEY_DIMENSION_PRIMARY);
    }

    @Override
    public Dimension as(String alias) {
        return new Dimension(DSL.name(alias), this);
    }

    @Override
    public Dimension as(Name alias) {
        return new Dimension(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Dimension rename(String name) {
        return new Dimension(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Dimension rename(Name name) {
        return new Dimension(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<UInteger, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
