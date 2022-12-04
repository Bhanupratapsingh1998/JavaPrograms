package com.code.arrays;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ArrayListExam {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Syntax
        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(12);
//        list.add(13);
//        list.add(14);
//        list.add(15);
//        list.add(16);
//        list.add(17);
//        System.out.println(list);
//        System.out.println(list.contains(12));
//        list.set(0, 23);
//        list.remove(4);
//        System.out.println(list);

//To take user input as well
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
//outout
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
