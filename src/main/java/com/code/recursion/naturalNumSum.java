package com.code.recursion;

/**
 *
 * @author User
 */
public class naturalNumSum {

    // print the sum of natural number using recurstion
    private static void naturalNumSum(int i, int num, int sum) {
        if (i == num) {
            sum += i;
            System.out.print(sum + " ");
            return;
        }
        sum += i;
        naturalNumSum(i+1, num, sum);
    }

    public static void main(String[] args) {
        naturalNumSum(1, 5, 0);
    }
}

