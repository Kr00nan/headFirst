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

        // creates gradient coloring and applies it to a circle
//        Graphics2D g2d = (Graphics2D) g;
//        GradientPaint gradient = new GradientPaint(70, 70, Color.blue, 150, 150, Color.orange);
//        g2d.setPaint(gradient);
//        g2d.fillOval(70, 70, 100, 100);

        // same as above but randomizes the colors
        Graphics2D g2d = (Graphics2D) g;
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random() * 256);
        green = (int) (Math.random() * 256);
        blue = (int) (Math.random() * 256);
        Color endColor = new Color(red, green, blue);

        // randomizes the size of the circle
        int randSize = (int) (Math.random() * this.getWidth());

        // randomize the location of the circle
        int randX = (int) (Math.random() * this.getWidth() - randSize);
        int randY = (int) (Math.random() * this.getHeight() - randSize);

        // keep circle within the boundaries of the window
        if (randX < 0) { randX = 0; }
        if (randY < 0) { randY = 0; }

        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(randX, randY, randSize, randSize);

    }
}
