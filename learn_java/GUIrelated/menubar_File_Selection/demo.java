//menubar_and_fileselect_and_keylistener
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

public class demo extends JFrame implements ActionListener{

    JFrame frame = new JFrame();
    JMenuBar menuBar = new JMenuBar();
    JMenu filMenu_a1 = new JMenu("a1 <-ALT+A");
    JMenu filMenu_a2 = new JMenu("a2 <-ALT+S");

    JMenuItem item_a1_1 = new JMenuItem("1 <-Q");
    JMenuItem item_a1_2 = new JMenuItem("2 <-W");
    JMenuItem item_a2_1 = new JMenuItem("3 <-R");
    JMenuItem item_a2_2 = new JMenuItem("exit <-E");

    JButton button_select = new JButton("Select file");

    public demo(){
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setTitle("I am frame title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //EXIT_ON_CLOSE = close, DO_NOTHING_ON_CLOSE = WON'T CLOSE, HIDE_ON_CLOSE=hide on close
        frame.setResizable(true); 
        
        button_select.setBounds(100,100,150,50);
        button_select.addActionListener(this);
        button_select.setActionCommand("select");

        menuBar.add(filMenu_a1);
        menuBar.add(filMenu_a2);
        filMenu_a1.add(item_a1_1);
        filMenu_a1.add(item_a1_2);
        filMenu_a2.add(item_a2_1);
        filMenu_a2.add(item_a2_2);

        filMenu_a1.setMnemonic(KeyEvent.VK_A);
        filMenu_a2.setMnemonic(KeyEvent.VK_S);
        item_a1_1.setMnemonic(KeyEvent.VK_Q);
        item_a1_2.setMnemonic(KeyEvent.VK_W);
        item_a2_1.setMnemonic(KeyEvent.VK_R);
        item_a2_2.setMnemonic(KeyEvent.VK_E);
        //.setIcon can use


        item_a1_1.addActionListener(this);
        item_a1_1.setActionCommand("a1_1");
        item_a1_2.addActionListener(this);
        item_a1_2.setActionCommand("a1_2");
        item_a2_1.addActionListener(this);
        item_a2_1.setActionCommand("a2_1");
        item_a2_2.addActionListener(this);
        item_a2_2.setActionCommand("exit");

        
;
        frame.setJMenuBar(menuBar);
        frame.add(button_select);
        frame.setVisible(true);
    }





    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if(command=="a1_1"){
            System.out.println("1");

        }
        if(command=="a1_2"){
            System.out.println("2");

        }
        if(command=="a2_1"){
            System.out.println("3");

        }
        if(command=="exit"){
            System.exit(0);

        }
        if(command=="select"){
            JFileChooser fileChooser = new JFileChooser();
            File current_dir = new File(System.getProperty("user.dir"));  //or "."
            fileChooser.setCurrentDirectory(current_dir);
            int filechoose_response = fileChooser.showOpenDialog(null);    //  showOpenDialog
            if(filechoose_response == JFileChooser.APPROVE_OPTION){   // which is 0
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);

            }
            if(filechoose_response == 1){   //CANCEL_OPTION
                System.out.println("File selection cancelled");
            }
            //ERROR_OPTION also exist
        }
        
    }

   
    
    
}