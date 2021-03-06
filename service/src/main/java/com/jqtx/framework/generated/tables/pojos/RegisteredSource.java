/*
 * This file is generated by jOOQ.
 */
package com.jqtx.framework.generated.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.UByte;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RegisteredSource implements Serializable {

    private static final long serialVersionUID = 1L;

    private UInteger      id;
    private String        name;
    private UByte         type;
    private String        source;
    private Byte          structure;
    private String        remark;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    public RegisteredSource() {}

    public RegisteredSource(RegisteredSource value) {
        this.id = value.id;
        this.name = value.name;
        this.type = value.type;
        this.source = value.source;
        this.structure = value.structure;
        this.remark = value.remark;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public RegisteredSource(
        UInteger      id,
        String        name,
        UByte         type,
        String        source,
        Byte          structure,
        String        remark,
        LocalDateTime createTime,
        LocalDateTime updateTime
    ) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.source = source;
        this.structure = structure;
        this.remark = remark;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    /**
     * Getter for <code>toolkit.registered_source.id</code>.
     */
    public UInteger getId() {
        return this.id;
    }

    /**
     * Setter for <code>toolkit.registered_source.id</code>.
     */
    public RegisteredSource setId(UInteger id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>toolkit.registered_source.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>toolkit.registered_source.name</code>.
     */
    public RegisteredSource setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>toolkit.registered_source.type</code>. ?????????0-????????????1-?????????
     */
    public UByte getType() {
        return this.type;
    }

    /**
     * Setter for <code>toolkit.registered_source.type</code>. ?????????0-????????????1-?????????
     */
    public RegisteredSource setType(UByte type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>toolkit.registered_source.source</code>. ????????????/??????/????????????
     */
    public String getSource() {
        return this.source;
    }

    /**
     * Setter for <code>toolkit.registered_source.source</code>. ????????????/??????/????????????
     */
    public RegisteredSource setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Getter for <code>toolkit.registered_source.structure</code>. ?????????0-tree???1-flat
     */
    public Byte getStructure() {
        return this.structure;
    }

    /**
     * Setter for <code>toolkit.registered_source.structure</code>. ?????????0-tree???1-flat
     */
    public RegisteredSource setStructure(Byte structure) {
        this.structure = structure;
        return this;
    }

    /**
     * Getter for <code>toolkit.registered_source.remark</code>.
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * Setter for <code>toolkit.registered_source.remark</code>.
     */
    public RegisteredSource setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * Getter for <code>toolkit.registered_source.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>toolkit.registered_source.create_time</code>.
     */
    public RegisteredSource setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Getter for <code>toolkit.registered_source.update_time</code>.
     */
    public LocalDateTime getUpdateTime() {
        return this.updateTime;
    }

    /**
     * Setter for <code>toolkit.registered_source.update_time</code>.
     */
    public RegisteredSource setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RegisteredSource (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(type);
        sb.append(", ").append(source);
        sb.append(", ").append(structure);
        sb.append(", ").append(remark);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
