public class Thread_2 extends Thread{

    @Override
    public void run(){
        System.out.println("thread 2 opened");
        int n = 0;
        while( n < 11){
            System.out.println("Thread2: " + n);
            n = n+1;
            try{
                Thread.sleep(50);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Thread2: ended");
        return;
        
    }

}
