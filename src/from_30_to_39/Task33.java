package from_30_to_39;

import java.util.HashSet;
import java.util.Scanner;


//You are given n pairs of strings. After taking each pair as input, you need to print number of unique pairs you currently have.


public class Task33 {
    public static void main(String[] args) {
        HashSet<String> pairs = new HashSet<>();
        Scanner input = new Scanner(System.in);
        String line;

        int n = Integer.parseInt(input.nextLine());

        while (n-- >0){
            line = input.nextLine();
            pairs.add(line);
            System.out.println(pairs.size());
        }
        input.close();
    }
}
