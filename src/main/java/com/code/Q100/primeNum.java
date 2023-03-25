package com.code.Q100;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class primeNum {

    public static void main(String[] args) {

        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of prime numbers you want");
        n = in.nextInt();
        for (int i = 2; i <= n;i++) {
           int status = 1;
            for (int j = 2; j <= i/2; j++) {
                 if (i % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status == 1) {
                System.out.print(i+" ");
            }
        }
    }
}
