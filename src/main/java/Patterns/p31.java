package Patterns;

/**
 *
 * @author User
 */
public class p31 {
    /*
A B C D E 
B C D E F 
C D E F G 
D E F G H 
E F G H I 
    */
     public static void main(String[] args) {
        char ch = 'A', chr = '\0';
        for (int i = 1; i <= 5; i++) {
            chr = ch++;
            for (int j = 1; j <= 5; j++) {
                System.out.print(chr + " ");
                chr++;
            }
            System.out.println();
        }
    }
}
