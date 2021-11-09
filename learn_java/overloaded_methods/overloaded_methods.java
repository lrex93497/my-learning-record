class overloaded_method{
    public static void main(String[] args){
        int result = sum(1,2,3,4);
        System.out.println(result);

    }
    
    /*overloaded methods for 1-5 int input */ 

    static int sum(int a){
        return a;
    }
    static int sum(int a, int s){
        return a+s;
    }
    static int sum(int a, int s, int d){
        return a+s+d;
    }
    static int sum(int a, int s, int d, int f){
        return a+s+d+f;
    }
    static int sum(int a, int s, int d, int f, int g){
        return a+s+d+f+g;
    }

}