package main;



import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aleja
 */
public class BackgroundPanel extends JPanel {
    private Image bg;
    private String path;
    
    public BackgroundPanel(String path) {
        this.path = path;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Cast Graphics object to Graphics2D for rendering hints
        Graphics2D g2d = (Graphics2D) g.create();
        
        // Apply rendering hints for smoother image rendering
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Draw the image with smooth rendering
        bg = new ImageIcon(getClass().getResource(path)).getImage();
        g2d.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
        
        // Dispose of the Graphics2D object to release resources
        g2d.dispose();
    }
}