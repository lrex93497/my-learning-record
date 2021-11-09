
/* switch*/
class switch_structure{
    public static void main(String[] args)
    {
        int switch_no = 2;

        switch (switch_no){
            case 1:
                System.out.printf( "I am case 1");
                break;
            case 2:
                System.out.printf( "Hi! case 2");
                break;
            case 3:
                System.out.printf( "Last one case 3");
                break;
            default:
                System.out.printf( "Hi, no case.");
                break;
        }
    }
}
