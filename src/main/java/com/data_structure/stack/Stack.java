package com.data_structure.stack;

public class Stack {

    private String elements;
    private Integer quantity = 0;

    public Boolean isEmpty() {
        return elements == null;
    }

    public Integer size() {
        return quantity;
    }

    public void stackUp(String element) {
        this.elements = element;
        quantity++;
    }

    public String firstElement() {
        return elements;
    }

}
