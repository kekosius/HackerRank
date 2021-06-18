package from_0_to_9;

import java.util.*;

//Given an integer, n, perform the following conditional actions:
// ->If n is odd, print Weird
// ->If n is even and in the inclusive range of 2 to 5, print Not Weird
// ->If n is even and in the inclusive range of 6 to 20, print Weird
// ->If n is even and greater than 20, print Not Weird
//Complete the stub code provided in your editor to print whether or not  is weird.

public class Task3 {
    public static void main(String[] args){
        String wierd;
        String notWierd;
        notWierd = "Not Weird";
        wierd = "Weird";
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n % 2 == 1) {
            System.out.println(wierd);
        } else if (n > 20 | (n >= 2 && n <= 5)){
            System.out.println(notWierd);
        } else System.out.println(wierd);
        input.close();
    }
}