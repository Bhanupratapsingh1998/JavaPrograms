package com.code.Q100;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class factLargNo {

    public static void main(String args[]) {
        int n, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer");
        n = input.nextInt();
        BigInteger inc = new BigInteger("1");
        BigInteger fact = new BigInteger("1");

        for (c = 1; c <= n; c++) {
            fact = fact.multiply(inc);
            inc = inc.add(BigInteger.ONE);
        }
        System.out.println(n + "! = " + fact);
    }
}
