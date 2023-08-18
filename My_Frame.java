import javax.swing.*;
import java.awt.*;

public class My_Frame extends JFrame
{
    My_Frame()
    {
        this.setTitle("JFrame title goes here"); //This srts title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application.
        this.setResizable(false); //prevent frame from being resized
        this.setSize(420, 420); //sets the X-dimension and Y-dimension of frame
        this.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("TBRaptorsLogo.png"); //create an ImageIcon
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(new Color(123, 50, 250)); //change color of background

    }
}
