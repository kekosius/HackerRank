package from_10_to_19;

import java.util.Scanner;

//Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
//On the first line, print an integer, n, denoting the number of tokens in string s
//Next, print each of the  tokens on a new line in the same order as they appear in input string s.
//1<= length of s <= 4*10^5

public class Task18 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String s = input.nextLine();
        String[] tokens;
        input.close();
        s = s.trim();

        String delim = "[ !,?._'@]+";
        s = s.replaceAll(delim, " ");
        while (s.contains("  ")){
            s = s.replace("  ", " ");
        }
        tokens = s.split(" ");

        if (s.length() <= 400000 ){
            if (!s.equals("")) {
                System.out.println(tokens.length);
                for (String token: tokens) {
                    System.out.println(token);
                }
            }
            else System.out.println(0);
        }
    }
}


