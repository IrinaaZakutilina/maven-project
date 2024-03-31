package org.example.homework4;

public class LeapYearCalculator {
    public static void main(String[] args) {
        int[] years = {1999, 2000, 2100, 2400, 1804, 0 };
        for (int year : years) {
            System.out.println(year + ": " + isLeapYear(year));
        }
    }
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else {
            return year % 400 == 0;
        }
    }
}