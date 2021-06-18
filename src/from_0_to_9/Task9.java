package from_0_to_9;

import java.util.ArrayList;
import java.util.Scanner;

//Read some unknown  lines of input from stdin(System.in) until you reach EOF;
//each line of input contains a non-empty String.

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        ArrayList<String> lines = new ArrayList<>();

        while (input.hasNext()){
            lines.add(String.format("%d %s", n + 1, input.nextLine()));
            n++;
        }

        input.close();

        for (String line: lines) {
            System.out.println(line);
        }
        
    }
}
