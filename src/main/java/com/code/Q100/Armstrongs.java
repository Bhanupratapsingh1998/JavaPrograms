package com.code.Q100;

/**
 *
 * @author User
 */
public class Armstrongs {

    public static void main(String args[]) {
        int num = 5;
        for (int i = 0; i <= num; i++) //function calling  
        {
            if (isArmstrong(i)) //prints the armstrong numbers  
            {
                System.out.print(i + ", ");
            }
        }
    }

    private static boolean isArmstrong(int num) {
        int temp, count = 0, rem = 0, sum = 0;
        temp = num;
        while (temp != 0) {
            temp = num / 10;
            count++;
        }
        temp = num;
        while (temp != 0) {
            rem = num % 10;
            sum += Math.pow(rem, count);
            temp = num / 10;

        }
        if(num == sum){
            return true;
        }else{
            return false;
        }

    }
}
