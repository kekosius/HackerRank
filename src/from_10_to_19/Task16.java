package from_10_to_19;

import java.util.Scanner;

//Given a string A, print "Yes" if it is a palindrome, print "No" otherwise.

public class Task16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.nextLine();
        A = A.toLowerCase();
        input.close();

        String first, second;
        first = A.substring(0, A.length()/2);
        second = A.substring(A.length()-A.length()/2);
        second = reverse(second);
        if (first.equals(second)) System.out.println("Yes");
        else System.out.println("No");

    }
    static String reverse(String inputString) {
        return new StringBuilder(inputString).reverse().toString();
    }

}
