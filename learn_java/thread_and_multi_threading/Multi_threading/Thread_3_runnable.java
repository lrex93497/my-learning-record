public class Thread_3_runnable implements Runnable{  //still can extends

    @Override
    public void run() {
        System.out.println("thread 3 opened");
        int n = 10;
        while( n > 0){
            System.out.println("Thread3: " + n);
            n = n-1;
            try{
                Thread.sleep(50);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Thread3: ended");
        return;

    }

}