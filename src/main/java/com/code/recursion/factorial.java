package com.code.recursion;

/**
 *
 * @author User
 */
public class factorial {

    // print the factorial number using recurstion
    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
