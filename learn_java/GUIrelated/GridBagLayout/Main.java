//GridBagLayout
import javax.swing.*;
import java.awt.*;

class Main{

    public static void main(String[] args){

        JFrame frame =new JFrame();   //new frame
        frame.setTitle("GridBagLayout");
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();

        JButton[] buttons = new JButton[9];

        //x,y for xy position of GridBagConstraints();

        int x = 0;
        int y = 0;

        for (int n = 0; n<9; n++){
            buttons[n] = new JButton();
            buttons[n].setText("Button: "+String.valueOf(n+1));

            if(x == 3){
                y++;
                x = 0; 
            }

            gbc.insets = new Insets(10,10,10,10); //Insets(int top, int left, int bottom, int right)
            gbc.gridx = x;
            gbc.gridy = y;
            gbc.weightx = 1.0;
            gbc.weighty = 1.0;
            gbc.fill = gbc.BOTH;

            frame.add(buttons[n], gbc);
            x++;
        }

        frame.setVisible(true);
    }



}