package com.code.arrays;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class multiplication {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Multiplication of the array element is : ");
        int mult = 1;
        for (int i = 0; i < arr.length; i++) {
            mult = mult * arr[i];
        }
        System.out.println(mult);

    }
}
