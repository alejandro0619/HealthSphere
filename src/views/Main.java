/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

/**
 *
 * @author Aleja
 */
public class Main {
        /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {            
            FlatMacLightLaf.setup();
        } catch(Exception e) {
            e.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new views.Login().setVisible(true);
            }
        });

       
    }
}
