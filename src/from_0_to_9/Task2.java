package from_0_to_9;

import java.util.*;


//In this challenge, you must read 3 integers from stdin and then print them to stdout
//Each integer must be printed on a new line

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        input.close();
    }
}
