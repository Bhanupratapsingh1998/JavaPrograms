package com.code.matrix_arrays;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class spiralMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Spiral Order Matrix is : ");
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = m - 1;
        //To print spiral order matrix
        while (rowStart <= rowEnd && colStart < colEnd) {

            /*1. First of all, we will traverse in the row row_start from column_start
            to column_end and we will increase the row_start with 1 as we have
            traversed the starting row.*/
            for (int col = colStart; col <= colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;

            /*2. Then we will traverse in the column column_end from row_start to
            row_end and decrease the column_end by 1.
             */
            for (int row = rowStart; row <= rowEnd; row++) {
                System.out.print(matrix[row][colEnd] + " ");
            }
            colEnd--;
            /*3. Then we will traverse in the row row_end from column_end to
                column_start and decrease the row_end by 1.
             */
            for (int col = colEnd; col >= colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;
            /*4. Then we will traverse in the column column_start from row_end to
            row_start and increase the column_start by 1.
             */
            for (int row = rowEnd; row >= rowStart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;
        System.out.println();
        }
    }
}
