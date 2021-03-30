/*
 * This file is generated by jOOQ.
 */
package com.jqtx.framework.generated.tables;


import com.jqtx.framework.generated.tables.records.UserRoleDimensionRecord;
import com.jqtx.framework.generated.Keys;
import com.jqtx.framework.generated.Toolkit;

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
public class UserRoleDimension extends TableImpl<UserRoleDimensionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>toolkit.user_role_dimension</code>
     */
    public static final UserRoleDimension USER_ROLE_DIMENSION = new UserRoleDimension();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRoleDimensionRecord> getRecordType() {
        return UserRoleDimensionRecord.class;
    }

    /**
     * The column <code>toolkit.user_role_dimension.id</code>.
     */
    public final TableField<UserRoleDimensionRecord, UInteger> ID = createField(DSL.name("id"), SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>toolkit.user_role_dimension.user_role_id</code>.
     */
    public final TableField<UserRoleDimensionRecord, UInteger> USER_ROLE_ID = createField(DSL.name("user_role_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>toolkit.user_role_dimension.dimension_id</code>.
     */
    public final TableField<UserRoleDimensionRecord, UInteger> DIMENSION_ID = createField(DSL.name("dimension_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    private UserRoleDimension(Name alias, Table<UserRoleDimensionRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserRoleDimension(Name alias, Table<UserRoleDimensionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>toolkit.user_role_dimension</code> table reference
     */
    public UserRoleDimension(String alias) {
        this(DSL.name(alias), USER_ROLE_DIMENSION);
    }

    /**
     * Create an aliased <code>toolkit.user_role_dimension</code> table reference
     */
    public UserRoleDimension(Name alias) {
        this(alias, USER_ROLE_DIMENSION);
    }

    /**
     * Create a <code>toolkit.user_role_dimension</code> table reference
     */
    public UserRoleDimension() {
        this(DSL.name("user_role_dimension"), null);
    }

    public <O extends Record> UserRoleDimension(Table<O> child, ForeignKey<O, UserRoleDimensionRecord> key) {
        super(child, key, USER_ROLE_DIMENSION);
    }

    @Override
    public Schema getSchema() {
        return Toolkit.TOOLKIT;
    }

    @Override
    public Identity<UserRoleDimensionRecord, UInteger> getIdentity() {
        return (Identity<UserRoleDimensionRecord, UInteger>) super.getIdentity();
    }

    @Override
    public UniqueKey<UserRoleDimensionRecord> getPrimaryKey() {
        return Keys.KEY_USER_ROLE_DIMENSION_PRIMARY;
    }

    @Override
    public List<UniqueKey<UserRoleDimensionRecord>> getKeys() {
        return Arrays.<UniqueKey<UserRoleDimensionRecord>>asList(Keys.KEY_USER_ROLE_DIMENSION_PRIMARY);
    }

    @Override
    public UserRoleDimension as(String alias) {
        return new UserRoleDimension(DSL.name(alias), this);
    }

    @Override
    public UserRoleDimension as(Name alias) {
        return new UserRoleDimension(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserRoleDimension rename(String name) {
        return new UserRoleDimension(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserRoleDimension rename(Name name) {
        return new UserRoleDimension(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<UInteger, UInteger, UInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}