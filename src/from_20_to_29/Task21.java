package from_20_to_29;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//In this challenge, we use regular expressions to remove instances of words
//that are repeated more than once, but retain the first occurrence of any case-insensitive repeated word.

public class Task21 {
    public static void main(String[] args) {
        String regex = "(?i)\\b(\\w+)(?:\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner input = new Scanner(System.in);
        int numSentences = Integer.parseInt(input.nextLine());

        while (numSentences-- > 0) {
            String line = input.nextLine();

            Matcher m = p.matcher(line);

            while (m.find()) {
                line = line.replaceAll(regex, "$1");
            }

            System.out.println(line);
        }

        input.close();
    }
}


//(?i)                          # Fore case-insensitive search
//  \\b                         # Start of the word
//  (\\w+)                      # One or more letters/numbers/_
//      (?:\\s+\\1\\b)+             # One or more sequence of next pattern:
//          \\s+                        # One or more whitespaces
//          \\1                         # Reference to the stage value №1
//          \\b                         # End of the word
