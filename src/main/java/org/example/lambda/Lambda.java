package org.example.lambda;

import java.util.Arrays;

public class Lambda {
    public static void main(String[] args) {
        String sentence = "This is a test sentence to check Lambda";
        splitAndPrint(sentence);
    }

    public static void splitAndPrint(String sentence) {

        String[] words = sentence.split(" ");

        Arrays.asList(words).forEach(word -> System.out.println(word));
    }
}

