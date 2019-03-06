import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class thread8 {
    public static void main(String[] args) {
        ScheduledExecutorService e = Executors.newSingleThreadScheduledExecutor();
        e.schedule(new Runnable() {
                              @Override
                              public void run() {
                                  System.out.println("Task executed after 1 second");
                              }
                          },1,TimeUnit.SECONDS);
    e.scheduleAtFixedRate(new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(2000L);
                System.out.println("Task for sheduled at fixed rate");
            }
            catch (InterruptedException d){
                d.printStackTrace();
            }
        }
    },0,2,TimeUnit.SECONDS);
    e.scheduleWithFixedDelay(new Runnable() {
        @Override
        public void run() {
            //try {
                //Thread.sleep(2000L);
               System.out.println("Task for sheduled at fixed delay");
            //}
            /*catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    },0,1,TimeUnit.SECONDS);
    }
}
