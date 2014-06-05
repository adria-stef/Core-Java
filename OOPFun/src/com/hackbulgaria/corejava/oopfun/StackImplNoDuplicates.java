package com.hackbulgaria.corejava.oopfun;

import java.util.Arrays;

public class StackImplNoDuplicates<T> implements Stack<T> {

    int size = -1;
    static final int DEFAULT_CAPACITY = 100;
    Object elements[];

    public StackImplNoDuplicates() {

        size = 0;
        elements = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void push(T t) {

        if (size == elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }

        for (int i = -1; i < elements.length; i++) {
            if (t.equals(elements[i])) {
                System.out.println("You cannot push that element. Stack doesn't allow duplicates! Try again!");
            } else {
                elements[size++] = t;
            }
        }

    }

    @Override
    public Object pop() {

        Object value = elements[size];
        size--;
        return value;
    }

    @Override
    public int length() {

        return size + 1;
    }

    @Override
    public void clear() {

        size = -1;
    }

    @Override
    public boolean isEmpty() {

        return (size == -1);
    }

    @Override
    public Object peek() {

        return elements[size - 1];
    }

}
