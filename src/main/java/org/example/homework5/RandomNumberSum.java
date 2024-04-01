package org.example.homework5;
import java.util.Random;

public class RandomNumberSum {
    public static void main(String[] args) {
        Random random = new Random();
        int[] occurrences = new int[121111111];
        int sum = 0;
        int count = 0;

        while (true) {
            int randomNumber = random.nextInt(100) + 1;
            count++;
            System.out.println("Generated number: " + randomNumber);

            if (occurrences[randomNumber] == 1) {
                System.out.println("Number " + randomNumber + " appeared for the second time.");
                break;
            }

            occurrences[randomNumber]++;
            sum += randomNumber;
        }

        System.out.println("Total sum of generated numbers: " + sum);
        System.out.println("Total amount of numbers generated: " + count);
    }
}
