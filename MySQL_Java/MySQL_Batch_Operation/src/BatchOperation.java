import java.util.logging.*;
import java.sql.*;


public class BatchOperation {
    Connection con;
    public static void main(String[] args) {
        BatchOperation run = new BatchOperation();
        run.createConnectionAndRun();
        run.addBatch();
    }

    void createConnectionAndRun(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   //loading the driver
            //connect to MySQL       
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testmysql", "root", "0000");
            //^  localhost, port 3306, testmysql 
            System.out.println("Database Connection success");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BatchOperation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BatchOperation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //batch operation

    void addBatch(){
        try{
            Statement stmt = con.createStatement();
            stmt.addBatch("INSERT INTO test1 VALUES('ASD',12, 'SDD')");
            stmt.addBatch("INSERT INTO test1 VALUES('ASDSS',122, 'SDDDD')");
            stmt.addBatch("INSERT INTO test1 VALUES('QWE',2223, 'QWEE')");
            int [] ifsuccess = stmt.executeBatch();
            for (int i : ifsuccess){
                System.out.println(i);      /*  1 success 0 is not success--*/
            }
            stmt.close();
            /*  if preparedstatment, add stmt.clearParameters(); after .addBatch after each statements--*/
        }
        catch(SQLException ex){
            Logger.getLogger(BatchOperation.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

}
