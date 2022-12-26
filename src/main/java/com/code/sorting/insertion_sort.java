package com.code.sorting;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class insertion_sort {
    //insertion sort
    private static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }

        System.out.println("Sorted array is : " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};
        insertionSort(arr);
    }
}
