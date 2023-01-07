package com.code.recursion;
/**
 *
 * @author User
 */
public class xPowLog {

    public static int printPower(int x, int n) {

        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return printPower(x, n / 2) * printPower(x, n / 2);
        } else {
            return x * printPower(x, n / 2) * printPower(x, n / 2);
        }
    }

    public static void main(String[] args) {

        int x = 2;
        int n = 4;
        int output = printPower(x, n);
        System.out.println(output);
    }
}
