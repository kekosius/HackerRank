package from_30_to_39;

import java.util.Scanner;
import java.util.Stack;

/*
A string containing only parentheses is balanced if the following is true:
  1. if it is an empty string;
  2. if A and B are correct, AB is correct;
  3. if A is correct, (A) and {A} and [A] are also correct.
Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"
Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
Given a string, determine if it is balanced or not.
*/

public class Task32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line;
        Stack<Character> balance = new Stack<>();
        boolean result;
        char bracket;


        while (input.hasNext()){
            line = input.nextLine();
            result = true;
            if (line.isEmpty()) {
                System.out.println(true);
                continue;
            }
            char [] parentheses = line.toCharArray ();
            for (int i = 0; i < line.length(); i++) {
                if (parentheses[i] == '[' | parentheses[i] == '{' | parentheses[i] == '('){
                    balance.push(parentheses[i]);
                } else if (parentheses[i] == ']' | parentheses[i] == '}' | parentheses[i] == ')'){
                    try {
                        bracket = balance.pop();
                        if (bracket != '[' & bracket != '{' & bracket != '(') {
                            result = false;
                            break;
                        }
                    } catch (Exception e){
                        result = false;
                    }

                }
            }
            if (!balance.isEmpty()){
                result = false;
                balance.clear();
            }
            System.out.println(result);
        }
        input.close();
    }
}
