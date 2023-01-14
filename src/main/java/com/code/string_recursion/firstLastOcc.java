/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.string_recursion;

/**
 *
 * @author User
 */
public class firstLastOcc {

    static int first = -1;
    static int last = -1;

    public static void firstLastOcc(String str, int idx) {
        char givenChar = 'c';
        if (idx == str.length()) {
            System.out.print(first + " " + last);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == givenChar) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        firstLastOcc(str, idx + 1);
    }

    public static void main(String[] args) {
        String str = "abcabadfa";
        firstLastOcc(str, 0);
    }
}
