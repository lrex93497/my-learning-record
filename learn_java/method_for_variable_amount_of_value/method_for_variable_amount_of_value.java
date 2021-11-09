/*method_for_variable_amount_of_value.java*/

class method_for_variable_amount_of_value{
    public static void main(String[] args){
        sum(1,2,3,4,5);
    }

    public static void sum(int ...x){
        int sum = 0;
        System.out.println("lenght = " + x.length);
        for(int temp:x)
        {
            sum = temp + sum;
        }
        System.out.println("sum = " + sum);
    }
}