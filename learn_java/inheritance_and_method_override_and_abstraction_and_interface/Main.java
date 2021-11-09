/*inheritance, parent_class.java is parent, child_class.java is child */
/*child method_2 overide parent */
/*learn abstraction in child_class*/
class Main{
    public static void main(String[] args) {

        child_class test = new child_class();
        test.method_1();
        System.out.println(test.parent_value);

        test.method_2();
        test.inter();       //use interface method
    }
}