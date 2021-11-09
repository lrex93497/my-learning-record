public class Main{
    public static void main(String[] args){
        
        encapsulation_and_get_encapsulated_value test = new encapsulation_and_get_encapsulated_value("private");
        encapsulation_and_get_encapsulated_value test2 = new encapsulation_and_get_encapsulated_value("2");
        encapsulation_and_get_encapsulated_value test3 = new encapsulation_and_get_encapsulated_value("3");
        encapsulation_and_get_encapsulated_value test4 = new encapsulation_and_get_encapsulated_value(test2); //COPY TEST2

        System.out.println(test.gettest_string());
        test.settest_string("second value");
        System.out.println(test.gettest_string());

        System.out.println(test2.gettest_string());  
        System.out.println(test3.gettest_string());

        test3.copy(test2);               //test copy method   2 copy to 3
        System.out.println(test2.gettest_string());  
        System.out.println(test3.gettest_string());
        System.out.println(test4.gettest_string());



    }
}