package from_20_to_29;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Given a string of text in a tag-based language,
//parse this text and retrieve the contents enclosed within sequences of well-organized tags
//meeting the following criterion:
//  ->The name of the start and end tags must be same.
//  ->Tags can be nested, but content between nested tags is considered not valid.
//  ->Tags can consist of any printable characters.

public class Task23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String line;
        String regex = "<(.+)>([^<]+)</\\1>";
        Pattern p = Pattern.compile(regex);

        while (n-- >0){
            boolean matchFound = false;
            line = input.nextLine();
            Matcher m = p.matcher(line);

            while (m.find()){
                System.out.println(m.group(2));
                matchFound = true;
            }

            if (!matchFound) System.out.println("None");
        }
    }
}

//<(.+)>                # First tag in <>, saves in first group
//([^<]+)               # Any characters in tags except '<' symbol, saves in second group
//</\1>                 # Matching second tag with text in the first group

