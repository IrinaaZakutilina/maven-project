package org.example.homework12;

import org.example.homework12.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Marley", 22, 85));
        students.add(new Student("Santos", 19, 95));
        students.add(new Student("Luiza", 21, 75));
        students.add(new Student("Mykola", 23, 100));
        students.add(new Student("Konstantin", 20, 60));

        System.out.println("All student names:");
        students.stream()
                .map(Student::getName)
                .forEach(System.out::println);


        System.out.println("\nNames of students older than 20 years:");
        students.stream()
                .filter(student -> student.getAge() > 20)
                .map(Student::getName)
                .forEach(System.out::println);

        System.out.println("\nNames of students who scored an A grade:");
        students.stream()
                .filter(student -> student.getGrade() >= 90)
                .map(Student::getName)
                .forEach(System.out::println);

        double averageGrade = students.stream()
                .mapToInt(Student::getGrade)
                .average()
                .orElse(0);
        System.out.println("\nAverage grade of all students: " + averageGrade);

        System.out.println("\nStudent with the highest grade:");
        Student highestGradeStudent = students.stream()
                .max((s1, s2) -> Integer.compare(s1.getGrade(), s2.getGrade()))
                .orElse(null);
        if (highestGradeStudent != null) {
            System.out.println("Name: " + highestGradeStudent.getName() + ", Grade: " + highestGradeStudent.getGrade());
        }

        long countBelow60 = students.stream()
                .filter(student -> student.getGrade() < 60)
                .count();
        System.out.println("\nNumber of students with a grade below 60: " + countBelow60);
    }
}