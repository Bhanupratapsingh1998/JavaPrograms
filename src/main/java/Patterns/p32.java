package Patterns;

/**
 *
 * @author User
 */
public class p32 {
    /*
A F K P U 
B G L Q V 
C H M R W 
D I N S X 
E J O T Y 
    */
     public static void main(String[] args) {
        char ch = 'A',chr = '\0';
        for (int i = 1; i <= 5; i++) {
            chr = ch++;
            for (int j = 1; j <= 5; j++) {
                System.out.print(chr + " ");
                chr+=4;
                chr++;
            }
            System.out.println();
        }
    }
}
