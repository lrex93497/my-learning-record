import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Demo{

    public Demo(){

        createConnectionAndRun();
        System.out.println("Done");
    }


    void createConnectionAndRun(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testmysql", "root", "0000");
            
            System.out.println("Database Connection success");

            String creatTable = "CREATE TABLE test2("
                              + "name varchar(100),"
                              + "number int,"
                              + "String2 varchar(100)"
                              + ");";  
            Statement stmt = con.createStatement();
            stmt.execute(creatTable);
            stmt.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
