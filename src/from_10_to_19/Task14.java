package from_10_to_19;

import java.util.Scanner;

//Given a string, s, and two indices, start and end
//print a substring consisting of all characters in the inclusive range from start to end-1.

public class Task14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int start = input.nextInt();
        int end = input.nextInt();
        String mod = s.substring(start, end);

        input.close();

        System.out.println(mod);
    }
}
