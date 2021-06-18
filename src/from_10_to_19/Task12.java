package from_10_to_19;

import java.util.Calendar;
import java.util.Scanner;

//You are given a date. You just need to write the method which returns the day on that date.

public class Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] date = input.nextLine().split(" ");
        int month = Integer.parseInt(date[0]);
        int day = Integer.parseInt(date[1]);
        int year = Integer.parseInt(date[2]);
        String anw = "";

        input.close();

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH, day);

        switch (cal.get(Calendar.DAY_OF_WEEK)) {
            case (1) -> anw = "Sunday";
            case (2) -> anw = "Monday";
            case (3) -> anw = "Tuesday";
            case (4) -> anw = "Wednesday";
            case (5) -> anw = "Thursday";
            case (6) -> anw = "Friday";
            case (7) -> anw = "Saturday";
        }

        anw = anw.toUpperCase();
        System.out.println(anw);
    }
}

