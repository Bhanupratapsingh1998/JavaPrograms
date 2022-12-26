package com.code.recursion;

/**
 *
 * @author User
 */
public class print5_1 {

    // print the number 5 to 1 using recurstion
    private static void print5_1(int num) {
        if (num == 0) {
            return;
        }
        System.out.print(num + " ");
        print5_1(num - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        print5_1(num);
    }
}
