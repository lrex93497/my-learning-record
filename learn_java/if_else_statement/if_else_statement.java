
/* if else statement*/
class if_else_statement{
    public static void main(String[] args){
        int no_1 = 1233;
        int no_2 = 123;
        int no_3 = 1233;

        if (no_1 == no_2 && no_3 == no_2){
            System.out.printf( "Yes, all same");

        }
        else if(no_1 == no_2 || no_3 == no_2 || no_1 == no_3){
            System.out.printf( "One pair same");
        }
        else{
            System.out.printf( "Not same");

        }

    }

}