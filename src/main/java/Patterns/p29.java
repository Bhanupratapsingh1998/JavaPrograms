package Patterns;

/**
 *
 * @author User
 */
public class p29 {
    /*
    
E D C B A 
E D C B A 
E D C B A 
E D C B A 
E D C B A
    
    */
    public static void main(String[] args) {
        char ch = 'E', chr = '\0';
        for (int i = 1; i <= 5; i++) {
            chr = ch;
            for (int j = 1; j <= 5; j++) {
                System.out.print(chr + " ");
                chr--;
            }
            System.out.println();
        }
    }
}
