//progress bar
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class demo_Progressbar extends JFrame implements ActionListener{

    JFrame frame = new JFrame();
    JProgressBar progressBar = new JProgressBar(0,100);

    demo_Progressbar(){
        frame.setSize(200,200);
        frame.setLayout(new GridLayout());
        frame.setTitle("I am frame title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //EXIT_ON_CLOSE = close, DO_NOTHING_ON_CLOSE = WON'T CLOSE, HIDE_ON_CLOSE=hide on close
        frame.setResizable(true); 
        
        
        progressBar.setStringPainted(true);; 
        frame.add(progressBar);
        frame.pack();
        progressBar.setValue(0);
        progressBar.setString("abcd");

        
        frame.setVisible(true);

        add();

    }

    

    public void add() {
        int n = 0;
        while(true){
            if(n == 101){
                n = 0;
            }
            progressBar.setValue(n);
            
            try{
            Thread.sleep(50);
            }
            catch(InterruptedException ex) {
                ex.printStackTrace();
            }
            n+=1;

        }
    }

    
    
}