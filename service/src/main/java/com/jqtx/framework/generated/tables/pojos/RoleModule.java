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
public class RoleModule implements Serializable {

    private static final long serialVersionUID = 1L;

    private UInteger id;
    private Integer  roleId;
    private UInteger moduleId;

    public RoleModule() {}

    public RoleModule(RoleModule value) {
        this.id = value.id;
        this.roleId = value.roleId;
        this.moduleId = value.moduleId;
    }

    public RoleModule(
        UInteger id,
        Integer  roleId,
        UInteger moduleId
    ) {
        this.id = id;
        this.roleId = roleId;
        this.moduleId = moduleId;
    }

    /**
     * Getter for <code>toolkit.role_module.id</code>.
     */
    public UInteger getId() {
        return this.id;
    }

    /**
     * Setter for <code>toolkit.role_module.id</code>.
     */
    public RoleModule setId(UInteger id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>toolkit.role_module.role_id</code>.
     */
    public Integer getRoleId() {
        return this.roleId;
    }

    /**
     * Setter for <code>toolkit.role_module.role_id</code>.
     */
    public RoleModule setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * Getter for <code>toolkit.role_module.module_id</code>.
     */
    public UInteger getModuleId() {
        return this.moduleId;
    }

    /**
     * Setter for <code>toolkit.role_module.module_id</code>.
     */
    public RoleModule setModuleId(UInteger moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RoleModule (");

        sb.append(id);
        sb.append(", ").append(roleId);
        sb.append(", ").append(moduleId);

        sb.append(")");
        return sb.toString();
    }
}
