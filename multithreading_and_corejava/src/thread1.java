public class thread1 implements Runnable {
    public void run(){
        System.out.println("Running thread1");
    }

    public static void main(String[] args) {
        new Thread(new thread1()).start();
    }
}

/*
class thread2 extends Thread{
    public void run(){
        System.out.println("Running thread2");
    }

    public static void main(String[] args) {
        new Thread(new thread2()).start();
    }

}*/