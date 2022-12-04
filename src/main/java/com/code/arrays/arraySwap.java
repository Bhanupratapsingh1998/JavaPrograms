package com.code.arrays;


import java.util.Arrays;

/**
 *
 * @author User
 */
public class arraySwap {

    public static void main(String[] args) {
        int arr[] = {1, 3, 8, 12, 15};
//        swap(arr, 0, 4);
//        System.out.println(Arrays.toString(arr));
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }

//    static void reverseArr(int arr[]) {
//        int start = 0;
//        int end = arr.length - 1;
//        while (start < end) {
//            swap(arr,start,end);
//            start++;
//            end--;
//        }
//
//    }
    static void reverseArr(int arr[]) {
        int end = arr.length - 1;
        for (int start = 0; start < end; start++) {
            swap(arr, start, end);
            end--;
        }

    }

    static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
