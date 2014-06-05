package com.hackbulgaria.corejava.oopfun;

public interface Stack<T> {

    //public is not needed, everything in an interface is public 
    void push(T t);

    Object pop();

    int length();

    void clear();

    boolean isEmpty();

    Object peek();

}
