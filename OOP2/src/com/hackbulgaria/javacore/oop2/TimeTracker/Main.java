package com.hackbulgaria.javacore.oop2.TimeTracker;

public class Main {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        TimeTracker timeTracker = new TimeTracker();
        timeTracker.start("aa");

        for (int i = 0; i < 100000; i++) {
            a = Math.cbrt(a);

        }

        timeTracker.finish("aa");

        timeTracker.start("bb");

        for (int i = 0; i < 1000; i++) {
            if (i % 100 == 0) {
                timeTracker.update("bb");
            }
            b = Math.cbrt(b);

        }

        timeTracker.finish("bb");

        System.out.println(timeTracker.getReport("aa"));
        System.out.println(timeTracker.getReport("bb"));

    }
}
