package com.code.string_recursion;

/**
 *
 * @author User
 */
public class reverseStr {

    public static void reverseStr(String str, int idx) {
        if (idx == 0) {
        System.out.print(str.charAt(idx)+" ");
            return;
        }
        System.out.print(str.charAt(idx)+" ");
        reverseStr(str, idx - 1);
    }

    public static void main(String[] args) {
        String str = "abcdf";
        int idx = str.length()-1;
        reverseStr(str, idx);
    }
}
