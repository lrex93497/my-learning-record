//audio player
import javax.sound.sampled.*;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class audio{
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        
        Scanner scanner = new Scanner(System.in);
        File file = new File("test.wav");   // not in the folder, place your own test.wav
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        System.out.println("enter p =play, s = stop, r = replay(next press p again when stopped),  c = close the program, will play test.wav within same folder");

        while(true){
            String command = scanner.nextLine();
            if(command.equals("p")){
                clip.start();      // start playing
            }
            else if(command.equals("s")){
                clip.stop();
            }
            else if(command.equals("r")){
                clip.setMicrosecondPosition(0);
            }
            else if(command.equals("c")){
                System.out.println("Program exiting");
                break;
            }
            else{
                System.out.println("No desired key entered");
            }

        }
    }


}