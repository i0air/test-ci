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
public class Dimension implements Serializable {

    private static final long serialVersionUID = 1L;

    private UInteger id;
    private String   regionCode;
    private String   deptCode;

    public Dimension() {}

    public Dimension(Dimension value) {
        this.id = value.id;
        this.regionCode = value.regionCode;
        this.deptCode = value.deptCode;
    }

    public Dimension(
        UInteger id,
        String   regionCode,
        String   deptCode
    ) {
        this.id = id;
        this.regionCode = regionCode;
        this.deptCode = deptCode;
    }

    /**
     * Getter for <code>toolkit.dimension.id</code>.
     */
    public UInteger getId() {
        return this.id;
    }

    /**
     * Setter for <code>toolkit.dimension.id</code>.
     */
    public Dimension setId(UInteger id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>toolkit.dimension.region_code</code>.
     */
    public String getRegionCode() {
        return this.regionCode;
    }

    /**
     * Setter for <code>toolkit.dimension.region_code</code>.
     */
    public Dimension setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * Getter for <code>toolkit.dimension.dept_code</code>.
     */
    public String getDeptCode() {
        return this.deptCode;
    }

    /**
     * Setter for <code>toolkit.dimension.dept_code</code>.
     */
    public Dimension setDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Dimension (");

        sb.append(id);
        sb.append(", ").append(regionCode);
        sb.append(", ").append(deptCode);

        sb.append(")");
        return sb.toString();
    }
}
