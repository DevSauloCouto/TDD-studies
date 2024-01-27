package com.data_structure.stack;

import com.data_structure.stack.exceptions.StackException;

public class Stack {

    private String[] elements;
    private Integer index = 0;

    public Stack(int size) {
        this.elements = new String[size];
    }

    public Boolean isEmpty() {
        return index == 0;
    }

    public Integer size() {
        return index;
    }

    public void stackUp(String element) {
        if (index == elements.length) {
            throw new StackException("Stack full: don't possible stack up element if the stack is full");
        }

        this.elements[index] = element;
        index++;
    }

    public String top() {
        return elements[index - 1];
    }

    public String unstack() {
        if (isEmpty()) {
            throw new StackException("Stack empty: don't possible unstack element");
        }
        String topElement = top();

        index--;

        return topElement;
    }

}
