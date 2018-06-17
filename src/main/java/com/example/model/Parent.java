package com.example.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Parent {

    private String parentString;

    private Child firstChild;

    private Child secondChild;

    public String getParentString() {
        return parentString;
    }

    public void setParentString(String parentString) {
        this.parentString = parentString;
    }

    public Child getFirstChild() {
        return firstChild;
    }

    public void setFirstChild(Child firstChild) {
        this.firstChild = firstChild;
    }

    public Child getSecondChild() {
        return secondChild;
    }

    public void setSecondChild(Child secondChild) {
        this.secondChild = secondChild;
    }
}
