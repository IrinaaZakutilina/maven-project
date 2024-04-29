package org.example.homework5;

public class EvenDigitsSum {
    public static int getEvenDigitSum(int number) {
        if (number < 1) {
            return -1;
        }

        int digit;
        int sum = 0;

        while (number > 0) {
            digit = number % 10;

            if (isEven(digit)) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;

    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void main(String[] args) {

        System.out.println("Even sum: " + getEvenDigitSum(123456789));
    }
}
