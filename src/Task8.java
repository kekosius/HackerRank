import java.util.Scanner;

//For each input variable n and appropriate primitive dataType,
//you must determine if the given primitives are capable of storing it. If yes, then print:
//n can be fitted in:
//* dataType
//If the number cannot be stored in one of the four aforementioned primitives, print the line:
//n can't be fitted anywhere.


public class Task8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        long n;

        long longMax = (long) (Math.pow(2, 63) - 1);
        long longMin = (long) -(Math.pow(2, 63));
        int intMax = (int) (Math.pow(2, 31) - 1);
        int intMin = (int) -(Math.pow(2, 31));
        short shortMax = (short) (Math.pow(2, 15) - 1);
        short shortMin = (short) -(Math.pow(2, 15));
        byte byteMax = (byte) (Math.pow(2, 7) -1);
        byte byteMin = (byte) -(Math.pow(2, 7));

        String inputValue;
        input.nextLine();


        for (int i = 0; i < T; i++) {

            inputValue = input.nextLine();

            try {
                n = Long.parseLong(inputValue);
            } catch (Exception e) {
                System.out.println(inputValue + " can't be fitted anywhere.");
                continue;
            }

            System.out.println(inputValue + " can be fitted in:");

            if (n <= byteMax && n >= byteMin) {
                System.out.println("* byte");
            }
            if (n <= shortMax && n >= shortMin){
                System.out.println("* short");
            }
            if (n <= intMax && n >= intMin){
                System.out.println("* int");
            }
            if (n <= longMax && n >= longMin){
                System.out.println("* long");
            }
        }
    }

}
