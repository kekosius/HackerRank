package from_20_to_29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
You are given n lines. In each line there are zero or more integers.
You need to answer a few queries where you need to tell the number located in y-th position of x-th line.
*/

public class Task28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<ArrayList<Integer>> array = new ArrayList<>();

        int n = Integer.parseInt(input.nextLine());
        int d;

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> inputs = new ArrayList<>();
            d = input.nextInt();
            for (int j = 0; j < d; j++) {
                inputs.add(input.nextInt());
            }
            array.add(i, inputs);
        }

        int q = input.nextInt();
        int x,y;

        for (int i = 0; i < q; i++) {
            x = input.nextInt()-1;
            y = input.nextInt()-1;

            try {
                System.out.println(array.get(x).get(y));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

        input.close();
    }
}

//P.S. - ArrayList.clear() doesn't work the way you think