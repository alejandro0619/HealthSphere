/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RoundedButton extends JButton {
    private int arcWidth;
    private int arcHeight;
    private boolean pressed;

    public RoundedButton(String text) {
        super(text);

        setOpaque(false); // Make the button transparent
        setContentAreaFilled(false); // Do not paint the content area
        setBorderPainted(false); // Do not paint the border
        setFocusPainted(false); // Do not paint the focus indication
        setBackground(Color.BLUE); // Set background color

        arcWidth = 20; // Default arc width
        arcHeight = 20; // Default arc height

        // Add a mouse listener to detect mouse events
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                pressed = true; // Set the pressed state to true
                repaint(); // Repaint the button
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                pressed = false; // Set the pressed state to false
                repaint(); // Repaint the button
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension arcs = new Dimension(arcWidth, arcHeight);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Adjust the background color based on the pressed state
        if (pressed) {
            graphics.setColor(new Color(217, 217, 217, 40)); // Example: Change to a different color when pressed
        } else {
            graphics.setColor(getBackground());
        }

        // Draw a rounded rectangle
        graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);
        graphics.setColor(getForeground());
        graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);

        graphics.dispose();
    }
}
