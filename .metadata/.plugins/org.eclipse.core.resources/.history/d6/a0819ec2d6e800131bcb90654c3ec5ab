package com.hackbulgaria.corejava;

public class FaultyProblem4 {
    public static boolean areEqual(Integer e, Integer k) {
        k++; //becomes primitive int and then it becomes an Object again!!
        k--;
        return e.equals(k);
    }

    public static boolean areEqual(float a, float b) {
        if(Math.abs(a - b) < 0.00001) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean haveEqualSubstrings(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            String substringA = a.substring(i, a.length());
            String substringB = b.substring(i, a.length());
            if (substringA.equals(substringB)){
                return true;
            }
        }
        return false;
    }
}
