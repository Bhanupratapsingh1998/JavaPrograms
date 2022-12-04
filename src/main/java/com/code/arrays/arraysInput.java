package com.code.arrays;


import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author User
 */
public class arraysInput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Array is : " + arr[i]);
//        }
//        for (int num : arr) {
//            System.out.print(num + " "); // here num represents the element of the array
//        }
        System.out.print(Arrays.toString(arr));
    }
}
