package com.code.arrays;


/**
 *
 * @author User
 */
import java.util.Arrays;

public class passingFunctions {

    public static void main(String[] args) {
        int num[] = {2, 3, 4, 12};
        System.out.println(Arrays.toString(num));
        System.out.println("------------------------");
        change(num);
        System.out.println(Arrays.toString(num));//Actually arrays are mutable in java and it can be change its reference as well
    }

    static void change(int arr[]) {
        arr[0] = 15;
    }
}
