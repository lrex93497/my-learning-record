//jtable and get selected
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class demo implements ActionListener{

    JFrame frame = new JFrame();
    JTable jTable;

    public demo(){
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setTitle("I am frame title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //EXIT_ON_CLOSE = close, DO_NOTHING_ON_CLOSE = WON'T CLOSE, HIDE_ON_CLOSE=hide on close
        frame.setResizable(true); 
        frame.setLayout(new FlowLayout());

        
        String[] columns = {"c1","c2","c3"};
        String[][] data = {{"d1","d2","d3"},{"d4","d5","d6"},{"d7","d8","d9"},{"d7","d8","d9"},{"d7","d8","d9"},{"d7","d8","d9"},{"d7","d8","d9"},{"d7","d8","d9"}};
        jTable = new JTable(data, columns);
        jTable.setPreferredScrollableViewportSize(new Dimension(450,70));
        //jTable.setFillsViewportHeight(true);

        JScrollPane jps = new JScrollPane(jTable);
        jps.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
        jps.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  

        JButton button = new JButton("show selected button");
        button.addActionListener(this);

        frame.add(button);
        frame.add(jps);
        
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(jTable.getSelectedRow());
        System.out.println(jTable.getSelectedColumn());
    }

          
}