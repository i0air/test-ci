/*
 * This file is generated by jOOQ.
 */
package com.jqtx.framework.generated.tables.records;


import com.jqtx.framework.generated.tables.CustomTableField;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * 自定义表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomTableFieldRecord extends UpdatableRecordImpl<CustomTableFieldRecord> implements Record22<UInteger, UInteger, String, String, String, String, Integer, Integer, String, Integer, Boolean, String, Boolean, Integer, Boolean, Boolean, String, String, Boolean, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>toolkit.custom_table_field.ID</code>.
     */
    public CustomTableFieldRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.custom_table_field.ID</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>toolkit.custom_table_field.PID</code>. 上级字典ID，默认0
     */
    public CustomTableFieldRecord setPid(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.custom_table_field.PID</code>. 上级字典ID，默认0
     */
    public UInteger getPid() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>toolkit.custom_table_field.TABLE_NAME</code>. 字段所属表
     */
    public CustomTableFieldRecord setTableName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.custom_table_field.TABLE_NAME</code>. 字段所属表
     */
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>toolkit.custom_table_field.GROUP</code>. 字段分组
     */
    public CustomTableFieldRecord setGroup(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.custom_table_field.GROUP</code>. 字段分组
     */
    public String getGroup() {
        return (String) get(3);
    }

    /**
     * Setter for <code>toolkit.custom_table_field.TABLE_FIELD</code>. key（）
     */
    public CustomTableFieldRecord setTableField(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.custom_table_field.TABLE_FIELD</code>. key（）
     */
    public String getTableField() {
        return (String) get(4);
    }

    /**
     * Setter for <code>toolkit.custom_table_field.FIELD_NAME</code>. 字典名称（中文名称）
     */
    public CustomTableFieldRecord setFieldName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.custom_table_field.FIELD_NAME</code>. 字典名称（中文名称）
     */
    public String getFieldName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>toolkit.custom_table_field.DATA_TYPE</code>. 字段类型（1.int,2.double,3.time,4.string,5.IP类型）
     */
    public CustomTableFieldRecord setDataType(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.custom_table_field.DATA_TYPE</code>. 字段类型（1.int,2.double,3.time,4.string,5.IP类型）
     */
    public Integer getDataType() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>toolkit.custom_table_field.INPUT_TYPE</code>. 输入方式（1.文本输入,2.下拉选择）
     */
    public CustomTableFieldRecord setInputType(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.custom_table_field.INPUT_TYPE</code>. 输入方式（1.文本输入,2.下拉选择）
     */
    public Integer getInputType() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>toolkit.custom_table_field.RANGE</code>. 值范围,如1-100，(a,b,c)
     */
    public CustomTableFieldRecord setRange(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.custom_table_field.RANGE</code>. 值范围,如1-100，(a,b,c)
     */
    public String getRange() {
        return (String) get(8);
    }

    /**
     * Setter for <code>toolkit.custom_table_field.LENGTH</code>. 数据长度
     */
    public CustomTableFieldRecord setLength(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.custom_table_field.LENGTH</code>. 数据长度
     */
    public Integer getLength() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>toolkit.custom_table_field.NULLABLE</code>. 是否允许空
     */
    public CustomTableFieldRecord setNullable(Boolean value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.custom_table_field.NULLABLE</code>. 是否允许空
     */
    public Boolean getNullable() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>toolkit.custom_table_field.COMMENT</code>. 字段备注
     */
    public CustomTableFieldRecord setComment(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.custom_table_field.COMMENT</code>. 字段备注
     */
    public String getComment() {
        return (String) get(11);
    }

    /**
     * Setter for <code>toolkit.custom_table_field.EDITABLE</code>. 是否可以修改
     */
    public CustomTableFieldRecord setEditable(Boolean value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.custom_table_field.EDITABLE</code>. 是否可以修改
     */
    public Boolean getEditable() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>toolkit.custom_table_field.SEQ</code>. 序号
     */
    public CustomTableFieldRecord setSeq(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.custom_table_field.SEQ</code>. 序号
     */
    public Integer getSeq() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>toolkit.custom_table_field.SHOW_FORM</code>. 是否在表单中显示
     */
    public CustomTableFieldRecord setShowForm(Boolean value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.custom_table_field.SHOW_FORM</code>. 是否在表单中显示
     */
    public Boolean getShowForm() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>toolkit.custom_table_field.SHOW_LIST</code>. 是否在列表中显示
     */
    public CustomTableFieldRecord setShowList(Boolean value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.custom_table_field.SHOW_LIST</code>. 是否在列表中显示
     */
    public Boolean getShowList() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>toolkit.custom_table_field.ON_NOT_NULL</code>. 值不为空时需要强制输入的字段及值
     */
    public CustomTableFieldRecord setOnNotNull(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.custom_table_field.ON_NOT_NULL</code>. 值不为空时需要强制输入的字段及值
     */
    public String getOnNotNull() {
        return (String) get(16);
    }

    /**
     * Setter for <code>toolkit.custom_table_field.ON_VALUE_EQUAL</code>. 当值为指定值时需要强制输入的字段及值
     */
    public CustomTableFieldRecord setOnValueEqual(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.custom_table_field.ON_VALUE_EQUAL</code>. 当值为指定值时需要强制输入的字段及值
     */
    public String getOnValueEqual() {
        return (String) get(17);
    }

    /**
     * Setter for <code>toolkit.custom_table_field.UNIQUE</code>.
     */
    public CustomTableFieldRecord setUnique(Boolean value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.custom_table_field.UNIQUE</code>.
     */
    public Boolean getUnique() {
        return (Boolean) get(18);
    }

    /**
     * Setter for <code>toolkit.custom_table_field.LINK_TABLE</code>. 关联表
     */
    public CustomTableFieldRecord setLinkTable(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.custom_table_field.LINK_TABLE</code>. 关联表
     */
    public String getLinkTable() {
        return (String) get(19);
    }

    /**
     * Setter for <code>toolkit.custom_table_field.LINK_FIELD</code>. 关联字段
     */
    public CustomTableFieldRecord setLinkField(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.custom_table_field.LINK_FIELD</code>. 关联字段
     */
    public String getLinkField() {
        return (String) get(20);
    }

    /**
     * Setter for <code>toolkit.custom_table_field.LINK_SHOW_FIELD</code>. 关联显示字段
     */
    public CustomTableFieldRecord setLinkShowField(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>toolkit.custom_table_field.LINK_SHOW_FIELD</code>. 关联显示字段
     */
    public String getLinkShowField() {
        return (String) get(21);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row22<UInteger, UInteger, String, String, String, String, Integer, Integer, String, Integer, Boolean, String, Boolean, Integer, Boolean, Boolean, String, String, Boolean, String, String, String> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    @Override
    public Row22<UInteger, UInteger, String, String, String, String, Integer, Integer, String, Integer, Boolean, String, Boolean, Integer, Boolean, Boolean, String, String, Boolean, String, String, String> valuesRow() {
        return (Row22) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return CustomTableField.CUSTOM_TABLE_FIELD.ID;
    }

    @Override
    public Field<UInteger> field2() {
        return CustomTableField.CUSTOM_TABLE_FIELD.PID;
    }

    @Override
    public Field<String> field3() {
        return CustomTableField.CUSTOM_TABLE_FIELD.TABLE_NAME;
    }

    @Override
    public Field<String> field4() {
        return CustomTableField.CUSTOM_TABLE_FIELD.GROUP;
    }

    @Override
    public Field<String> field5() {
        return CustomTableField.CUSTOM_TABLE_FIELD.TABLE_FIELD;
    }

    @Override
    public Field<String> field6() {
        return CustomTableField.CUSTOM_TABLE_FIELD.FIELD_NAME;
    }

    @Override
    public Field<Integer> field7() {
        return CustomTableField.CUSTOM_TABLE_FIELD.DATA_TYPE;
    }

    @Override
    public Field<Integer> field8() {
        return CustomTableField.CUSTOM_TABLE_FIELD.INPUT_TYPE;
    }

    @Override
    public Field<String> field9() {
        return CustomTableField.CUSTOM_TABLE_FIELD.RANGE;
    }

    @Override
    public Field<Integer> field10() {
        return CustomTableField.CUSTOM_TABLE_FIELD.LENGTH;
    }

    @Override
    public Field<Boolean> field11() {
        return CustomTableField.CUSTOM_TABLE_FIELD.NULLABLE;
    }

    @Override
    public Field<String> field12() {
        return CustomTableField.CUSTOM_TABLE_FIELD.COMMENT;
    }

    @Override
    public Field<Boolean> field13() {
        return CustomTableField.CUSTOM_TABLE_FIELD.EDITABLE;
    }

    @Override
    public Field<Integer> field14() {
        return CustomTableField.CUSTOM_TABLE_FIELD.SEQ;
    }

    @Override
    public Field<Boolean> field15() {
        return CustomTableField.CUSTOM_TABLE_FIELD.SHOW_FORM;
    }

    @Override
    public Field<Boolean> field16() {
        return CustomTableField.CUSTOM_TABLE_FIELD.SHOW_LIST;
    }

    @Override
    public Field<String> field17() {
        return CustomTableField.CUSTOM_TABLE_FIELD.ON_NOT_NULL;
    }

    @Override
    public Field<String> field18() {
        return CustomTableField.CUSTOM_TABLE_FIELD.ON_VALUE_EQUAL;
    }

    @Override
    public Field<Boolean> field19() {
        return CustomTableField.CUSTOM_TABLE_FIELD.UNIQUE;
    }

    @Override
    public Field<String> field20() {
        return CustomTableField.CUSTOM_TABLE_FIELD.LINK_TABLE;
    }

    @Override
    public Field<String> field21() {
        return CustomTableField.CUSTOM_TABLE_FIELD.LINK_FIELD;
    }

    @Override
    public Field<String> field22() {
        return CustomTableField.CUSTOM_TABLE_FIELD.LINK_SHOW_FIELD;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public UInteger component2() {
        return getPid();
    }

    @Override
    public String component3() {
        return getTableName();
    }

    @Override
    public String component4() {
        return getGroup();
    }

    @Override
    public String component5() {
        return getTableField();
    }

    @Override
    public String component6() {
        return getFieldName();
    }

    @Override
    public Integer component7() {
        return getDataType();
    }

    @Override
    public Integer component8() {
        return getInputType();
    }

    @Override
    public String component9() {
        return getRange();
    }

    @Override
    public Integer component10() {
        return getLength();
    }

    @Override
    public Boolean component11() {
        return getNullable();
    }

    @Override
    public String component12() {
        return getComment();
    }

    @Override
    public Boolean component13() {
        return getEditable();
    }

    @Override
    public Integer component14() {
        return getSeq();
    }

    @Override
    public Boolean component15() {
        return getShowForm();
    }

    @Override
    public Boolean component16() {
        return getShowList();
    }

    @Override
    public String component17() {
        return getOnNotNull();
    }

    @Override
    public String component18() {
        return getOnValueEqual();
    }

    @Override
    public Boolean component19() {
        return getUnique();
    }

    @Override
    public String component20() {
        return getLinkTable();
    }

    @Override
    public String component21() {
        return getLinkField();
    }

    @Override
    public String component22() {
        return getLinkShowField();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public UInteger value2() {
        return getPid();
    }

    @Override
    public String value3() {
        return getTableName();
    }

    @Override
    public String value4() {
        return getGroup();
    }

    @Override
    public String value5() {
        return getTableField();
    }

    @Override
    public String value6() {
        return getFieldName();
    }

    @Override
    public Integer value7() {
        return getDataType();
    }

    @Override
    public Integer value8() {
        return getInputType();
    }

    @Override
    public String value9() {
        return getRange();
    }

    @Override
    public Integer value10() {
        return getLength();
    }

    @Override
    public Boolean value11() {
        return getNullable();
    }

    @Override
    public String value12() {
        return getComment();
    }

    @Override
    public Boolean value13() {
        return getEditable();
    }

    @Override
    public Integer value14() {
        return getSeq();
    }

    @Override
    public Boolean value15() {
        return getShowForm();
    }

    @Override
    public Boolean value16() {
        return getShowList();
    }

    @Override
    public String value17() {
        return getOnNotNull();
    }

    @Override
    public String value18() {
        return getOnValueEqual();
    }

    @Override
    public Boolean value19() {
        return getUnique();
    }

    @Override
    public String value20() {
        return getLinkTable();
    }

    @Override
    public String value21() {
        return getLinkField();
    }

    @Override
    public String value22() {
        return getLinkShowField();
    }

    @Override
    public CustomTableFieldRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public CustomTableFieldRecord value2(UInteger value) {
        setPid(value);
        return this;
    }

    @Override
    public CustomTableFieldRecord value3(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public CustomTableFieldRecord value4(String value) {
        setGroup(value);
        return this;
    }

    @Override
    public CustomTableFieldRecord value5(String value) {
        setTableField(value);
        return this;
    }

    @Override
    public CustomTableFieldRecord value6(String value) {
        setFieldName(value);
        return this;
    }

    @Override
    public CustomTableFieldRecord value7(Integer value) {
        setDataType(value);
        return this;
    }

    @Override
    public CustomTableFieldRecord value8(Integer value) {
        setInputType(value);
        return this;
    }

    @Override
    public CustomTableFieldRecord value9(String value) {
        setRange(value);
        return this;
    }

    @Override
    public CustomTableFieldRecord value10(Integer value) {
        setLength(value);
        return this;
    }

    @Override
    public CustomTableFieldRecord value11(Boolean value) {
        setNullable(value);
        return this;
    }

    @Override
    public CustomTableFieldRecord value12(String value) {
        setComment(value);
        return this;
    }

    @Override
    public CustomTableFieldRecord value13(Boolean value) {
        setEditable(value);
        return this;
    }

    @Override
    public CustomTableFieldRecord value14(Integer value) {
        setSeq(value);
        return this;
    }

    @Override
    public CustomTableFieldRecord value15(Boolean value) {
        setShowForm(value);
        return this;
    }

    @Override
    public CustomTableFieldRecord value16(Boolean value) {
        setShowList(value);
        return this;
    }

    @Override
    public CustomTableFieldRecord value17(String value) {
        setOnNotNull(value);
        return this;
    }

    @Override
    public CustomTableFieldRecord value18(String value) {
        setOnValueEqual(value);
        return this;
    }

    @Override
    public CustomTableFieldRecord value19(Boolean value) {
        setUnique(value);
        return this;
    }

    @Override
    public CustomTableFieldRecord value20(String value) {
        setLinkTable(value);
        return this;
    }

    @Override
    public CustomTableFieldRecord value21(String value) {
        setLinkField(value);
        return this;
    }

    @Override
    public CustomTableFieldRecord value22(String value) {
        setLinkShowField(value);
        return this;
    }

    @Override
    public CustomTableFieldRecord values(UInteger value1, UInteger value2, String value3, String value4, String value5, String value6, Integer value7, Integer value8, String value9, Integer value10, Boolean value11, String value12, Boolean value13, Integer value14, Boolean value15, Boolean value16, String value17, String value18, Boolean value19, String value20, String value21, String value22) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomTableFieldRecord
     */
    public CustomTableFieldRecord() {
        super(CustomTableField.CUSTOM_TABLE_FIELD);
    }

    /**
     * Create a detached, initialised CustomTableFieldRecord
     */
    public CustomTableFieldRecord(UInteger id, UInteger pid, String tableName, String group, String tableField, String fieldName, Integer dataType, Integer inputType, String range, Integer length, Boolean nullable, String comment, Boolean editable, Integer seq, Boolean showForm, Boolean showList, String onNotNull, String onValueEqual, Boolean unique, String linkTable, String linkField, String linkShowField) {
        super(CustomTableField.CUSTOM_TABLE_FIELD);

        setId(id);
        setPid(pid);
        setTableName(tableName);
        setGroup(group);
        setTableField(tableField);
        setFieldName(fieldName);
        setDataType(dataType);
        setInputType(inputType);
        setRange(range);
        setLength(length);
        setNullable(nullable);
        setComment(comment);
        setEditable(editable);
        setSeq(seq);
        setShowForm(showForm);
        setShowList(showList);
        setOnNotNull(onNotNull);
        setOnValueEqual(onValueEqual);
        setUnique(unique);
        setLinkTable(linkTable);
        setLinkField(linkField);
        setLinkShowField(linkShowField);
    }
}
