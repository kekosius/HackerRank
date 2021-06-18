package from_0_to_9;

import java.util.Scanner;

//In each line of output there should be two columns:
//The first column contains the String and is left justified using exactly 15 characters.
//The second column contains the integer, expressed in exactly 3 digits;
//if the original input has less than three digits,
//you must pad your output's leading digits with zeroes.

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] input1 = input.nextLine().split(" ");
        input1[0] = String.format("%-15s", input1[0]);
        int inputInt1 = Integer.parseInt(input1[1]);
        input1[1] = String.format("%03d", inputInt1);

        String[] input2 = input.nextLine().split(" ");
        input2[0] = String.format("%-15s", input2[0]);
        int inputInt2 = Integer.parseInt(input2[1]);
        input2[1] = String.format("%03d", inputInt2);

        String[] input3 = input.nextLine().split(" ");
        input3[0] = String.format("%-15s", input3[0]);
        int inputInt3 = Integer.parseInt(input3[1]);
        input3[1] = String.format("%03d", inputInt3);

        input.close();

        System.out.println("================================");
        System.out.println(input1[0] + input1[1]);
        System.out.println(input2[0] + input2[1]);
        System.out.println(input3[0] + input3[1]);
        System.out.println("================================");

    }
}
