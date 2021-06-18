import java.util.Scanner;

//Complete the given code so that it outputs the area of a parallelogram with breadth B and height H.
//You should read the variables from the standard input.
//If B<=0 or H<=0 , the output should be "java.lang.Exception: Breadth and height must be positive"
//Actually, I don't really get meaning of this task

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int B = input.nextInt();
        int H = input.nextInt();

        if (B > 0 && H > 0){
            int area = B*H;
            System.out.println(area);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        input.close();
    }
}
