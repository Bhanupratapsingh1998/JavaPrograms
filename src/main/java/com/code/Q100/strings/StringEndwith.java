package com.code.Q100.strings;

/**
 *
 * @author User
 */
public class StringEndwith {

    public static void main(String[] args) {
        String s1 = "java by TechnoLamror";
        System.out.println(s1.endsWith("r")); //true
        System.out.println(s1.endsWith("Lamror")); //true
        System.out.println(s1.endsWith("lamror"));//false
        System.out.println(s1.startsWith("j"));//false
    }
}
