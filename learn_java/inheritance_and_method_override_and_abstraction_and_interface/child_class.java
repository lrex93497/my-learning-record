public class child_class extends parent_class{     //if public abstract class used, child_class cannot be instantiated 

    @Override                                       //if parent method_2 is abstract void(only a void with nothing), it must implement in child_class
    void method_2(){              //overide parent
        System.out.println("using child class method_2");

    }
}