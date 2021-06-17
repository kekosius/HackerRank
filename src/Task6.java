import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result;
        String output;

        input.close();

        for (int i = 1; i <= 10; i++) {
            result = n*i;
            output = String.format("%d x %d = %d", n, i, result);
            System.out.println(output);
        }
    }
}
