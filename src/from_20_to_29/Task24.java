package from_20_to_29;

import java.util.BitSet;
import java.util.Locale;
import java.util.Scanner;

//Given  BitSets, B1 and B2, of size N where all bits in both BitSets are initialized to 0, perform a series of M operations.
//After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.

public class Task24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        input.nextLine();
        String[] line;

        BitSet[] B = new BitSet[2];
        B[0] = new BitSet(N);
        B[1] = new BitSet(N);
        B[0].clear();
        B[1].clear();

        while (M-- >0){
            line = input.nextLine().split(" ");
            String operation = line[0].toLowerCase(Locale.ROOT);
            int first = Integer.parseInt(line[1])-1;
            int second = Integer.parseInt(line[2])-1;

            switch (operation) {
                case ("and") -> {
                    B[first].and(B[second]);
                    System.out.printf("%d %d%n", B[0].cardinality(), B[1].cardinality());
                }
                case ("or") -> {
                    B[first].or(B[second]);
                    System.out.printf("%d %d%n", B[0].cardinality(), B[1].cardinality());
                }
                case ("xor") -> {
                    B[first].xor(B[second]);
                    System.out.printf("%d %d%n", B[0].cardinality(), B[1].cardinality());
                }
                case ("flip") -> {
                    B[first].flip(second);
                    System.out.printf("%d %d%n", B[0].cardinality(), B[1].cardinality());
                }
                case ("set") -> {
                    B[first].set(second);
                    System.out.printf("%d %d%n", B[0].cardinality(), B[1].cardinality());
                }
            }
        }
        input.close();
    }

}

