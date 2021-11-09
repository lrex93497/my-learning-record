import java.util.logging.*;
import java.sql.*;


public class MySQLStroedProcedures {
    Connection con;
    public static void main(String[] args) {
        MySQLStroedProcedures run = new MySQLStroedProcedures();
        run.createConnectionAndRun();
        run.callStoredProcedures();
    }

    void createConnectionAndRun(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   //loading the driver
            //connect to MySQL       
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testmysql", "root", "0000");
            //^  localhost, port 3306, testmysql 
            System.out.println("Database Connection success");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLStroedProcedures.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MySQLStroedProcedures.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //batch operation

    void callStoredProcedures(){
        try{
            CallableStatement stmt = con.prepareCall("{call simple(500)}");   /* call simple in mysql if have parameter, use simple(?,...)--*/
            /* "simple" is to find in column "number" that have value less than parameter in test 1--*/
            /* OUT stmt.registerOutParameter(n, java.sql.Types.INTEGER);  DOUBLE VARCHAR  --*/
            /* get.Int(n)  or other parameters --*/
            Boolean ifHasResult = stmt.execute();
            if(ifHasResult){
                ResultSet res = stmt.getResultSet();

                while(res.next()){
                    System.out.println(res.getInt("number"));
                }
            }
            stmt.close();
            /*  if preparedstatment, add stmt.clearParameters(); after .addBatch after each statements--*/
        }
        catch(SQLException ex){
            Logger.getLogger(MySQLStroedProcedures.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

}
