package com.code.arrays;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class frequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to find!");
        int element = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("found at [" + i + "] => " + element);
            }
        }
    }
}
