package com.code.linearSearch;

/**
 *
 * @author User
 */
public class EvenDigitNum {

    static int findEvenDigit(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        int numOfDigits = digits(num);
        /*
        if(numOfDigits % 2 == 0){
            return true;
        }else{
            return false;
        }
         */
        return numOfDigits % 2 == 0;
    }

    private static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
        /*or
        return (int)(Math.log10(num))+1;
         */

    }

    public static void main(String[] args) {
        int[] arr = {2, 342, 34, 145, 3, 45};
        System.out.println(findEvenDigit(arr));
    }

}
