package from_30_to_39;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int num;
        int c = 0;
        int first;
        int last;
        int max;

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < m; i++) {
            num = input.nextInt();
            c = c + uniqueCounter(deque, num);
            deque.add(num);
        }
        max = c;
        for (int i = m; i < n; i++) {
            if (max == m) break;
            first = deque.pollFirst();
            c = c - uniqueCounter(deque, first);
            last = input.nextInt();
            c = c + uniqueCounter(deque, last);
            deque.add(last);
            if (c > max) max = c;
        }
        System.out.println(c);
    }
    public static int uniqueCounter(Deque<Integer> deque, int num){

        for (Integer x: deque){
            if (x == num) return 0;
        }
        return 1;
    }
}
