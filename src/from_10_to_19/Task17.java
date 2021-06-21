package from_10_to_19;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//Given two strings - a and b
//If a and b are case-insensitive anagrams, print "Anagrams". Otherwise, print "Not Anagrams".

public class Task17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        a = a.toLowerCase(Locale.ROOT);
        String b = input.nextLine();
        b = b.toLowerCase(Locale.ROOT);
        input.close();

        char[] first = a.toCharArray();
        Arrays.sort(first);
        char[] second = b.toCharArray();
        Arrays.sort(second);

        System.out.println( (Arrays.equals(first, second)) ? "Anagrams" : "Not Anagrams" );
    }
}
