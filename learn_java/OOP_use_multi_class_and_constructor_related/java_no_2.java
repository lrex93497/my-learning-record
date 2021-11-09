
/* learn use multiple class  2  with constructor*/
public class java_no_2{
    private String private_value;

    public java_no_2(String d_string)  // constructor, initial value
    {
        private_value = d_string; 
        System.out.printf("private_value in java_no_2.java setted to %s \n", d_string);
        System.out.printf("private_value in java_no_2.java = %s \n", private_value);
    }

    public void printthings(String string_from_main)
    {
        System.out.println( "used other class in java_no_2.java");
        System.out.println( "String = " + string_from_main + " entered");

        }

    public void printthings1()
    {
        System.out.println( "constructor value = " + private_value);

        }
    }
