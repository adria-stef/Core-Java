package com.hackbulgaria.corejava.oopfun;

import java.util.Arrays;

public class StackImpl<T> implements Stack<T> {

    int size = 0;
    static final int DEFAULT_CAPACITY = 100;
    Object elements[];

    public StackImpl() {
        
        size = 0;
        elements = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void push(T t) {
        
        if (size == elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }

        elements[size++] = t;
    }

    @Override
    public Object pop() {

        Object value = elements[size];
        size--;
        return value;
    }

    @Override
    public int length() {

        return size;
    }

    @Override
    public void clear() {
        
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        
        return (size == 0);
    }

    @Override
    public Object peek() {
        
        return elements[size - 1];
    }

}
