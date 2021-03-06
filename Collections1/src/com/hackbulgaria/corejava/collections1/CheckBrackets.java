package com.hackbulgaria.corejava.collections1;

import java.util.Stack;

public class CheckBrackets {

    public static boolean startsWithOpening(String s) {
        if (s.startsWith("(")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean endsWithClosing(String s) {
        if (s.endsWith(")")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean equalNumberOfBrackets(String s) {

        Stack<Character> stackOfCharackters = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) == '(') {
                stackOfCharackters.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (i != 0) {
                    stackOfCharackters.pop();
                } else {
                    return false;
                }
            } else {
                System.out.println("Invalid Input!!");
            }
        }
        return stackOfCharackters.isEmpty();
    }

    public static boolean openingFirst(String s) {

        Stack<Character> stackOfCharackters = new Stack<>();
        
        if (s.startsWith(")")) {
            return false;
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stackOfCharackters.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (!stackOfCharackters.isEmpty()) {
                    stackOfCharackters.pop();
                } else {
                    return false;
                }
            } else {
                System.out.println("Invalid Input!!");
            }
        }
        return true;
    }

    public static boolean check(String s) {

        if (startsWithOpening(s) && endsWithClosing(s) && equalNumberOfBrackets(s) && openingFirst(s)) {
            return true;
        } else {
            return false;
        }
    }
}
