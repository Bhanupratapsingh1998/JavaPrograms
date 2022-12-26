package com.code.recursion;

/**
 *
 * @author User
 */
public class print1_5 {
     // print the number 1 to 5 using recurstion
    private static void print1_5(int num) {
        if (num == 6) {
            return;
        }
        System.out.print(num + " ");
        print1_5(num + 1);
    }

    public static void main(String[] args) {
        int num = 1;
        print1_5(num);
    }
}
