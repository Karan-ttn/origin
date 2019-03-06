import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class thread15 {
    public static void main(String[] args) throws InterruptedException {
        thread15 x = new thread15();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                x.worker1();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                x.worker2();
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                x.worker3();
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t3.join();
        t2.join();
    }

    Lock l = new ReentrantLock(true);
    Condition c = l.newCondition();

    public void worker1() {
            l.lock();
            System.out.println("worker 1 Started");
        try {
            c.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        l.unlock();
        System.out.println("worker 1 Finished");
        }

    public void worker2() {
        l.lock();
        System.out.println("worker 2 Started");
        try {
            c.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        l.unlock();
        System.out.println("worker 2 Finished");
    }

    public void worker3() {
            l.lock();
            System.out.println("worker 3 Started");
            System.out.println("worker 3 Finished");
            c.signalAll();
            //c.signal();
            l.unlock();
    }
}
