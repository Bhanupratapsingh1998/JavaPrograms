package com.dsa2024.may_24.day_13_05_24;

import java.util.*;

public class removeDulpicateSortedArr {

    /*
     * Brute Force
     * Time complexity: O(n*log(n))+O(n)
     * Space Complexity: O(n)
     */
    static int removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x : set) {
            arr[j++] = x;
        }
        return k;
    }

    /*
     * Optimal Approach
     * Two pointers
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    static int removeDuplicates1(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 3, 3 };
        int k = removeDuplicates1(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
