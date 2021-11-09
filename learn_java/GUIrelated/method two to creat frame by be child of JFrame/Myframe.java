import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Myframe extends JFrame{
    Myframe(){
    this.setSize(800,800);
    this.setTitle("I am frame title");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //EXIT_ON_CLOSE = close, DO_NOTHING_ON_CLOSE = WON'T CLOSE, HIDE_ON_CLOSE=hide on close
    this.setResizable(true); //false = cannot
    //this.getContentPane().setBackground(Color.gray); //<-use default color
    this.getContentPane().setBackground(new Color(0,123,123));  // use rgb value, 0xFFFFFF format still ok

    ImageIcon icon = new ImageIcon("icon.PNG");
    this.setIconImage(icon.getImage());
    
    this.setVisible(true);
    }
}