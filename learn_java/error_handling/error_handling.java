public class error_handling{
    public static void main(String[] args){
        try{
            int test;
            test = 1234/0;
            System.out.println(test);

        }

        catch(ArithmeticException error){
            System.out.println("ArithmeticException detected");

        }                                                           // can have multiple catch(){}
        catch(Exception error){
            System.out.println("Exception detected");

        }                    
        finally{
            System.out.println("Then still print out something");

        }  
    }

}