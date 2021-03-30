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

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Toolkit extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>toolkit</code>
     */
    public static final Toolkit TOOLKIT = new Toolkit();

    /**
     * 自定义表
     */
    public final CustomTableField CUSTOM_TABLE_FIELD = CustomTableField.CUSTOM_TABLE_FIELD;

    /**
     * The table <code>toolkit.dim_department</code>.
     */
    public final DimDepartment DIM_DEPARTMENT = DimDepartment.DIM_DEPARTMENT;

    /**
     * The table <code>toolkit.dim_region</code>.
     */
    public final DimRegion DIM_REGION = DimRegion.DIM_REGION;

    /**
     * The table <code>toolkit.dimension</code>.
     */
    public final Dimension DIMENSION = Dimension.DIMENSION;

    /**
     * The table <code>toolkit.menu</code>.
     */
    public final Menu MENU = Menu.MENU;

    /**
     * The table <code>toolkit.module</code>.
     */
    public final Module MODULE = Module.MODULE;

    /**
     * The table <code>toolkit.module_menu</code>.
     */
    public final ModuleMenu MODULE_MENU = ModuleMenu.MODULE_MENU;

    /**
     * The table <code>toolkit.registered_source</code>.
     */
    public final RegisteredSource REGISTERED_SOURCE = RegisteredSource.REGISTERED_SOURCE;

    /**
     * The table <code>toolkit.role</code>.
     */
    public final Role ROLE = Role.ROLE;

    /**
     * The table <code>toolkit.role_module</code>.
     */
    public final RoleModule ROLE_MODULE = RoleModule.ROLE_MODULE;

    /**
     * The table <code>toolkit.role_registered_source</code>.
     */
    public final RoleRegisteredSource ROLE_REGISTERED_SOURCE = RoleRegisteredSource.ROLE_REGISTERED_SOURCE;

    /**
     * The table <code>toolkit.user</code>.
     */
    public final User USER = User.USER;

    /**
     * The table <code>toolkit.user_dimension</code>.
     */
    public final UserDimension USER_DIMENSION = UserDimension.USER_DIMENSION;

    /**
     * The table <code>toolkit.user_module</code>.
     */
    public final UserModule USER_MODULE = UserModule.USER_MODULE;

    /**
     * The table <code>toolkit.user_role</code>.
     */
    public final UserRole USER_ROLE = UserRole.USER_ROLE;

    /**
     * The table <code>toolkit.user_role_dimension</code>.
     */
    public final UserRoleDimension USER_ROLE_DIMENSION = UserRoleDimension.USER_ROLE_DIMENSION;

    /**
     * No further instances allowed
     */
    private Toolkit() {
        super("toolkit", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            CustomTableField.CUSTOM_TABLE_FIELD,
            DimDepartment.DIM_DEPARTMENT,
            DimRegion.DIM_REGION,
            Dimension.DIMENSION,
            Menu.MENU,
            Module.MODULE,
            ModuleMenu.MODULE_MENU,
            RegisteredSource.REGISTERED_SOURCE,
            Role.ROLE,
            RoleModule.ROLE_MODULE,
            RoleRegisteredSource.ROLE_REGISTERED_SOURCE,
            User.USER,
            UserDimension.USER_DIMENSION,
            UserModule.USER_MODULE,
            UserRole.USER_ROLE,
            UserRoleDimension.USER_ROLE_DIMENSION);
    }
}
