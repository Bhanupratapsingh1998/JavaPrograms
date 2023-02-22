package com.code.Q100;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ReverseNumber {

    public static void main(String[] args) {
        int n, reverse = 0;
        System.out.println("Enter the number to reverse");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        
        //Using while loop
       /* while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }*/
       
       //Using for loop
        for (; n != 0; n = n / 10) {
            reverse = reverse * 10 + n % 10;
        }
        System.out.println("Reverse of entered number is " + reverse);
    }
}
