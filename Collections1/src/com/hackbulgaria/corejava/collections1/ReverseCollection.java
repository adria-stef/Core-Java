package com.hackbulgaria.corejava.collections1;

import java.util.Collection;
import java.util.Stack;

public class ReverseCollection {
    // <T>
    public static void reverse(Collection<Integer> argument) {

        Stack<Integer> stackOfInteger = new Stack<>();

        for (Integer item : argument) {
            stackOfInteger.push(item);
        }

        argument.clear();

        while(!stackOfInteger.isEmpty()) {
            argument.add(stackOfInteger.pop());
        }
    }
}
