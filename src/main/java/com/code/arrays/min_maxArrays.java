package com.code.arrays;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class min_maxArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //this is a size of an array.
        int size = in.nextInt();
        int arr[] = new int[size];
        // to take use input of an array
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        //Using for loop
       /* for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }*/

        //using foreach loop
        for (int i : arr) {
            //to find array min element value
            if (i < min) {
                min = i;
            }

            //to find array max element value
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Array element of min is : " + min);
        System.out.println("Array element of max is : " + max);
    }
}
