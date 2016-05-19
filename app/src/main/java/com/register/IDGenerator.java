package com.register;

import java.util.Calendar;

/**
 * Created by apple on 16/5/14.
 */
public class IDGenerator {

    Calendar time;
    int year;
    int month;
    int day;
    int hour;
    int minute;
    String ID;

    void IDGenerator(){
        time=Calendar.getInstance();
        year=Calendar.YEAR;
        month=Calendar.MONTH+1;
        day=Calendar.DAY_OF_MONTH;
        hour=Calendar.HOUR_OF_DAY;
        minute=Calendar.MINUTE;
        ID="";
        ID+=Integer.toString(year);
        ID+=Integer.toString(month);
        ID+=Integer.toString(day);
        ID+=Integer.toString(hour);
        ID+=Integer.toString(minute);
    }

    public Calendar getTime() {
        return time;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String getID() {
        return ID;
    }
}
