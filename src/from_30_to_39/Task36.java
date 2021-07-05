package from_30_to_39;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/*
You are given a list of student information:
ID, FirstName, and CGPA. Your task is to rearrange them according to their CGPA in decreasing order.
If two student have the same CGPA, then arrange them according to their first name in alphabetical order.
If those two students also have the same first name, then order them according to their ID.
No two students have the same ID.
 */

public class Task36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Student> studentList = new ArrayList<>();
        int id;
        String name;
        double cgpa;

        while (n-- >0){
            id = input.nextInt();
            name = input.next();
            cgpa = input.nextDouble();
            Student student = new Student(id, name, cgpa);
            studentList.add(student);
        }
        input.close();
        MyComparator comp = new MyComparator();
        studentList.sort(comp);

        for (Student student : studentList) {
            System.out.println(student.getName());
        }
    }
}

//What is this??

record Student(int id, String name, double cgpa) {

    public int getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String getName() {
        return name;
    }
}

class MyComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        int result;
        result = (int) (o2.getCgpa()*10000 - o1.getCgpa()*10000);
        if (result != 0) return result;
        result = o1.getName().compareTo(o2.getName());
        if (result != 0) return result;
        result = o2.getId() - o1.getId();
        return result;
    }
}
