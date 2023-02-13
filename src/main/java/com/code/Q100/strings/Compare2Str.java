package com.code.Q100.strings;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Compare2Str {

    public static void main(String[] args) {
        String str1, str2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first string");
        str1 = in.nextLine();

        System.out.println("Enter the second string");
        str2 = in.nextLine();

        if (str1.compareTo(str2) > 0) {
            System.out.println("First string is greater than second.");
        } else if (str1.compareTo(str2) < 0) {
            System.out.println("First string is smaller than second.");
        } else {
            System.out.println("Both strings are equal.");
        }
    }
}
