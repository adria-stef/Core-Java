package com.hackbulgaria.corejava.oopfun;

import java.util.Calendar;

public class Time {
    
    public Time() {
        super();
    }

    public Time(int day, int month, int year, int hour, int minute, int second) {
        super();

        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    Calendar calendar = Calendar.getInstance();
    
    int day = calendar.get(Calendar.DAY_OF_MONTH);
    int month = calendar.get(Calendar.MONTH);
    int year = calendar.get(Calendar.YEAR);
    
    int hour = calendar.get(Calendar.HOUR_OF_DAY);
    int minute = calendar.get(Calendar.MINUTE);
    int second = calendar.get(Calendar.SECOND);
    
    @Override
    public String toString() {
        String formatedDate = String.format("%d:%d:%d %d.%d.%d", hour, minute, second, day, month, year);
        return formatedDate;
    }
    
}
