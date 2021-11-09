import java.util.Scanner;


/* simple sum caculator */
class get_input_cal{
    public static void main(String[] args){
        double no_1, no_2, answer;

        Scanner input =  new Scanner(System.in);
        System.out.println("Enter first number a:");
        no_1 = input.nextDouble();

        System.out.println("Enter next number b:");
        no_2 = input.nextDouble();
        
        ++no_1;
        --no_2;
        no_1 += 1;
        no_2 -= 1;

        answer = no_1 + no_2;
        System.out.format("a+1+1+b-1-1= " + answer);

    }


}