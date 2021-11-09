import java.util.Scanner;

//polymorphism
public class Main{
    public static void main(String[] args) {
        A_a a_a = new A_a();
        A_b a_b = new A_b();

        Group_A[] group_a_array = {a_a,a_b};   // use Group_A to storge to extened class in same array

        for(Group_A n : group_a_array) {
            n.test();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("A_a or A_b?:");
        String user_input = scanner.nextLine();

        // dynamic polymorphism

        if(user_input.equals("A_a")){            
            Group_A group_A = new A_a();
            group_A.test();
        }   
        else if(user_input.equals("A_b")){            
            Group_A group_A = new A_b();
            group_A.test();
        }             
        else{
            Group_A group_A = new Group_A();
            System.out.println("You did not enter A_a or A_b exactly");
            group_A.test();
        }        
    }
}