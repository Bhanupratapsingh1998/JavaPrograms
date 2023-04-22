package com.code.Q100.strings;

/**
 *
 * @author User
 */
public class SQLDateExample {

    public static void main(String[] args) {
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        System.out.println(date);
    }
}
