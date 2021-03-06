/*
 * This file is generated by jOOQ.
 */
package com.jqtx.framework.generated;


import com.jqtx.framework.generated.tables.CustomTableField;
import com.jqtx.framework.generated.tables.DimDepartment;
import com.jqtx.framework.generated.tables.DimRegion;
import com.jqtx.framework.generated.tables.Dimension;
import com.jqtx.framework.generated.tables.Menu;
import com.jqtx.framework.generated.tables.Module;
import com.jqtx.framework.generated.tables.ModuleMenu;
import com.jqtx.framework.generated.tables.RegisteredSource;
import com.jqtx.framework.generated.tables.Role;
import com.jqtx.framework.generated.tables.RoleModule;
import com.jqtx.framework.generated.tables.RoleRegisteredSource;
import com.jqtx.framework.generated.tables.User;
import com.jqtx.framework.generated.tables.UserDimension;
import com.jqtx.framework.generated.tables.UserModule;
import com.jqtx.framework.generated.tables.UserRole;
import com.jqtx.framework.generated.tables.UserRoleDimension;


/**
 * Convenience access to all tables in toolkit.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * 自定义表
     */
    public static final CustomTableField CUSTOM_TABLE_FIELD = CustomTableField.CUSTOM_TABLE_FIELD;

    /**
     * The table <code>toolkit.dim_department</code>.
     */
    public static final DimDepartment DIM_DEPARTMENT = DimDepartment.DIM_DEPARTMENT;

    /**
     * The table <code>toolkit.dim_region</code>.
     */
    public static final DimRegion DIM_REGION = DimRegion.DIM_REGION;

    /**
     * The table <code>toolkit.dimension</code>.
     */
    public static final Dimension DIMENSION = Dimension.DIMENSION;

    /**
     * The table <code>toolkit.menu</code>.
     */
    public static final Menu MENU = Menu.MENU;

    /**
     * The table <code>toolkit.module</code>.
     */
    public static final Module MODULE = Module.MODULE;

    /**
     * The table <code>toolkit.module_menu</code>.
     */
    public static final ModuleMenu MODULE_MENU = ModuleMenu.MODULE_MENU;

    /**
     * The table <code>toolkit.registered_source</code>.
     */
    public static final RegisteredSource REGISTERED_SOURCE = RegisteredSource.REGISTERED_SOURCE;

    /**
     * The table <code>toolkit.role</code>.
     */
    public static final Role ROLE = Role.ROLE;

    /**
     * The table <code>toolkit.role_module</code>.
     */
    public static final RoleModule ROLE_MODULE = RoleModule.ROLE_MODULE;

    /**
     * The table <code>toolkit.role_registered_source</code>.
     */
    public static final RoleRegisteredSource ROLE_REGISTERED_SOURCE = RoleRegisteredSource.ROLE_REGISTERED_SOURCE;

    /**
     * The table <code>toolkit.user</code>.
     */
    public static final User USER = User.USER;

    /**
     * The table <code>toolkit.user_dimension</code>.
     */
    public static final UserDimension USER_DIMENSION = UserDimension.USER_DIMENSION;

    /**
     * The table <code>toolkit.user_module</code>.
     */
    public static final UserModule USER_MODULE = UserModule.USER_MODULE;

    /**
     * The table <code>toolkit.user_role</code>.
     */
    public static final UserRole USER_ROLE = UserRole.USER_ROLE;

    /**
     * The table <code>toolkit.user_role_dimension</code>.
     */
    public static final UserRoleDimension USER_ROLE_DIMENSION = UserRoleDimension.USER_ROLE_DIMENSION;
}
