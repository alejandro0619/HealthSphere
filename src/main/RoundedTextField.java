package main;


import javax.swing.*;
import java.awt.*;

public class RoundedTextField extends JTextField {
    private int arcWidth;
    private int arcHeight;

    public RoundedTextField() {
        super();
        arcWidth = 20; // Default arc width
        arcHeight = 20; // Default arc height
        setOpaque(false); // Make the text field background transparent
        
        // Set caret color to contrast with text field background
        setCaretColor(Color.BLACK); // Change to your desired caret color
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension arcs = new Dimension(arcWidth, arcHeight);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g.create();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw a rounded rectangle
        graphics.setColor(getBackground());
        graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);
        graphics.setColor(getForeground());
        graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);

        // Set text color to contrast with background
        graphics.setColor(getForeground());

        // Set font of your choice
        Font font = new Font("Hack Nerd Font Propo", Font.PLAIN, 12); // Change to your desired font
        graphics.setFont(font);

        // Draw the text aligned to the left
        FontMetrics metrics = graphics.getFontMetrics(font);
        int x = 5; // Left padding
        int y = ((height - metrics.getHeight()) / 2) + metrics.getAscent();
        graphics.drawString(getText(), x, y);

        graphics.dispose();
    }
}