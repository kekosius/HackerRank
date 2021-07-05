package from_20_to_29;

import java.util.*;

/*
There are a number of students in a school who wait to be served.
Two types of events, ENTER and SERVED, can take place which are described below.
 -> ENTER: A student with some priority enters the queue to be served.
 -> SERVED: The student with the highest priority is served (removed) from the queue.
A unique id is assigned to each student entering the queue.
The queue serves the students based on the following criteria (priority criteria):
 -> The student having the highest Cumulative Grade Point Average (CGPA) is served first.
 -> Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
 -> Any students having the same CGPA and name will be served in ascending order of the id.
The locked stub code prints the names of the students yet to be served in the priority order.
If there are no such student, then the code prints EMPTY.
*/


public class Task25 {
    private final static Priorities priorities = new Priorities();
    private final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(input.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = input.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }

    }
}



class Student {
    public double getCgpa() {
        return cgpa;
    }

    public int getId() {
        return id;
    }

    int id;
    String name;
    double cgpa;

    public Student(String name, double cgpa, int id) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }


    public String getName() {
        return name;
    }

}

class Priorities {
    public List<Student> getStudents(List<String> events){

        Queue<Student> priorityQueue = new PriorityQueue<>(
                Comparator.comparing(Student::getCgpa).reversed()
                        .thenComparing(Student::getName)
                        .thenComparing(Student::getId)
        );
        String[] command;

        for (String event : events) {
            command = event.split(" ");

            switch (command[0]) {
                case ("ENTER") -> {
                    String name = command[1];
                    double cgpa = Double.parseDouble(command[2]);
                    int id = Integer.parseInt(command[3]);
                    priorityQueue.add(new Student(name, cgpa, id));
                }
                case ("SERVED") -> priorityQueue.poll();
            }
        }

        List<Student> result = new ArrayList<>();
        int loops = priorityQueue.size();
        for (int i = 0; i < loops; i++) {
            result.add(priorityQueue.poll());
        }
        return result;
    }

}


