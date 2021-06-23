package from_20_to_29;

import java.util.Scanner;

//You are updating the username policy on your company's internal networking platform.
//According to the policy, a username is considered valid if all the following constraints are satisfied:
//  ->  The username consists of 8 to 30 characters inclusive.
//  ->  The username can only contain alphanumeric characters and underscores (_).
//  ->  The first character of the username must be an alphabetic character

public class Task22 {
    public static void main(String[] args) {
        String regex = "^([a-zA-Z])(\\w{7,29})";

        Scanner input = new Scanner(System.in);
        String s;
        int n = input.nextInt();
        input.nextLine();
        for (int i = 0; i < n; i++) {
            s = input.nextLine();
            System.out.println(s.matches(regex) ? "Valid" : "Invalid");
        }
    }
}

//^             # Start of string
//  ([a-zA-Z])    # First letter
//  (\w{7,29})    # Other characters (lowercase characters, uppercase characters, digits and underscores
//&             # End of the string