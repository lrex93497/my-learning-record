public class parent_class implements interfacehere{     //more interface can be implemented, use "," to add
    int parent_value = 10;

    void method_1(){
        System.out.println("using parent class by calling child");

    }

    void method_2(){                                        //overided by child
        System.out.println("using parent class method_2"); 

    }

    @Override
    public void inter(){
        System.out.println("used interface");    //interface method from Interfacehere.java

    }


}