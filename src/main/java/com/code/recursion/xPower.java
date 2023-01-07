package com.code.recursion;

/**
 *
 * @author User
 */
public class xPower {

    public static int printPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int x1 = printPower(x, n - 1);
        int xn = x * x1;
        return xn;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 4;
        int output = printPower(x, n);
        System.out.println(output);
    }
}
