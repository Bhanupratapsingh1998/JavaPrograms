package com.code.Q100;

/**
 *
 * @author User
 */
public class FloydTriangle {

    public static void main(String[] args) {
        int n = 5;

        int i, j, count = 1;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
