package com.hackbulgaria.corejava.junithelloworld;

public class JunitHelloWorld {
    public static int getNumberOfDigits(int a) {

        int count = 1;
        
        while (a > 9 || a < -9) {
            count++;
            a /= 10;
        }
        
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }
}