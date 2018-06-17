package com.example.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Child {

    private String childString;

    private BigDecimal childBigDecimal;

    public String getChildString() {
        return childString;
    }

    public void setChildString(String childString) {
        this.childString = childString;
    }

    public BigDecimal getChildBigDecimal() {
        return childBigDecimal;
    }

    public void setChildBigDecimal(BigDecimal childBigDecimal) {
        this.childBigDecimal = childBigDecimal;
    }

}
