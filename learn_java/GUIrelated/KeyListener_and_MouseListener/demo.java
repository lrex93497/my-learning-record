//KeyListener_and_MouseListener
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;



public class demo extends JFrame implements KeyListener, MouseListener {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Mouse here");

    public demo(){
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setTitle("I am frame title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //EXIT_ON_CLOSE = close, DO_NOTHING_ON_CLOSE = WON'T CLOSE, HIDE_ON_CLOSE=hide on close
        frame.setResizable(true); 
        frame.addKeyListener(this);
        
        label.setBounds(0,0,150,150);
        label.addMouseListener(this);
        label.setBackground(Color.red);
        label.setOpaque(true);
        frame.add(label);

        frame.setVisible(true);
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("keyPressed+ " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("keyReleased+ " + e.getKeyChar());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("keyTyped");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouseClicked");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("mouseEntered");
        label.setBackground(Color.green);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("mouseExited");
        label.setBackground(Color.red);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("mousePressed");
        label.setBackground(Color.blue);
    }
   
    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouseReleased");
        label.setBackground(Color.red);
    }
    
    
}