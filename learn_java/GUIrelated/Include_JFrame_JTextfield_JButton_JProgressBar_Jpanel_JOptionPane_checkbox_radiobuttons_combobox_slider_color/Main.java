//learn java GUI related things 
//Include_JFrame_JTextfield_JButton_JProgressBar_Jpanel_JOptionPane_Jcheckbox_Jradiobuttons_Jcombobox_Jslider_color
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener, ChangeListener{
    JButton button;
    JTextField textField;
    JButton textbutton;
    public static JProgressBar progressBar;

    public static void main(String[] args) {

        JFrame frame =new JFrame();   //new frame
        JPanel panel_1 = new JPanel(new BorderLayout()); //new panel
        panel_1.setLayout(new BorderLayout());
        panel_1.setBackground(Color.green);
        panel_1.setBounds(100,200,200,200);

        JPanel panel_2 = new JPanel(); //new panel
        panel_2.setBackground(Color.red);
        panel_2.setBounds(300,500,200,200);
        //panel_2.setLocation(label_2.getX()+100, label_2.getY()+10);

        JPanel panel_3 = new JPanel(); //new panel
        panel_3.setBackground(Color.red);
        panel_3.setBounds(500,700,200,200);
        panel_3.setLocation(panel_3.getX()+100, panel_3.getY()+10);  //change location of panel_3

        JButton button = new JButton("initial");  //new button
        button.setBounds(400,400,150,50);
        button.setText("button");
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setEnabled(true);
        //button.addActionListener(e -> System.out.println("1233"));    //or use this code
        button.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e) {
            if(e.getSource()==button){
                System.out.println("button pressed");
                JOptionPane.showMessageDialog(null, "massage", "massage", JOptionPane.PLAIN_MESSAGE);
                JOptionPane.showMessageDialog(null, "massage", "massage", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "massage", "massage", JOptionPane.QUESTION_MESSAGE);
                JOptionPane.showMessageDialog(null, "massage", "massage", JOptionPane.WARNING_MESSAGE);
                JOptionPane.showMessageDialog(null, "massage", "massage", JOptionPane.ERROR_MESSAGE);
                /*int n = //<-storage value inside */JOptionPane.showConfirmDialog(null, "message", "title", JOptionPane.YES_NO_CANCEL_OPTION); // return y =0, n=1, c=2, x= -1
                String something = JOptionPane.showInputDialog(null, "enter something");
                System.out.println(something);
                JOptionPane.showOptionDialog(null, "Option", "title", JOptionPane.YES_NO_OPTION, 
                JOptionPane.PLAIN_MESSAGE, null/*icon*/, null/*options, use array*/, 0/*initialValue*/);
                }
            }
        });
        
        Border border = BorderFactory.createLineBorder(Color.ORANGE,5);
        frame.setSize(900,900);
        frame.setLayout(null);  // no using manager, need add x and y  and other value.
        frame.setTitle("I am frame title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //EXIT_ON_CLOSE = close, DO_NOTHING_ON_CLOSE = WON'T CLOSE, HIDE_ON_CLOSE=hide on close
        frame.setResizable(true);       //false = cannot
        //frame.getContentPane().setBackground(Color.gray); //<-use default color
        frame.getContentPane().setBackground(new Color(0,123,123));  // use rgb value, 0xFFFFFF format still ok

        ImageIcon icon = new ImageIcon("icon.PNG");
        frame.setIconImage(icon.getImage());
        
       

        JLabel label_1 = new JLabel("initial text"); // new label_1
        ImageIcon image_1 = new ImageIcon("labeltest.png"); //label_1 image
        label_1.setIcon(image_1);
        label_1.setVerticalTextPosition(JLabel.TOP);    //TOP, CENTER (the default), or BOTTOM.
        label_1.setHorizontalTextPosition(JLabel.LEFT);   // LEFT, CENTER, RIGHT(DEAFULT), LEADING or TRAILING
        label_1.setText("label 1 label 1 label 1");
        label_1.setForeground(new Color(0xFF0000));    //font color
        label_1.setFont(new Font("MingLiU", Font.BOLD, 18));   //setfont format
        label_1.setIconTextGap(10);   ///gap between image and font
        label_1.setBackground(Color.blue);
        label_1.setOpaque(true);
        label_1.setBorder(border);
        label_1.setVerticalAlignment(JLabel.CENTER);   //TOP, CENTER (the default), or BOTTOM.
        label_1.setHorizontalAlignment(JLabel.CENTER);  //LEFT, CENTER (the default for image-only labels), RIGHT, LEADING (the default for text-only labels) or TRAILING.
        label_1.setBounds(10,10,600, 300);  //(x,y, x,y)

        JLabel label_2 = new JLabel("initial text2"); // new label_2
        label_2.setText("lebal 2 label 2 label 2");
        label_2.setOpaque(false);
        label_2.setBounds(10,10,100, 100);
        label_2.setHorizontalTextPosition(JLabel.LEFT);
        //label_2.setBounds(x,y,x,y); if setLayout(null)

        JLabel label_n = new JLabel("initial text");
        label_n.setBounds(0,600,100, 100);
        label_n.setOpaque(true);
        label_n.setBackground(Color.GRAY);
        label_n.setText("<html><body style='text-align: center'><p>label n label n label n<br/>html</p></html>");
        //use html to set newline plus center


        //text field
        JButton textbutton = new JButton("enter text");
        JTextField textField = new JTextField();
        textField.setEditable(true);
        textField.setPreferredSize(new Dimension(30,30));
        //textField.setCaretColor(Color.gray);  //caret is the | to enter character
        textbutton.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e) {   // need get if(e.getSource()==textbutton){} if use outside main 
            System.out.println(textField.getText());
            
            }
        });
        
        //checkbox

        JCheckBox checkBox = new JCheckBox();
        frame.add(checkBox);
        checkBox.setBounds(600,500,20, 20);
        checkBox.setFocusable(false);
        JButton checlboxbutton = new JButton("checkbox");
        frame.add(checlboxbutton);
        checlboxbutton.setBounds(620,500,100, 20);
        checlboxbutton.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e) {
            System.out.println(checkBox.isSelected());
            
            }
        });    //check box can use setIcon and setSelectedIcon to set image when checkbox selected

        //radio buttons
        JRadioButton radioButton_a = new JRadioButton("a");
        radioButton_a.setBounds(620,530,100, 20);
        radioButton_a.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e) {
            System.out.println("a");
            
            }});
        JRadioButton radioButton_b = new JRadioButton("b");
        radioButton_b.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e) {
            System.out.println("b");
            
            }});
        radioButton_b.setBounds(620,550,100, 20);
        ButtonGroup rgroup = new ButtonGroup();
        rgroup.add(radioButton_a);
        rgroup.add(radioButton_b);
        frame.add(radioButton_a);
        frame.add(radioButton_b);

        //combobox
        String[] combobox = {"ee","ff","gg"};
        JComboBox comboBox= new JComboBox(combobox);
        comboBox.setBounds(620,600,100, 20);
        comboBox.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e) {
            System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getItemCount());

            }});
        comboBox.setEditable(true);
        comboBox.addItem("hh");
        comboBox.insertItemAt("aa", 0);
        comboBox.setSelectedIndex(0);
        comboBox.removeItem("ee");
        comboBox.removeItemAt(3);    //remove@ index
        //comboBox.removeAllItems();  
        frame.add(comboBox);

        //slider
        JSlider slider = new JSlider(0,100,70);  //smallest, biggest, default
        slider.setBounds(620,650,200, 100);
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(5);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(10);
        slider.setPaintLabels(true);
        frame.add(slider);
        //slider.setOrientation(SwingConstants.VERTICAL);   //become vertical
        slider.addChangeListener(new ChangeListener() {public void stateChanged(ChangeEvent e) {

            System.out.println(slider.getValue());
                }});
        

        //change color button
        JButton button_color_change = new JButton("Choose Color");
        button_color_change.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e) {
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Chooose color", Color.black);
            panel_2.setBackground(color);
        }});

        panel_2.add(button_color_change);
        
        panel_2.add(textbutton);
        panel_2.add(textField);
        panel_1.add(label_2);
        
        frame.add(panel_1);
        frame.add(panel_2);
        frame.add(label_1);
        frame.add(panel_3);
        frame.add(label_n);
        frame.add(button);

        frame.setVisible(true);            //visible frame

        //button.deClick(); <-- program click 1 click
        
        //frame.dispose();
        //frame.pack(); canbe use if no setbound used like tkinter , add first then pack
        //can use BoraderLayout, FlowLayout, GridLayout 

        //JLayeredPane layerpane = new JLayeredPane();  //Default <Palette<Modal<Popup<Drag ,  Interger.valueOf(0-4)
        //layeredPane.setBounds(x,y,x,y)
        //layeredPane.add(label_1, JLayeredPane.DEFAULT_LAYER)  //layeredPane

    }

    
        
    

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void stateChanged(ChangeEvent e) {
        // TODO Auto-generated method stub
        
    }

    
}   
