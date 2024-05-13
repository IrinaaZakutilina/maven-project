package org.example.homework11;

import java.util.HashMap;
import java.util.Map;

public class LetterCounter {
    public static Map<Character, Integer> countLetters(String str) {
        Map<Character, Integer> letterCount = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                char lowerCaseCh = Character.toLowerCase(ch);
                letterCount.put(lowerCaseCh, letterCount.getOrDefault(lowerCaseCh, 0) + 1);
            }
        }
        return letterCount;
    }

    public static void main(String[] args) {
        String str = "Good Day";
        Map<Character, Integer> result = countLetters(str);
        System.out.println(result);
    }
}
