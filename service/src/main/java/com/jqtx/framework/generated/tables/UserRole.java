/*
 * This file is generated by jOOQ.
 */
package com.jqtx.framework.generated.tables;


import com.jqtx.framework.generated.Keys;
import com.jqtx.framework.generated.Toolkit;
import com.jqtx.framework.generated.tables.records.UserRoleRecord;

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
public class UserRole extends TableImpl<UserRoleRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>toolkit.user_role</code>
     */
    public static final UserRole USER_ROLE = new UserRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRoleRecord> getRecordType() {
        return UserRoleRecord.class;
    }

    /**
     * The column <code>toolkit.user_role.id</code>.
     */
    public final TableField<UserRoleRecord, UInteger> ID = createField(DSL.name("id"), SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>toolkit.user_role.user_id</code>.
     */
    public final TableField<UserRoleRecord, UInteger> USER_ID = createField(DSL.name("user_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>toolkit.user_role.role_id</code>.
     */
    public final TableField<UserRoleRecord, UInteger> ROLE_ID = createField(DSL.name("role_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    private UserRole(Name alias, Table<UserRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserRole(Name alias, Table<UserRoleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>toolkit.user_role</code> table reference
     */
    public UserRole(String alias) {
        this(DSL.name(alias), USER_ROLE);
    }

    /**
     * Create an aliased <code>toolkit.user_role</code> table reference
     */
    public UserRole(Name alias) {
        this(alias, USER_ROLE);
    }

    /**
     * Create a <code>toolkit.user_role</code> table reference
     */
    public UserRole() {
        this(DSL.name("user_role"), null);
    }

    public <O extends Record> UserRole(Table<O> child, ForeignKey<O, UserRoleRecord> key) {
        super(child, key, USER_ROLE);
    }

    @Override
    public Schema getSchema() {
        return Toolkit.TOOLKIT;
    }

    @Override
    public Identity<UserRoleRecord, UInteger> getIdentity() {
        return (Identity<UserRoleRecord, UInteger>) super.getIdentity();
    }

    @Override
    public UniqueKey<UserRoleRecord> getPrimaryKey() {
        return Keys.KEY_USER_ROLE_PRIMARY;
    }

    @Override
    public List<UniqueKey<UserRoleRecord>> getKeys() {
        return Arrays.<UniqueKey<UserRoleRecord>>asList(Keys.KEY_USER_ROLE_PRIMARY);
    }

    @Override
    public UserRole as(String alias) {
        return new UserRole(DSL.name(alias), this);
    }

    @Override
    public UserRole as(Name alias) {
        return new UserRole(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserRole rename(String name) {
        return new UserRole(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserRole rename(Name name) {
        return new UserRole(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<UInteger, UInteger, UInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
