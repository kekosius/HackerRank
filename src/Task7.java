
//We use the integers a, b, and x to create the following series:
//(a + 2^0 * b), (a + 2^0 * b + 2^1 * b),...,(a + 2^0 * b + 2^1 * b + ... + 2^n-1 * b)
//You are given q queries in the form of a, b, and n.
//For each query, print the series corresponding to the given a, b, and n
//values as a single line of  space-separated integers.

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        int a, b, n, cur;
        for (int i = 0; i < q; i++) {
            a = input.nextInt();
            b = input.nextInt();
            n = input.nextInt();
            cur = a;

            for (int j = 0; j < n; j++) {
                cur+=Math.pow(2,j)*b;
                System.out.print(cur + " ");
            }

            System.out.println();
        }
    }
}
