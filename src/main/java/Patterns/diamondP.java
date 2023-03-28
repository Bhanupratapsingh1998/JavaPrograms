package com.patterns;

/**
 *
 * @author hashstudioz
 */
public class diamondP {

    public static void main(String[] args) {
        int no = 5;
        int fcount = no;
        int lcount = 1;

        /* for (int i = 1; i <= no; i++) {
            for (int j = temp; j > 0; j--) {
                System.out.print(" ");
            }
            temp--;
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= no-1; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = count - 1; k > 0; k--) {
                System.out.print("* ");
            }
            count--;
            System.out.println();
        }*/
        for (int i = no * 2 - 1; i >= 1; i--) {
            for (int j = 1; j <= no; j++) {
                if (i >= no) {
                    if (fcount <= j) {
                        System.out.print("* ");

                    } else {
                        System.out.print(" ");

                    }
                } else {

                    if (lcount <= j) {
                        System.out.print("* ");

                    } else {
                        System.out.print(" ");

                    }
                }

            }
            if (i <= no) {
                lcount++;
            }
            fcount--;
            System.out.println();
        }
    }
}
