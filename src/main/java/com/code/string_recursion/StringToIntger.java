package com.code.string_recursion;

/**
 *
 * @author User
 */
public class StringToIntger {

    public static int strToInteger(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        final int sign = s.charAt(0) == '-' ? -1 : 1;
        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            s = s.substring(1);
        }

        long num = 0;

        for (final char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                break;
            }
            num = num * 10 + (c - '0');
            if (sign * num <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (sign * num >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }

        return sign * (int) num;
    }

    public static void main(String[] args) {
//        String str = " words and 987";
        String str = "  -987 with words";
        int results =  strToInteger(str);
        System.out.println(results);
        }
}
