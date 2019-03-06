import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class thread9 {
    public static void main(String[] args) {
        //ExecutorService e = Executors.newCachedThreadPool();
        ExecutorService e = Executors.newFixedThreadPool(3);
        for (int i=0;i<12;i++) {
            e.submit(new x(i));
        }e.shutdown();
    }
}
class x implements Runnable{
    private final int id;
    public x(int id){
         this.id = id;
    }
    @Override
    public void run() {
        System.out.println("Thread Name "+Thread.currentThread().getName()+" id is "+id);
    }
}