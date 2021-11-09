import java.util.logging.*;
import java.sql.*;


public class ConnectAndGetDataAndInsertdata {
    Connection con;
    public static void main(String[] args) {
        ConnectAndGetDataAndInsertdata run = new ConnectAndGetDataAndInsertdata();
        run.createConnectionAndRun();
    }

    void createConnectionAndRun(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   //loading the driver
            //connect to MySQL       
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testmysql", "root", "0000");
            //^  localhost, port 3306, testmysql 
            System.out.println("Database Connection success");

            //getString best to use name, as column may rearrange
            Statement stmt = con.createStatement();  //statement object

            //insert data
            String thingsToInsert = "abc";
            /*String dbop = "INSERT INTO test1 VALUES('" + thingsToInsert +"')"; --*/
            /*stmt.execute(dbop);  --*/
            
            //read data
            ResultSet rs = stmt.executeQuery("SELECT * FROM test1 WHERE name like 'a%'"); 
            /*a% means anything start from a,  use executeUpdate() when add/delete item  --*/  
            /*etc. stmt.setString(number of column, "xxxx")  --*/  
            
            while(rs.next()){
                String test = rs.getString("name");   
                System.out.println(test);
                /*print until data end--*/
            }
            ResultSet rs2 = stmt.executeQuery("SELECT * FROM test1"); 
            while(rs2.next()){
                int testInt = rs2.getInt("number");   
                System.out.println(testInt);
                /*print until data end--*/
            }

            stmt.close();

            /*"DELETE FROM test1 WHERE name = "xxx";"; --*/  	//delete exact value 

            /*PrepareStae,emt --*/

            /*PreparedStatement stmt2 = con.prepareStatement("INSERT INTO test1 VALUES(?,?,?)");*/
            /* ? is unknow value --*/
            /*stmt2.setString(1, "bb2");
            stmt2.setString(2, 33);
            stmt2.setString(3, "dd1");*/     
            /* three column start from 1 --*/
            /*stmt2.execute();
            stmt2.close();*/

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectAndGetDataAndInsertdata.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectAndGetDataAndInsertdata.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
