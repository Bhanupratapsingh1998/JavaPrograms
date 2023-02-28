package com.code.matrix_arrays;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class matrixSearch {

    private static int[] searchMatrixIndex(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int arr[][] = {
            {1, 2, 3}, //0th index
            {4, 5, 6}, // 1th index
            {7, 8, 9} // 2nd index
        };
        int target = 9;
        int[] results = searchMatrixIndex(arr, target);
        System.out.println(Arrays.toString(results));
    }
}
