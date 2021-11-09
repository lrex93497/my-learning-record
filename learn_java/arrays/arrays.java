/*arrays*/ 

class arrays{
    public static void main(String[] args){
        int int_array[] = {1,2,3};
        int sum_of_array = 0;

        System.out.println(int_array[0]);
        System.out.println(int_array[1]);
        System.out.println(int_array[2]);
        ++int_array[2];
        System.out.println(int_array[2]);

        for(int temp:int_array){
            sum_of_array = temp + sum_of_array;
        }

        System.out.println("sum of array = " + sum_of_array);

        int two_d_array[][] = {{4,5,6},{7,8,9},{10,11,12}};

        System.out.println(two_d_array[0][0]);
        System.out.println(two_d_array[1][1]);
        System.out.println(two_d_array[2][2]);


    }

}