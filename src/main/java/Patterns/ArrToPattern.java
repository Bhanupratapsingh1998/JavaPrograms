package Patterns;

/**
 *
 * @author User
 */
public class ArrToPattern {

    public static void main(String[] args) {
        int arr[] = {2, 6, 3, 4, 5};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int k = max; k >0; k--) {
            for (int j = 0; j < arr.length; j++) {
                if (k>arr[j]) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

    }
}

/*
int arr[] = {2, 6, 3, 4, 5};

 *   
 *  *
 * **
 ****
*****
*****

*/