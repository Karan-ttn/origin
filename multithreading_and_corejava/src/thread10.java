import java.util.concurrent.atomic.AtomicInteger;
public class thread10 {
    AtomicInteger c = new AtomicInteger();
    public void increment(){
        synchronized (this){
        c.incrementAndGet();}
    }
    public void worker1(){
        for(int i =0;i<1000;i++){
            increment();
        }
    }
    public void worker2(){
        for(int i =0;i<1000;i++){
            increment();
        }
    }
    public void worker3(){
        for(int i =0;i<1000;i++){
            System.out.println(" hello "+i);
            //increment();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        thread10 x = new thread10();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 running");
                x.worker1();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2 running");
                x.worker2();
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 3 running");
                x.worker3();
            }
        });
        t3.start();
        t1.start();
        t2.start();
        t3.join();
        t2.join();
        t1.join();
        System.out.println(x.c);
    }
}
