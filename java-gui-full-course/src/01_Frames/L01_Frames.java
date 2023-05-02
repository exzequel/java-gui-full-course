import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.*;

public class L01_Frames {
    public static void main(String[] args) {
        // JFrame = a GUI window to add components to

        // JFrame frame  = new JFrame(); // creates a frame

        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        // frame.setTitle("Title Goes Here"); // sets title of frame
        // frame.setSize(800, 600); // set x and y dimension of frame
        // frame.setResizable(false);
        // frame.setVisible(true); // make frame visible

        // ImageIcon image = new ImageIcon("logo.png"); // create an image icon
        // frame.setIconImage(image.getImage()); // change icon of frame to set image

        // // frame.getContentPane().setBackground(Color.green); // change background color to default colors
        // // frame.getContentPane().setBackground(new Color(123, 50, 250)); // change background color to custom color (RGB)
        // frame.getContentPane().setBackground(new Color(0x123456)); // change background color to custom color (Hexadecimal)

        // Using separate frame Class and object
        MyFrame myFrame = new MyFrame();

    }
}
