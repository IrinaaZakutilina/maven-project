package org.example.homework4;

public class TimeConverter {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long minutesInYear = 60 * 24 * 365;
            long years = minutes / minutesInYear;
            long remainingMinutes = minutes % minutesInYear;
            long days = remainingMinutes / (60 * 24);

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(109348);
        printYearsAndDays(-5);
    }
}
