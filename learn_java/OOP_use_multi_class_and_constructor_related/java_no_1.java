import java.util.Scanner;

import jdk.jfr.internal.settings.ThrottleSetting;

/* learn use multiple class  1 which is main and will use class in java_no_2.java and java_no_3.java*/
/* learn constructor and this.*/
/* learn OOP*/
public class java_no_1{
    int q;
    int w;
    int e;
    public static void main(String[] args)
    {       
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter a string please, after entered, program will automatic set private_value in java_no_2.java to default:");
        String string_from_main = input.nextLine();

        java_no_2 java_no_2Object = new java_no_2("default");    //give initial value to constructor
        java_no_2Object.printthings(string_from_main);
        java_no_2Object.printthings1();                         //print value given by constructor

        java_no_3 java_no_3Object = new java_no_3();
        System.out.println("Enter a double, program will calculate other value by * 8 / 7 +3 it :");
        double input_value = input.nextDouble();
        java_no_3Object.cal(input_value);

        java_no_1 java_no_1Object = new java_no_1();
        java_no_1Object.setvalue(233, 1243, 43333); //can be two or three value
        System.out.println("\nThis line is to test >this.< in setvalue: " + java_no_1Object.q +" + "+ java_no_1Object.w);
    }

    public void setvalue(int q, int w) {
        this.q = q;                         // learn this.  , use super() if in parent class parent class
        this.w = w;
        System.out.println("\nThis last line is to test >this.< in setvalue and overloaded constructor: " + this.q +" + "+ this.w);
    }

    public void setvalue(int q, int w, int e) {
        this.q = q;                         // overloaded constructor.
        this.w = w;
        this.e = e;
        System.out.println("\nThis last line is to test >this.< in setvalue and overloaded constructor: " + this.q +" + "+ this.w + " + " + this.e);
    }

}
