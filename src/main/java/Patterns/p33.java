
package Patterns;

/**
 *
 * @author User
 */
public class p33 {
    /*
E J O T Y 
D I N S X 
C H M R W 
B G L Q V 
A F K P U 
    */
    public static void main(String[] args) {
        char ch = 'E',chr = '\0';
        for (int i = 1; i <= 5; i++) {
            chr = ch--;
            for (int j = 1; j <= 5; j++) {
                System.out.print(chr + " ");
                chr+=4;
                chr++;
            }
            System.out.println();
        }
    }
}
