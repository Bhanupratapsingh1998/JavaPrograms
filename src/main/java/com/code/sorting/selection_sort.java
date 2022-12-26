package com.code.sorting;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class selection_sort {
//    selectionSort
    private static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted array is : " + Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};
        selectionSort(arr);
    }
}
