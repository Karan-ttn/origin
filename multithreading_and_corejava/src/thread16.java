import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class thread16 {
    public static void main(String[] args) throws InterruptedException {
        thread16 t = new thread16();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                t.worker1();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                t.worker2();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

    Lock l1 = new ReentrantLock(true);
    Lock l2 = new ReentrantLock(true);

    public void acquireLock(Lock m,Lock n){
        boolean a = m.tryLock();
        boolean b = n.tryLock();
        if (a && b){
            return;
        }
        if(a){
            m.unlock();
        }
        if(b){
            n.unlock();
        }
    }

    public void worker1(){
        acquireLock(l1,l2);
        System.out.println("lock1-worker1");
        System.out.println("lock2-worker1");
        l2.unlock();
        l1.unlock();
    }
    public void worker2(){
        acquireLock(l2,l1);
        System.out.println("lock2-worker2");
        System.out.println("lock1-worker2");
        l1.unlock();
        l2.unlock();
    }
}












/*
    public void worker1(){
        l1.lock();
        System.out.println("lock1-worker1");
        l2.lock();
        System.out.println("lock2-worker1");
        l2.unlock();
        l1.unlock();
    }
    public void worker2(){
        l2.lock();
        System.out.println("lock2-worker2");
        l1.lock();
        System.out.println("lock1-worker2");
        l2.unlock();
        l1.unlock();
    }*/