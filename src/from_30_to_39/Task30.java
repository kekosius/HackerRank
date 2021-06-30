package from_30_to_39;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
For this problem, we have  types of queries you can perform on a List:
    -> Insert y at index x
    -> Delete the element at index x
Given a list, L, of N integers, perform Q queries on the list.
Once all queries are completed, print the modified list as a single line of space-separated integers.
*/

public class Task30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> L = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            L.add(input.nextInt());
        }
        input.nextLine();
        int q = Integer.parseInt(input.nextLine());
        String req;
        int x,y;
        while (q-- > 0) {
            req = input.nextLine();
            switch (req){
                case ("Insert") -> {
                    x = input.nextInt();
                    y = input.nextInt();
                    if (input.hasNext()) input.nextLine();

                    L.add(x, y);
                }
                case ("Delete") -> {
                    x = input.nextInt();
                    if (input.hasNext()) input.nextLine();

                    L.remove(x);
                }
            }
        }
        input.close();
        for (Integer integer : L) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
