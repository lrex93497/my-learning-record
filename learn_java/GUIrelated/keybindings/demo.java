//Keybindings
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class demo extends JFrame{

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Mouse here");
    JLabel label_2 = new JLabel("<html><body style='text-align: center'><p>keybind move W->up,A->left,S->down,<br/>D->right</p></html>");  
    //use html to set newline plus center
    
    Action  UpAction = new upAction();
    Action  DownAction  = new downAction();
    Action  LeftAction  = new leftAction();
    Action  RightAction = new rightAction();

    public demo(){
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setTitle("I am frame title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //EXIT_ON_CLOSE = close, DO_NOTHING_ON_CLOSE = WON'T CLOSE, HIDE_ON_CLOSE=hide on close
        frame.setResizable(true); 
       
        
        label.setBounds(0,0,150,150);
        label.setBackground(Color.red);
        label.setOpaque(true);
        frame.add(label);
        
        label_2.getInputMap().put(KeyStroke.getKeyStroke("W"), "UpAction"); //get input key
        label_2.getActionMap().put("UpAction", UpAction);            // do what
        label_2.getInputMap().put(KeyStroke.getKeyStroke("A"), "LeftAction"); 
        label_2.getActionMap().put("LeftAction", LeftAction); 
        label_2.getInputMap().put(KeyStroke.getKeyStroke("D"), "RightAction"); 
        label_2.getActionMap().put("RightAction", RightAction); 
        label_2.getInputMap().put(KeyStroke.getKeyStroke("S"), "DownAction"); 
        label_2.getActionMap().put("DownAction", DownAction); 
        
        label_2.setBounds(150,150,150,150);
        label_2.setBackground(Color.gray);
        label_2.setOpaque(true);
        frame.add(label_2);

        frame.setVisible(true);
        
    }

    public class upAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label_2.setLocation(label_2.getX(), label_2.getY()-20);
		}		
	}
	public class downAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label_2.setLocation(label_2.getX(), label_2.getY()+20);	
		}		
	}
	public class leftAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label_2.setLocation(label_2.getX()-20, label_2.getY());	
		}		
	}
	public class rightAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label_2.setLocation(label_2.getX()+20, label_2.getY());
		}		
	}

    
    
}