/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Aleja
 */
public class IDChecker {
    private boolean isValid = false;
    
    private static final String ID_REGEX = "^(V|E|J)[0-9]{7,8}$";
    private static final Pattern pattern = Pattern.compile(ID_REGEX);
    
    public IDChecker(String id) {
        Matcher matcher = pattern.matcher(id);
        this.isValid = matcher.matches();
    }
    
    public boolean isValid() {
        return this.isValid;
    }

}