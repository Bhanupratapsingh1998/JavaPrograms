package com.code.arrays;



/**
 *
 * @author User
 */
public class Arrays {

    public static void main(String args[]) {
        //syntax
        //datatype [] variableName = new datatype[size];
        int rows[]; // declation of arrays. rows is getting defined in the stack.
        rows = new int[5];// initialization: actualy here object is being created in heap memory.
        // and heap objects are continuous.Hence its may not be continuous  and reason is its depends on jvm.
//        System.out.println(rows[0]);
        String str[] = new String[5];
        System.out.println(str[0]);

        //All the primitive reference variable stored in stack memory and non-primitive reference variable stored in heap memory

    }
}
