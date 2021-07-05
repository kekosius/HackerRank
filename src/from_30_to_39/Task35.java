package from_30_to_39;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
The Player class has 2 fields: a name String and a score integer.
Given an array of n Player objects, write a comparator that sorts them in order of decreasing score;
if 2 or more players have the same score, sort those players alphabetically by name.
 */

public class Task35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        Player[] players = new Player[n];
        String name;
        int score;
        Checker comp = new Checker();

        for (int i = 0; i < n; i++) {
            name = input.next();
            score = input.nextInt();
            players[i] = new Player(name, score);
        }
        input.close();
        Arrays.sort(players, comp);

        for (Player person : players) {
            System.out.printf("%s %d\n", person.name, person.score);
        }
    }
}

class Player {
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        int result;
        result = o2.score - o1.score;
        // By the way, more correct way to compare Strings is s1.compareTo(s2)
        if (result == 0) result = String.CASE_INSENSITIVE_ORDER.compare(o1.name, o2.name);
        return result;
    }
}