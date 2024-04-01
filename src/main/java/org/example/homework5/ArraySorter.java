package org.example.homework5;
import java.util.Random;

public class ArraySorter {
    public static int[] getIntegers(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
    public static int[] sortIntegers(int[] array) {
        int n = array.length;
        int[] sortedArray = array.clone();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sortedArray[j] < sortedArray[j + 1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }
        return sortedArray;
    }
    public static void main(String[] args) {
        int[] numbers = getIntegers(5);
        System.out.println("Original array:");
        printArray(numbers);

        int[] sortedNumbers = sortIntegers(numbers);
        System.out.println("\nSorted array in descending order:");
        printArray(sortedNumbers);
    }
}