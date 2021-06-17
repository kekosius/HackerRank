import java.util.Scanner;

//There are three lines of output:
// 1. On the first line, print String: followed by the unaltered String read from stdin.
// 2. On the second line, print Double: followed by the unaltered double read from stdin.
// 3. On the third line, print Int: followed by the unaltered integer read from stdin.

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString;

        int inputInteger = input.nextInt();
        double inputDouble = input.nextDouble();
        inputString = input.nextLine();


        input.close();

        System.out.println("String: " + inputString);
        System.out.println("Double: " + inputDouble);
        System.out.println("Int: " + inputInteger);
    }
}
