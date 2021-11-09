//serialization   
//child of parent that have serialization also can do serialization
//static field cannot use serialization
//type of class not recorded 
//transient value will not serialized
//serialVersionUID is long value, mismatch .ser with class will not allow deserialization
//serialVersionUID can be customize or random generate.
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;

public class Main{

    public static void main(String args[]){
        Test test = new Test();
        test.data_1 = "d1";
        test.data_2 = "d22";

        try{
        FileOutputStream fileOut = new FileOutputStream("test.ser"); //location
        ObjectOutputStream out = new ObjectOutputStream(fileOut);   
        out.writeObject(test);                                         //write
        out.close();
        fileOut.close();
        }
        catch(Exception e) {
            
        }

        //serialVersionUID
        long serialVersionUID = ObjectStreamClass.lookup(test.getClass()).getSerialVersionUID();
        System.out.println("SerialVersionUID = " + serialVersionUID); 
        
        
        System.out.print("Serialization complete");
    }
    
}