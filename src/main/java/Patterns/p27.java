package Patterns;

/**
 *
 * @author User
 */
public class p27 {
    
    /*
   
A B C D E 
A B C D E 
A B C D E 
A B C D E 
A B C D E
    
    */
    
    public static void main(String[] args) {
         char ch = 'A',chr='\0';
        for (int i = 1; i <= 5; i++) {
            chr = ch;
            for (int j = 1; j <= 5; j++) {
                System.out.print(chr+" ");
                chr++;
            }
            System.out.println();
        }
    }
}
