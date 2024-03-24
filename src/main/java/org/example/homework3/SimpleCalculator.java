package org.example.homework3;

public class SimpleCalculator {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 3;

        int sum = num1 + num2;
        System.out.println("Sum " +  sum);

        int subtraction = num1 - num2;
        System.out.println("Subtraction " +  subtraction);

        int multiplication = num1 * num2;
        System.out.println("Multiplication " +  multiplication);

        double division = (double) num1 / num2;
        System.out.println("Division: " +  division);
    }
}
