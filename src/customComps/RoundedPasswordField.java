package customComps;

import javax.swing.*;
import java.awt.*;

public class RoundedPasswordField extends JPasswordField {
    private int arcWidth;
    private int arcHeight;

    public RoundedPasswordField() {
        super();
        arcWidth = 20; // Default arc width
        arcHeight = 20; // Default arc height
        setOpaque(false); // Make the password field background transparent
        setEchoChar('*'); // Set the echo character to be displayed as asterisks
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension arcs = new Dimension(arcWidth, arcHeight);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g;

        // Draw a rounded rectangle
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setColor(getBackground());
        graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);

        // Draw the password characters as asterisks
        graphics.setColor(getForeground());
        Font font = getFont();
        graphics.setFont(font);
        FontMetrics metrics = graphics.getFontMetrics(font);
        int x = 5; // Left padding
        int y = ((height - metrics.getHeight()) / 2) + metrics.getAscent();
        String asterisks = new String(getPassword()).replaceAll(".", "*"); // Replace each character with an asterisk
        graphics.drawString(asterisks, x, y);
    }
}
