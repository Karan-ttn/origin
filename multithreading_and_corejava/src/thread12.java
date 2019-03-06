public class thread12 {
    public static void main(String[] args) {

        thread12 obj = new thread12();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.worker1();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.worker2();
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.worker3();
            }
        });
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.worker4();
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
    synchronized public void worker1(){

            System.out.println("Worker1 started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker1 ended");
    }
    public void worker2(){
        System.out.println("Worker2 started");
        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker2 ended");
        }
    }
    synchronized public void worker3(){

        System.out.println("Worker3 started");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Worker3 ended");
    }
    public void worker4(){
        synchronized (this) {
            System.out.println("Worker4 started");
            notify();
            //notifyAll();
            System.out.println("Worker4 ended");
        }
    }
}
