package from_30_to_39;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

/*
In this problem, you are given n integers.
You need to find the maximum number of unique integers among all the possible contiguous subarrays of size m.
*/

public class Task37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int first;
        int last;
        int max = Integer.MIN_VALUE;

        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> unique = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (i >= m) {
                if (max == m) break;
                first = deque.pollFirst();
                if (!deque.contains(first)) unique.remove(first);
            }
            last = input.nextInt();
            deque.add(last);
            unique.add(last);
            if (unique.size() > max) max = unique.size();
        }
        System.out.println(max);
    }
}
