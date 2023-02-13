package com.code.Q100;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class AddingLargeNumbers {

    public static void main(String[] args) {
        String num1, num2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first large number");
        num1 = in.nextLine();
        System.out.println("Enter second large number");
        num2 = in.nextLine();
        BigInteger first = new BigInteger(num1);
        BigInteger second = new BigInteger(num2);
        BigInteger sum;
        sum = first.add(second);
        System.out.println("Result of addition = " + sum);
    }
}
