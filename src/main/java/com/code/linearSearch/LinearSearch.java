package com.code.linearSearch;

/**
 *
 * @author User
 */
public class LinearSearch {

    //Search the array element if item is found then return the index if item is not found return -1
    static int linearSearch(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }
        //run a for loop to check target element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {12, 34, 54, 12, 76, 43, 56};
        int element = 12;
        int results = linearSearch(arr, element);
        System.out.println(results);
    }
}
