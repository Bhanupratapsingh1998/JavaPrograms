
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author User
 */
public class multiArrrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
            1 2 3 
            4 5 6
            7 8 9
         */
        int arr[][] = new int[3][3];
//        int arr2d[][] = {
//            {1, 2, 3}, //0th index
//            {4, 5, 6}, // 1th index
//            {7, 8, 9} // 2nd index
//        };
        //input
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //output
//        for (int row = 0; row < arr.length; row++) {
//        // for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }
//        for (int num[] : arr) {
//            System.out.println(Arrays.toString(num)); // here num represents the element of the array
//        }
//        for (int row = 0; row < arr.length; row++) {
//         System.out.println(Arrays.toString(arr[row])); 
//        }
        System.out.println(Arrays.deepToString(arr));
    }
}
