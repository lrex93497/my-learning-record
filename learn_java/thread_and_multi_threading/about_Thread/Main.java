//about thread
public class Main{

public static void main(String[] args) throws InterruptedException{

    System.out.println(Thread.activeCount());     //see thread number 
    System.out.println(Thread.currentThread().getName());  //see name of thread
    System.out.println(Thread.currentThread().getPriority());   // 1- 10 scale 10 highest
    Thread.currentThread().setPriority(3);          //setPriority  default 5
    System.out.println(Thread.currentThread().getPriority());  

    //Thread.currentThread().setName("1234");             //set thread name
    System.out.println(Thread.currentThread().getName()); 
    System.out.println(Thread.currentThread().isAlive()); 

    System.out.println("Opening 2nd thread\n");

    Thread.sleep(500);   //500ms sleep for thread



    Thread_2 thread2 = new Thread_2();  
    thread2.setDaemon(true);   //setdeamon, must before start()
    thread2.start(); //start second thread

    System.out.println("thread_2 alive ?\n" + thread2.isAlive()); 
    System.out.println(thread2.getName());
    System.out.println(thread2.getPriority());   //still 3 as child of Thread
    
    System.out.println(thread2.isDaemon());

    //deamon thread = thread run in bk like garbage collection(low priority) , all jvm and user thread is nondeamon thread
    //jvm will not wait deamon thread finish to exit, only user thread will

    





}

}