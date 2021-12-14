package exercises;

import java.awt.*;
import javax.swing.*;

class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g){
        // sets the color, then creates the square
//        g.setColor(Color.orange);
//        g.fillRect(20, 50, 100, 100);

        // grabs catzilla image, then populates panel [didn't work :( ]
//        Image image = new ImageIcon("exercises/catzilla.jpg").getImage();
//        g.drawImage(image, 3, 4, this);

        // fills rect with default color (black)
//        g.fillRect(0,0,this.getWidth(), this.getHeight());

        // random number 0-255 for color values
//        int red = (int) (Math.random() * 256);
//        int green = (int) (Math.random() * 256);
//        int blue = (int) (Math.random() * 256);
//
//        Color randomColor = new Color(red, green, blue);
//        g.setColor(randomColor);
//        g.fillOval(70, 70, 100, 100);

        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(70, 70, Color.blue, 150, 150, Color.orange);
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
    }
}
