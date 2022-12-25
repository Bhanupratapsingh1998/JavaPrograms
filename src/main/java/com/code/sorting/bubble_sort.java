package com.code.sorting;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class bubble_sort {

    private static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array is : "+Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {8, 7, 3, 2, 3, 1, 1, 2};
        sortArr(arr);
        
    }
}
