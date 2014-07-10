package com.hackbulgaria.corejava.oopfun;

import java.util.LinkedList;

public class StackImplementationLinkedList<T> extends LinkedList<T> implements Stack<T> {
    private static final long serialVersionUID = 1L;

    @Override
    public void push(T t) {
        addLast(t);
    }

    @Override
    public T pop() {
        return removeLast();
    }

    @Override
    public int length() {
        return size();
    }

    @Override
    public void clear() {
        while (this.length() != 0) {
            removeLast();
        }
    }

    @Override
    public boolean isEmpty() {
        if (this.length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public T peek() {
        return getLast();
    }

    public static void main(String[] args) {
        StackImplementationLinkedList<Integer> linkedStack = new StackImplementationLinkedList<>();
        linkedStack.push(3);
        linkedStack.push(4);
        linkedStack.push(5);
        System.out.println(linkedStack.peek());
        linkedStack.length();
        linkedStack.pop();
        System.out.println(linkedStack.toString());
        linkedStack.isEmpty();
        System.out.println(linkedStack.isEmpty());
        linkedStack.clear();
        linkedStack.isEmpty();
        System.out.println(linkedStack.isEmpty());

        System.out.println(linkedStack.toString());
    }
}
