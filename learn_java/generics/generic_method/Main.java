//generics method
public class Main{

    public static void main(String args[]){
        Integer[] intarray = {1, 2};
        String[] stringarray = {"ab", "ba"};
        Character[] chararray = {'A', 'B'};
        Double[] doubleArray = {1.123, 2.223};

        showarray(intarray);
        showarray(stringarray);
        showarray(chararray);
        showarray(doubleArray);

        System.out.println(returnthing(intarray));
        System.out.println(returnthing(stringarray));
        System.out.println(returnthing(chararray));
        System.out.println(returnthing(doubleArray));

    }

    //generics
    public static <T> void showarray(T[] array) {         //showarray(Integer[] array) for interger array only T for Thing
 
        for(T n : array){
            System.out.print(n+" ");
        }
        System.out.print("\n");
    }

    public static <T> T returnthing(T[] array) {         //return array[0]
        return array[0];
    }
}