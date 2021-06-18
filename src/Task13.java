import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

//Given a double-precision number, payment, denoting an amount of money, use the NumberFormat class'
//getCurrencyInstance method to convert payment into the US, Indian, Chinese, and French currency formats.

//Because of problems with testing system of HackerRank, this code became so stupid, don't blame me pls

public class Task13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double value = input.nextDouble();
        DecimalFormat round = new DecimalFormat("#.##");
        value = Double.parseDouble(round.format(value).replace(",", "."));

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        Locale INDIA = new Locale("en", "IN" , "Rs.");
        NumberFormat ind = NumberFormat.getInstance(INDIA);
        NumberFormat ch = NumberFormat.getInstance(Locale.CHINA);
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String indOutput = "India: Rs." + ind.format(value);
        String chOutput = "China: \uFFE5" + ch.format(value);

        System.out.println("US: " + us.format(value));
        if (value % 1 == 0) {
            indOutput+=".00";
            chOutput+=".00";
        } else if (value*10 % 1 == 0){
            indOutput+="0";
            chOutput+="0";
        }

        System.out.println(indOutput);
        System.out.println(chOutput);
        System.out.println("France: " + fr.format(value));
    }
}
