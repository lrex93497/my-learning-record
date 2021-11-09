import javax.print.DocFlavor.STRING;

//generics method
public class Main{

    public static void main(String args[]){
        Generic_class<Integer> INT1 = new Generic_class<>(1);   
        //if <V,T>, then  Generic_class<Integer><xxxx> one more is needed Generic_class<>(1)(xxxx)
        Generic_class<Character> CHAR1 = new Generic_class<>('s');
        Generic_class<String> STRING1  = new Generic_class<>("asdasd");
        Generic_class<Double>  DOUBLE1  = new Generic_class<>(1.1234);

        System.out.println(INT1.getValue());
        System.out.println(CHAR1.getValue());
        System.out.println(STRING1.getValue());
        System.out.println(DOUBLE1.getValue());
    }
}