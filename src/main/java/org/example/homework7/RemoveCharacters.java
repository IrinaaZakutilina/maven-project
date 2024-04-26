package org.example.homework7;

public class RemoveCharacters {
    public static String removeCharacters(String input, char[] charsToRemove) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            boolean found = false;
            for (char c : charsToRemove) {
                if (ch == c) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "abcd4efabc123deabcdaaa";
        char[] charsToRemove = {'a', 'd', '3'};
        String output = removeCharacters(input, charsToRemove);
        System.out.println("Original String: " + input);
        System.out.println("Characters to Remove: " + new String(charsToRemove));
        System.out.println("Modified String: " + output);
    }
}
