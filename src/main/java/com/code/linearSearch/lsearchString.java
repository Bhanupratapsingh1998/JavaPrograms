package com.code.linearSearch;

/**
 *
 * @author User
 */
public class lsearchString {

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        //run a for loop to check target element
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        //run a inhanced for loop to check target element
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String name = "Bhanu";
        char target = 'h';
        boolean results = search(name, target);
        boolean results2 = search2(name, target);
        System.out.println(results);
//        System.out.println(results2);
    }
}
