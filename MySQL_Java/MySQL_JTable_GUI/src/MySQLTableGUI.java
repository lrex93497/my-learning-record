import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class MySQLTableGUI implements ActionListener{

    JFrame frame;
    JButton refreshButton;
    Connection con;
    JTable jTable;
    DefaultTableModel tableModel;

    public MySQLTableGUI(){

        createConnectionAndRun();

        JFrame frame= new JFrame();
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setTitle("I am frame title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //EXIT_ON_CLOSE = close, DO_NOTHING_ON_CLOSE = WON'T CLOSE, HIDE_ON_CLOSE=hide on close
        frame.setResizable(true); 
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);

        //String[] columns = {"","",""};
        //String[][] data = {{"","",""},{"","",""},{"","",""},{"","",""},{"","",""},{"","",""},{"","",""}};
        
        tableModel = new DefaultTableModel();
        JTable jTable = new JTable(tableModel);
        tableModel.addColumn("name");
        tableModel.addColumn("number");
        tableModel.addColumn("String2");

        jTable.setPreferredScrollableViewportSize(new Dimension(450,70));
        //jTable.setFillsViewportHeight(true);

        JScrollPane jps = new JScrollPane(jTable);
        jps.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
        jps.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  

        refreshButton = new JButton("refresh");
        refreshButton.setSize(50,50);
        refreshButton.addActionListener(this);
        frame.add(jps);
        frame.add(refreshButton);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //tableModel = (DefaultTableModel) jTable.getModel();
        System.out.println(tableModel);
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testmysql", "root", "0000");
        
        System.out.println(tableModel);
        Statement stmt = con.createStatement();
        ResultSet rs3 = stmt.executeQuery("SELECT * FROM test1");
            while(rs3.next()){
                tableModel.addRow(new Object[]{rs3.getString(1), rs3.getInt(2),rs3.getString(3)});
            }
        stmt.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    void createConnectionAndRun(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testmysql", "root", "0000");
            
            System.out.println("Database Connection success");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLTableGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MySQLTableGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
