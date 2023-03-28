package com.patterns;

/**
 *
 * @author hashstudioz
 */
public class numP1 {

    /*
    
1111111
1111122
1111333
1114444
1155555
1666666
7777777 
    
     */
    public static void main(String[] args) {
        int no = 7;
        int count = no;
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= no; j++) {
                if (count <= j) {
                    System.out.print(i);

                } else {
                    System.out.print("1");
                }
            }
            count--;
            System.out.println();
        }
    }
}
