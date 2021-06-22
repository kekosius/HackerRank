package from_10_to_19;

import java.util.Scanner;
import java.util.regex.Pattern;

//In this problem, you are given a pattern.
//You have to check whether the syntax of the given pattern is valid.

public class Task19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();
        String line;

        for (int i = 0; i < N; i++) {
            line = input.nextLine();
            try{
                Pattern.compile(line);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
        input.close();
    }
}
