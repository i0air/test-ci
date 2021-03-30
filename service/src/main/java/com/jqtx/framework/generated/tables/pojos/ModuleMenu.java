/*
 * This file is generated by jOOQ.
 */
package com.jqtx.framework.generated.tables.pojos;


import java.io.Serializable;

import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ModuleMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    private UInteger id;
    private UInteger moduleId;
    private UInteger menuId;

    public ModuleMenu() {}

    public ModuleMenu(ModuleMenu value) {
        this.id = value.id;
        this.moduleId = value.moduleId;
        this.menuId = value.menuId;
    }

    public ModuleMenu(
        UInteger id,
        UInteger moduleId,
        UInteger menuId
    ) {
        this.id = id;
        this.moduleId = moduleId;
        this.menuId = menuId;
    }

    /**
     * Getter for <code>toolkit.module_menu.id</code>.
     */
    public UInteger getId() {
        return this.id;
    }

    /**
     * Setter for <code>toolkit.module_menu.id</code>.
     */
    public ModuleMenu setId(UInteger id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>toolkit.module_menu.module_id</code>.
     */
    public UInteger getModuleId() {
        return this.moduleId;
    }

    /**
     * Setter for <code>toolkit.module_menu.module_id</code>.
     */
    public ModuleMenu setModuleId(UInteger moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    /**
     * Getter for <code>toolkit.module_menu.menu_id</code>.
     */
    public UInteger getMenuId() {
        return this.menuId;
    }

    /**
     * Setter for <code>toolkit.module_menu.menu_id</code>.
     */
    public ModuleMenu setMenuId(UInteger menuId) {
        this.menuId = menuId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ModuleMenu (");

        sb.append(id);
        sb.append(", ").append(moduleId);
        sb.append(", ").append(menuId);

        sb.append(")");
        return sb.toString();
    }
}
