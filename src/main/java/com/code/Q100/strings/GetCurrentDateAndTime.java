/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.Q100.strings;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author User
 */
public class GetCurrentDateAndTime {

    public static void main(String args[]) {
        int day, month, year;
        int second, minute, hour;
        GregorianCalendar date = new GregorianCalendar();
        day = date.get(Calendar.DAY_OF_MONTH);
        month = date.get(Calendar.MONTH);
        year = date.get(Calendar.YEAR);
        second = date.get(Calendar.SECOND);
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR);
        System.out.println("Current date is " + day + "/" + (month + 1) + "/" + year);
        System.out.println("Current time is " + hour + " : " + minute + " : " + second);
    }
}
