package com.hackbulgaria.javacore.exam1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Utils {

    public static List<Integer> sort(List<Integer> unsortedList) {

        List<Integer> sortedList = new ArrayList<>(unsortedList);

        boolean ifSwapped = true;
        int temp;

        while (ifSwapped) {
            ifSwapped = false;

            for (int index = 0; index < sortedList.size() - 1; index++) {

                if (sortedList.get(index) > sortedList.get(index + 1)) {

                    temp = sortedList.get(index);
                    sortedList.set(index, sortedList.get(index + 1));
                    sortedList.set(index + 1, temp);
                    ifSwapped = true;
                }
            }
        }
        return sortedList;
    }

    public static List<Integer> reverse(List<Integer> argument) {

        List<Integer> reversedList;
        reversedList = argument;

        Stack<Integer> stackOfInteger = new Stack<>();

        for (Integer item : reversedList) {
            stackOfInteger.push(item);
        }

        reversedList.clear();

        while (!stackOfInteger.isEmpty()) {
            reversedList.add(stackOfInteger.pop());
        }
        return reversedList;
    }

    public static boolean isMonotonic(List<Integer> list) {

        boolean check = false;
        if (list.get(0) < list.get(1)) {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) <= list.get(i + 1)) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
            return check;
        } else {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) >= list.get(i + 1)) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
            return check;
        }
    }
}