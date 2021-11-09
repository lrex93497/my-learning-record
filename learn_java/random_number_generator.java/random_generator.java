import java.lang.Math;
/*random_generator*/
import java.util.Random;

class random_generator{
    public static void main(String[] args){
		
		double max = 1234;
		double min = 123;
		
		double value = 0;
		
		value = Math.random()*(max-min+1)+min;
		
        System.out.println("Random generated number between " + max + " and " + min + " is " + value );

		Random random = new Random();

		value = random.nextInt(1234);   //0 - 1234

		System.out.println("Random generated number " + value );



    }
}