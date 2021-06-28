package from_20_to_29;

import java.util.Scanner;

/*
You are given a 6*6 2D array. An hourglass in an array is a portion shaped like this:
    a b c
      d
    e f g
In this problem you have to print the largest sum among all the hourglasses in the array.
There will be exactly 6 lines, each containing 6 integers seperated by spaces.
Each integer will be between -9 and 9 inclusive.
*/

public class Task26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[][] Arr = new Integer[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                Arr[i][j] = input.nextInt();
            }
        }

        input.close();

        int max = -9*6;
        int count;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                count = Arr[i][j]+Arr[i][j+1]+Arr[i][j+2]+Arr[i+1][j+1]+Arr[i+2][j]+Arr[i+2][j+1]+Arr[i+2][j+2];
                if (count > max) max = count;
            }
        }

        System.out.println(max);
    }
}
