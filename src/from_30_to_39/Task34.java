package from_30_to_39;

/*
Let's say you have an integer array and a string array.
You have to write a single method printArray that can print all the elements of both arrays.
The method should be able to accept both integer arrays or string arrays.
 */

public class Task34 {
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};

        Printer.printArray(intArray);
        Printer.printArray(stringArray);
    }
}

class Printer {
    public static <T> void printArray(T[] array){
        for (T element: array) {
            System.out.println(element);
        }
    }
}
