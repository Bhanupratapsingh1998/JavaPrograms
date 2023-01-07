package com.code.recursion;

/**
 *
 * @author User
 */
public class towerHannoi {

    public static void towerHannoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " => " + dest);
            return;
        }
        towerHannoi(n - 1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " => " + dest);
        towerHannoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        towerHannoi(n, "S", "H", "D");
    }
}
