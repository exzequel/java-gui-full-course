import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    
    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setTitle("Another Frame"); // sets title of frame
        this.setSize(800, 600); // set x and y dimension of frame
        this.setResizable(false);
        this.setVisible(true); // make frame visible

        ImageIcon image = new ImageIcon("logo.png"); // create an image icon
        this.setIconImage(image.getImage()); // change icon of frame to set image

        this.getContentPane().setBackground(new Color(0x123456)); // change background color to custom color
                                                                   // (Hexadecimal)

    }
}
