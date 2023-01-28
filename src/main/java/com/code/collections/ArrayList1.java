package com.code.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author User
 */
public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);
        System.out.println(list);

        //get element
        int element = list.get(0);
        System.out.println(element);

        //add element in between
        list.add(2, 4);
        System.out.println(list);

        //set element
        list.set(0, 6);
        System.out.println(list);

        //delete element
        list.remove(0);
        System.out.println(list);

        //loops
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        //sort
        Collections.sort(list);
        System.out.println(list);
    }
}
