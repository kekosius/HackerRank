package from_20_to_29;

import java.util.Scanner;

//You need to write a regular expression
//and assign it to the pattern such that it can be used to validate an IP address.

public class Task20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String IP;

        while (input.hasNext()){
            IP = input.next();
            System.out.println(IP.matches(MyRegex.pattern));
        }
    }
}

class MyRegex {
    static String pattern = "^(?=\\d+\\.\\d+\\.\\d+\\.\\d+$)(?:(?:25[0-5]|2[0-4][0-9]|1[0-9]{2}|0[0-9]{2}|[1-9][0-9]|[0-9])\\.?){4}$";
}

//^                       # START OF STRING
//  (?=\d+\.\d+\.\d+\.\d+$) # Lookahead, require this format: number.number.number.number END OF STRING
//  (?:                     # Start non-capture group (number 0-255 + optional dot)
//      (?:                     # Start non-capture group (number 0-255)
//          25[0-5]                 # 250-255
//          |                       # OR
//          2[0-4][0-9]             # 200-249
//          |                       # OR
//          1[0-9]{2}               # 100-199
//          |                       # OR
//          0[0-9]{2}               # 000-099
//          |                       # OR
//          [1-9][0-9]              # 10-99
//          |                       # OR
//          [0-9]                   # 0-9
//      )                       # End non-capture group
//      \.?                     # Optional dot (enforced in correct positions by lookahead)
//  ){4}                    # End non-capture group (number + optional dot), repeat 4 times
//$                       # END OF STRING