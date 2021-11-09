//about thread
public class Main{

public static void main(String[] args) throws InterruptedException{

    System.out.println("Thread 1: nothing");

    Thread_2 thread2 = new Thread_2();  
    thread2.start(); 

    Thread_3_runnable runnable_thread3 = new Thread_3_runnable();  
    Thread thread3 = new Thread(runnable_thread3);   //other way to creat thread, still can extends
    thread3.start(); 

    thread2.join();  //join() wait until end //join(1000) wait 1000 ms 
    thread3.join();

    System.out.println(Thread.activeCount());   //1 as 2 other thread return after finished

    }

}