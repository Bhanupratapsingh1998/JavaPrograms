package com.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author hashstudioz
 */
public class even_odd_prime {

    private static void individualSum(int a) {

        int sum1 = 0, sum2 = 0, sum3 = 0, count = 0, count2 = 0, count3 = 0, count1 = 0;
        int even[] = new int[a / 2];
        int odd[] = new int[a / 2];
        List<Integer> prime = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                even[count++] = i;
                sum1 += i;
            } else {
                odd[count2++] = i;
                sum2 += i;
            }
            count1 = 0;
            if (i == 1) {
                continue;
            }
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    count1 = 1;
                    break;
                }
            }
            if (count1 == 0) {
                prime.add(i);
                sum3 += i;
            }
        }
        System.out.println("even no is : " + Arrays.toString(even) + "\n" + "total : " + sum1);
        System.out.println("odd no is : " + Arrays.toString(odd) + "\n" + "total : " + sum2);
        System.out.println("prime no is : " + prime + "\n" + "total : " + sum3);
    }

    public static void main(String[] args) {
        int a = 20;
        individualSum(a);
    }
}
