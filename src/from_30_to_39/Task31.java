package from_30_to_39;

import java.util.HashMap;
import java.util.Scanner;

/*
You are given a phone book that consists of people's names and their phone number.
After that you will be given some person's name as query.
For each query, print the phone number of that person.
*/

public class Task31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String name;
        String query;
        int number;

        HashMap<String, Integer> phoneBook = new HashMap<>();

        while (n-- >0){
            name = input.nextLine();
            number = Integer.parseInt(input.nextLine());
            phoneBook.put(name, number);
        }

        while (input.hasNext()){
            query = input.nextLine();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }

        input.close();
    }
}
