package from_20_to_29;

import java.util.Scanner;

/*
You're standing at index 0 of an n-element array named game.
From some index i (where 0<=i<n), you can perform one of the following moves:
    Move Backward:
        -> If cell i-1 exists and contains a 0, you can walk back to cell i-1.
    Move Forward:
        -> If cell i+1 contains a zero, you can walk to cell i+1.
        -> If cell i+leap contains a zero, you can jump to cell i+leap.
        -> If you're standing in cell n-1 or the value of i+leap>=n, you can walk or jump off the end of the array and win the game.
In other words, you can move from index i to index i+1, i-1, or i+leap as long as the destination index is a cell containing a 0.
If the destination index is greater than n-1, you win the game.
*/

public class Task29 {
    static boolean win = false;

    public static boolean canWin(int leap, int[] game) {
        int[] visited = new int[game.length];

        moveTo(visited, game, leap, 0);
        boolean anw = win;
        win = false;
        return anw;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
    public static void moveTo(int[] visited, int[] game, int leap, int dest){
        visited[dest] = 1;

        try {
            if (visited[dest - 1] == 0 & game[dest - 1] == 0) moveTo(visited, game, leap, dest - 1);
        } catch (Exception ignored){}

        try {
            if (visited[dest + 1] == 0 & game[dest + 1] == 0) moveTo(visited, game, leap, dest + 1);
            if (visited[dest + leap] == 0 & game[dest + leap] == 0) moveTo(visited, game, leap, dest + leap);
        } catch (Exception e){win = true;}

    }
}
