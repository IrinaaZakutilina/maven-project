package org.example.homework7;

public class ValidEmail {
    public static boolean isValidEmail(String email) {
        String regex = "^[\\w!#$%&'*+/=?^`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^`{|}~-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$";
        return email.matches(regex);
    }

    public static void main(String[] args) {
        String[] emails = {"john.doe@example.com", "invalid_email", "user@domain.co.uk", "@domain.com", "user@domain"};
        for (String email : emails) {
            System.out.println(email + " is valid: " + isValidEmail(email));
        }
    }
}
