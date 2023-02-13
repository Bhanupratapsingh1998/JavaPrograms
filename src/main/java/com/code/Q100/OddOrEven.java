package com.code.Q100;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class OddOrEven {

    public static void main(String[] args) {
        int x;
        System.out.println("Enter an integer to check if it is odd or even ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        int Evensum = 0, OddSum = 0;
        for (int i = 1; i <= x; i++) {

            if (i % 2 == 0) {
                Evensum = Evensum + i;
                System.out.print(i + " ");
                System.out.println();
            } else {
                System.out.print(i + " ");
                OddSum = OddSum + i;
            }
        }
        System.out.println("Evensum " + Evensum);
        System.out.println("OddSum " + OddSum);
    }

}
