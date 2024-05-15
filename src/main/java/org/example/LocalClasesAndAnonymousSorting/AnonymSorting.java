package org.example.LocalClasesAndAnonymousSorting;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class AnonymSorting {

    public static void main(String[] args) {

        Employee e1 = new Employee("Minnie", "Mouse", "01/02/2015");
        Employee e2 = new Employee("Mickey", "Mouse", "05/08/2000");
        Employee e3 = new Employee("Daffy", "Duck", "11/02/2011");
        Employee e4 = new Employee("Daisy", "Duck", "05/03/2013");
        Employee e5 = new Employee("Goofy", "Dog", "23/07/2020");

        List<Employee> list = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));

        printOrderedList(list, "name");
        System.out.println();

        printOrderedList(list, "year");
    }
    public static void printOrderedList(List<Employee> list, String criteria) {
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (criteria.equals("name")) {
                    return e1.getFullName().compareTo(e2.getFullName());
                } else if (criteria.equals("year")) {
                    return e1.getYearsWorked() - e2.getYearsWorked();
                }
                return 0;
            }
        });

        for (Employee employee : list) {
            System.out.println(employee.getFullName() + " - Years Worked: " + employee.getYearsWorked());
        }
    }
    record Employee(String firstName, String lastName, String hireDate) {
        public int getYearsWorked() {
            LocalDate today = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate hireDate = LocalDate.parse(this.hireDate, formatter);
            return today.getYear() - hireDate.getYear();
        }
        public String getFullName() {
            return firstName + " " + lastName;
        }
    }
}