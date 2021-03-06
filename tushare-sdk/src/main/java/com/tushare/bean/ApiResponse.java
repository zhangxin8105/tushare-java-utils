package com.tushare.bean;

import joinery.DataFrame;

import java.awt.dnd.DropTarget;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 *
 */
public class ApiResponse {

    private String code;

    private String msg;

    private List<String> fields;

    private List<String[]> items;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public List<String[]> getItems() {
        return items;
    }

    public void setItems(List<String[]> items) {
        this.items = items;
    }

    public DataFrame getDataFrame(){
        DataFrame dataFrame = new DataFrame((Collection)fields);
        for(String [] row : items){
            dataFrame.append(Arrays.asList(row));
        }
        return  dataFrame;
    }

}
