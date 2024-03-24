package org.example.homework3;

public class DivisionCalculator {
    public static void main(String[] args) {
        int dividend = 15;
        int divisor = 2;

        int quotient = dividend / divisor;
        int reminder = dividend % divisor;

        System.out.println("Dividend: " + dividend);
        System.out.println( "Divisor: " + divisor);
        System.out.println("Integer part of the division: " + quotient);
        System.out.println("Reminder of the division: " + reminder);


    }
}
