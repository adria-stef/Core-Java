package com.hackbulgaria.corejava.oopfun;

import java.util.Calendar;
import java.util.GregorianCalendar;

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
    
    private static Time now() {
                
        Calendar now = GregorianCalendar.getInstance();
        
        int dayNow = now.get(GregorianCalendar.DAY_OF_MONTH);
        int monthNow = now.get(GregorianCalendar.MONTH);
        int yearNow = now.get(GregorianCalendar.YEAR);
        
        int hourNow = now.get(GregorianCalendar.HOUR_OF_DAY);
        int minuteNow = now.get(GregorianCalendar.MINUTE);
        int secondNow = now.get(GregorianCalendar.SECOND);
        
        Time time = new Time(dayNow, monthNow, yearNow, hourNow, minuteNow, secondNow);
        return time;
    }

    @Override
    public String toString() {
        String formatedDate = String.format("%d:%d:%d %d.%d.%d", hour, minute, second, day, month, year);
        return formatedDate;
    }
}
