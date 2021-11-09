//deserialization
import java.io.*;

public class Main{

    public static void main(String args[]){
        Test test = null;

        try{
        FileInputStream fileIn = new FileInputStream("test.ser");   //location
        ObjectInputStream in = new ObjectInputStream(fileIn);          
        test = (Test) in.readObject();                              //input
        in.close();
        fileIn.close();
        }
        catch(Exception e) {
            
        }

        //serialVersionUID
        long serialVersionUID = ObjectStreamClass.lookup(test.getClass()).getSerialVersionUID();
        System.out.println("SerialVersionUID = " + serialVersionUID);   
        
        System.out.print("Deserialization complete : " + "data_1 is "+ test.data_1 + " data_2 is " + test.data_2);
    }
    
}