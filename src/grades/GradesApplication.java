package grades;

import util.Input;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        HashMap<String, Student> students = new HashMap<>();
        String userInput;

        System.out.println("Welcome to the grades application!");
        students = addStudents();

        for(String key : students.keySet()) {
            System.out.print(key + "  |  ");
        }

        System.out.println();
        System.out.println("-------------------");

        do {

            System.out.println("Which username do you want grades for?");
            userInput = input.getString();

            if(students.containsKey(userInput)) {
                Student student = students.get(userInput);
                System.out.println(student.getName() + " has a grade average of " + student.getGradeAverage());
            } else {
                System.out.println("No record for that student username exists...");
            }

        } while (input.yesNo("Do you want to continue? y/n"));

    }

    public static HashMap<String, Student> addStudents() {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("student 1");
        student1.addGrade(100);
        student1.addGrade(95);
        student1.addGrade(80);
        student1.addGrade(99);
        student1.addGrade(95);
        student1.addGrade(80);
        student1.addGrade(99);

        Student student2 = new Student("student 2");
        student2.addGrade(11);
        student2.addGrade(40);
        student2.addGrade(100);
        student2.addGrade(12);

        Student student3 = new Student("student 3");
        student3.addGrade(100);
        student3.addGrade(100);
        student3.addGrade(100);
        student3.addGrade(99);

        // puttin' key->value pairs onto a HashMap
        students.put("student 1", student1);
        students.put("student 2", student2);
        students.put("student 3", student3);

        return students;
    }
}