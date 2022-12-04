package com.code.linearSearch;

/**
 *
 * @author User
 */
public class linearSearch1 {

    //Search the target and return the element
    static int linearSearch(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }
        //run a inhanced for loop to check target element
            for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {12, 34, 54, 12, 76, 43, 56};
        int element = 34;
        int results = linearSearch(arr, element);
        System.out.println(results);
    }
}
