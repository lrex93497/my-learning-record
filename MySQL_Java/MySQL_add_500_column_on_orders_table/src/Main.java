import java.util.logging.*;
import java.sql.*;


public class Main {
    Connection con;
    public static void main(String[] args) {
        Main run = new Main();
        run.createConnectionAndRun();
        run.addBatch();
    }

    void createConnectionAndRun(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   //loading the driver
            //connect to MySQL       
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "0000");
            //^  localhost, port 3306, testmysql 
            System.out.println("Database Connection success");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void addBatch(){
        try{
            Statement stmt = con.createStatement();

            for(int i = 4; i < 504; i++){
                int n = i-1;
                stmt.execute("ALTER TABLE `orders_table`  ADD COLUMN `"+ i +"` INT NULL DEFAULT -1 AFTER `"+ n +"`;");
            }
    
            stmt.close();
        }
        catch(SQLException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
