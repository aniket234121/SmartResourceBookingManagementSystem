package Util;

public class InputValidator {
    public static boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }
}