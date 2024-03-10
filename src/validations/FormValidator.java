/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validations;

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
            if (component instanceof Container) {
                // If it's a container, recursively check its child components
                if (!isFormValid((Container) component)) {
                    return false; // If any child component is empty, return false
                }
            } else if (component instanceof JTextField || component instanceof JPasswordField) {
                // If it's a text field or text area, check if it's empty
                if (((JTextComponent) component).getText().trim().isEmpty()) {
                    return false; // If empty, return false
                }
            }
            // Add additional checks for other types of input fields if needed
        }
        return true; // If all fields are filled, return true
    }
}
