package com.code.arrays;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class findarrayACS_DESC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[] = new int[size];

        //user input
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i + 1]) { // This is the condition for descending order
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }
    }
}
