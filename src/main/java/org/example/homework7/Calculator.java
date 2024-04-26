package org.example.homework7;

public class Calculator {
    public enum RomanNumber {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);

        private final int value;

        RomanNumber(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static int calculate(RomanNumber num1, RomanNumber num2, String operation) {
        int val1 = num1.getValue();
        int val2 = num2.getValue();

        return switch (operation) {
            case "+" -> val1 + val2;
            case "-" -> val1 - val2;
            case "*" -> val1 * val2;
            case "/" -> val1 / val2;
            default -> throw new IllegalArgumentException("Invalid operation: " + operation);
        };
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        RomanNumber num1 = RomanNumber.X;
        RomanNumber num2 = RomanNumber.C;

        String operation = "+";
        int result = Calculator.calculate(num1, num2, operation);
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }
}
