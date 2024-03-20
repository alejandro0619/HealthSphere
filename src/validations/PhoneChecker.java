/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validations;

/**
 *
 * @author Nyderlin Rivas
 */
import java.util.regex.*;

public class PhoneChecker {
    private boolean isValid = false;
    private static final String PHONE_REGEX = "^(\\+\\d{1,3})?\\s?\\d{4}-\\d{7}$";
    private static final Pattern pattern = Pattern.compile(PHONE_REGEX);

    public PhoneChecker(String phoneNumber) {
        Matcher matcher = pattern.matcher(phoneNumber);
        isValid = matcher.matches();
    }

    public boolean isValid() {
        return isValid;
    }
}
