import java.util.Scanner;

//You are given an integer n, you have to convert it into a string.
//Why it became so hard, huh?

public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            Integer.parseInt(input.nextLine());
            System.out.println("Good job");
        } catch (Exception e) {
            System.out.println("Wrong answer");
        }

        input.close();
    }
}
