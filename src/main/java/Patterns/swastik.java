package Patterns;

/**
 *
 * @author hashstudioz
 */
public class swastik {

    public static void main(String[] args) {
        int no = 5;
        for (int i = 1; i <= no * 2 - 1; i++) {
            for (int j = 1; j <= no * 2 - 1; j++) {
                /* Conditions for print stars*/
                if (i == no || j == no || i == 1 && j > no || i < no && j == 1 || i > no && j == no * 2 - 1 || i == no * 2 - 1 && j < no) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }

}
