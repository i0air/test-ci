/*
 * This file is generated by jOOQ.
 */
package com.jqtx.framework.generated.tables;


import com.jqtx.framework.generated.Toolkit;
import com.jqtx.framework.generated.tables.records.MenuRecord;
import com.jqtx.framework.generated.Keys;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
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
public class Menu extends TableImpl<MenuRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>toolkit.menu</code>
     */
    public static final Menu MENU = new Menu();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MenuRecord> getRecordType() {
        return MenuRecord.class;
    }

    /**
     * The column <code>toolkit.menu.id</code>. 主键ID
     */
    public final TableField<MenuRecord, UInteger> ID = createField(DSL.name("id"), SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "主键ID");

    /**
     * The column <code>toolkit.menu.type</code>. 类型：0-menu, 1-folder, 2-button
     */
    public final TableField<MenuRecord, UByte> TYPE = createField(DSL.name("type"), SQLDataType.TINYINTUNSIGNED.nullable(false), this, "类型：0-menu, 1-folder, 2-button");

    /**
     * The column <code>toolkit.menu.parent_name</code>. 父级名称
     */
    public final TableField<MenuRecord, String> PARENT_NAME = createField(DSL.name("parent_name"), SQLDataType.VARCHAR(50), this, "父级名称");

    /**
     * The column <code>toolkit.menu.name</code>. 名称
     */
    public final TableField<MenuRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(50).nullable(false), this, "名称");

    /**
     * The column <code>toolkit.menu.path</code>. 路由/行为码
     */
    public final TableField<MenuRecord, String> PATH = createField(DSL.name("path"), SQLDataType.VARCHAR(255).nullable(false), this, "路由/行为码");

    /**
     * The column <code>toolkit.menu.redirect</code>. 动态跳转地址
     */
    public final TableField<MenuRecord, String> REDIRECT = createField(DSL.name("redirect"), SQLDataType.VARCHAR(255), this, "动态跳转地址");

    /**
     * The column <code>toolkit.menu.meta</code>. 页面/按钮标题
{
  "title": "页面/按钮标题",
  "icon": "图标",
  "url": "外链地址",
  "is_external_link": false
}
     */
    public final TableField<MenuRecord, String> META = createField(DSL.name("meta"), SQLDataType.VARCHAR(4000), this, "页面/按钮标题\r\n{\r\n  \"title\": \"页面/按钮标题\",\r\n  \"icon\": \"图标\",\r\n  \"url\": \"外链地址\",\r\n  \"is_external_link\": false\r\n}");

    /**
     * The column <code>toolkit.menu.no_auth_behavior</code>. 无权限行为，0-隐藏，1-禁用，2-提示
     */
    public final TableField<MenuRecord, UByte> NO_AUTH_BEHAVIOR = createField(DSL.name("no_auth_behavior"), SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINTUNSIGNED)), this, "无权限行为，0-隐藏，1-禁用，2-提示");

    /**
     * The column <code>toolkit.menu.is_enabled</code>. 是否启用，0-禁用，1-启用
     */
    public final TableField<MenuRecord, Boolean> IS_ENABLED = createField(DSL.name("is_enabled"), SQLDataType.BIT.nullable(false).defaultValue(DSL.inline("b'1'", SQLDataType.BIT)), this, "是否启用，0-禁用，1-启用");

    /**
     * The column <code>toolkit.menu.sort_id</code>. 菜单排序
     */
    public final TableField<MenuRecord, UInteger> SORT_ID = createField(DSL.name("sort_id"), SQLDataType.INTEGERUNSIGNED, this, "菜单排序");

    /**
     * The column <code>toolkit.menu.create_time</code>. 创建时间，默认当前
     */
    public final TableField<MenuRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "创建时间，默认当前");

    /**
     * The column <code>toolkit.menu.update_time</code>. 更新时间
     */
    public final TableField<MenuRecord, LocalDateTime> UPDATE_TIME = createField(DSL.name("update_time"), SQLDataType.LOCALDATETIME(0), this, "更新时间");

    private Menu(Name alias, Table<MenuRecord> aliased) {
        this(alias, aliased, null);
    }

    private Menu(Name alias, Table<MenuRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>toolkit.menu</code> table reference
     */
    public Menu(String alias) {
        this(DSL.name(alias), MENU);
    }

    /**
     * Create an aliased <code>toolkit.menu</code> table reference
     */
    public Menu(Name alias) {
        this(alias, MENU);
    }

    /**
     * Create a <code>toolkit.menu</code> table reference
     */
    public Menu() {
        this(DSL.name("menu"), null);
    }

    public <O extends Record> Menu(Table<O> child, ForeignKey<O, MenuRecord> key) {
        super(child, key, MENU);
    }

    @Override
    public Schema getSchema() {
        return Toolkit.TOOLKIT;
    }

    @Override
    public Identity<MenuRecord, UInteger> getIdentity() {
        return (Identity<MenuRecord, UInteger>) super.getIdentity();
    }

    @Override
    public UniqueKey<MenuRecord> getPrimaryKey() {
        return Keys.KEY_MENU_PRIMARY;
    }

    @Override
    public List<UniqueKey<MenuRecord>> getKeys() {
        return Arrays.<UniqueKey<MenuRecord>>asList(Keys.KEY_MENU_PRIMARY);
    }

    @Override
    public Menu as(String alias) {
        return new Menu(DSL.name(alias), this);
    }

    @Override
    public Menu as(Name alias) {
        return new Menu(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Menu rename(String name) {
        return new Menu(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Menu rename(Name name) {
        return new Menu(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<UInteger, UByte, String, String, String, String, String, UByte, Boolean, UInteger, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}