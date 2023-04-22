package com.code.Q100.strings;

/**
 *
 * @author User
 */
public interface interfaceInfo {

    static final String language = "Java";

    public void display();
}

class Simple implements interfaceInfo {

    public static void main(String[] args) {
        Simple obj = new Simple();
        obj.display();
    }
    public void display() {
        System.out.println(language + " is awesome");
    }
}
