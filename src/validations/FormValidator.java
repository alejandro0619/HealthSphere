/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validations;

import customComps.RoundedPasswordField;
import customComps.RoundedTextField;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Aleja
 */
public class FormValidator {
    public static boolean isFormValid(Container container) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            if (component instanceof RoundedTextField || component instanceof RoundedPasswordField) {
                // If it's a text field or password field, check if it's empty
                if (((JTextComponent) component).getText().trim().isEmpty()) {
                    return false; // If empty, return false
                }
            }
        }
        return true; // If all fields are filled, return true
    }
}
