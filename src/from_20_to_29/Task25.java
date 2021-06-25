package from_20_to_29;

import java.util.*;



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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Double.compare(student.cgpa, cgpa) == 0 && Objects.equals(name, student.name);
    }
//Remake hashCode!!
    @Override
    public int hashCode() {
        return Objects.hash(id, name, cgpa);
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events){
        Comparator<Student> studentComparator = Comparator.comparingInt(Student::hashCode);

        Queue<Student> priorityQueue = new PriorityQueue<>(5, studentComparator);
        String[] command;

        for (String event : events) {
            command = event.split(" ");

            switch (command[0]) {
                case ("ENTER") -> {
                    String name = command[1];
                    double cgpa = Integer.parseInt(command[2]);
                    int id = Integer.parseInt(command[3]);
                    priorityQueue.add(new Student(name, cgpa, id));
                }
                case ("SERVED") -> priorityQueue.poll();
            }
        }

        List<Student> result = new ArrayList<>();
        for (int i = 0; i < priorityQueue.size(); i++) {
            result.add(priorityQueue.poll());
        }
        return result;
    }

}


