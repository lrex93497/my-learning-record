import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


public class File_class_and_write_and_read{
    public static void main(String[] args) throws IOException{   //file.delete(); to delete file, need  throws IOException for read file
        File file = new File("test.txt");   //same folder
        if(file.exists()) {
            System.out.println("file found.");
            System.out.println(file.getPath());
            System.out.println(file.isFile());
            System.out.println(file.getAbsolutePath());

        }
        else {
            System.out.println("file not found.");
        }
        /*File file2 = new File("xxxxx:\\learn_java\\File_class\\test.txt"); // full path
        if(file2.exists()) {
            System.out.println("file found.");
            System.out.println(file.getPath());
            System.out.println(file.isFile());
            System.out.println(file.getAbsolutePath());
        }
        else {
            System.out.println("file not found.");
        }*/
        
        //write
        
        try{
            FileWriter writer = new FileWriter("test3.txt");
            writer.write("Test\n FileWriter \n 1234");
            writer.append("\nnew line");
            writer.flush();
            writer.close();
        }
        catch(IOException e){
            System.out.println("error");
            e.printStackTrace();
            
        }

        //read
        try{
            FileReader reader = new FileReader("test3.txt");
            int data = reader.read();
            while(data != -1){
                System.out.print((char)data);   //make data<-(int value contains byte values) back into char
                data = reader.read(); 
            }
            reader.close();
        }
        catch(FileNotFoundException exception){
            exception.printStackTrace();
        }
		
		//read into one string
		String content = new String(Files.readAllBytes(Paths.get("test.txt")), StandardCharsets.UTF_8);

    }
}