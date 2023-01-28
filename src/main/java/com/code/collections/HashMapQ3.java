package com.code.collections;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author User
 */
public class HashMapQ3 {

    public static int intersection(int arr1[], int arr2[]) {
        int count = 0;
//        int arr3[] = new int[2];
        ArrayList<Integer> arr3 = new ArrayList<>(1);
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        System.out.println(set);
        for (int j = 0; j < arr2.length; j++) {
            if (set.contains(arr2[j])) {
                arr3.add(arr2[j]);
                count++;
                set.remove(arr2[j]);
            }
        }
        System.out.println(arr3);
        return count;
    }

    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        System.out.println(intersection(arr1, arr2));
    }
}
