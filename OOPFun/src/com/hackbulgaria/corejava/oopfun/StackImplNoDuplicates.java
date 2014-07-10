package com.hackbulgaria.corejava.oopfun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StackImplNoDuplicates<T> implements Stack<T> {

    int size = 0;
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

        List<Object> array = new ArrayList<>(Arrays.asList(elements));

        if (array.contains(t)) {
            System.out.println("You cannot push that element. Stack doesn't allow duplicates! Try again!");
        } else {
            elements[size++] = t;
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

    @Override
    public String toString() {
        String stackString = "";
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                stackString += elements[i].toString();
                stackString += " ";
            } else {
                stackString += elements[i].toString();
            }
        }
        return stackString;
    }
}
