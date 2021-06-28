package from_20_to_29;

import java.util.Scanner;

/*
The first line contains a single integer, n, denoting the length of array.
The second line contains n space-separated integers describing each respective element, in array A.
Print the number of subarrays of A having negative sums.
*/

public class Task27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Integer[] A = new Integer[n];
        int count = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) A[i] = input.nextInt();

        input.close();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum+= A[j];
                if (sum < 0) count++;
            }
            sum = 0;
        }

        System.out.println(count);

    }
}
