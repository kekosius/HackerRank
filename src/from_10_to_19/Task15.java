package from_10_to_19;

import java.util.Arrays;
import java.util.Scanner;

//Given a string, s, and an integer, k
//complete the function so that it finds the lexicographically smallest and largest substrings of length k.

public class Task15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int k = input.nextInt();

        input.close();

        String smallest, largest;

        int lot = s.length() - k + 1;
        String[] substrings = new String[lot];

        for (int i = 0; i < lot; i++) {
            substrings[i] = s.substring(i, i+k);
        }

        Arrays.sort(substrings);

        smallest = substrings[0];
        largest = substrings[substrings.length-1];

        System.out.println(smallest + "\n" + largest);
    }
}
