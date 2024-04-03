package org.example.homework6;
import java.util.Scanner;

public class ConsolCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "yes";

        while (choice.equals("yes")) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter an arithmetic operation (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero");
                        continue; // Restart the loop
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operation");
                    continue; // Restart the loop
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            choice = scanner.next().toLowerCase();
        }

        System.out.println("Exiting the calculator");
        scanner.close();
    }
}
