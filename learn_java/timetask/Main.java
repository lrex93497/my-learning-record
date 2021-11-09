/*timer task*/

import java.time.Year;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

class Main{
    public static void main(String[] args)
    {
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            @Override
            public void run(){
                System.out.println("1 second pass");
            }
        };
        timer.schedule(task, 1000);  //1000ms is 1 s

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2021);
        date.set(Calendar.MONTH,3);   //Calendar.MARCH, show Mar
        date.set(Calendar.DAY_OF_MONTH,2);
        date.set(Calendar.HOUR_OF_DAY,1);
        date.set(Calendar.MINUTE,3);
        date.set(Calendar.SECOND,42);
        date.set(Calendar.MILLISECOND,32);
        
        System.out.println(date.getTime());

        Timer timer2 = new Timer();

        TimerTask task2 = new TimerTask(){
            @Override
            public void run(){
                System.out.println("2 second passed, Program closed");
                System.exit(0);
            }
        };
        timer2.schedule(task2, 2000);

        //timer2.schedule(task2, date.getTime()); //run on date
        //timer2.scheduleAtFixedRate(task2, 0, 123); //  task, delay, how long once
        
        


    }
}
