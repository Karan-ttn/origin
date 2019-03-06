import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class thread7 {
    public static void main(String[] args) throws InterruptedException {
        List<Callable<Integer>> runnableList = new ArrayList<>();
        runnableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 1;
            }
        });
        runnableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 2;
            }
        });
        runnableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 3;
            }
        });
        ExecutorService e = Executors.newSingleThreadExecutor();
        List<Future<Integer>> f = e.invokeAll(runnableList);
        f.forEach((m)->{
            if(m.isDone())
                try {
                    System.out.println(m.get());
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                } catch (ExecutionException e1) {
                    e1.printStackTrace();
                }
        });
        e.awaitTermination(2000L,TimeUnit.MILLISECONDS);
        if (e.isTerminated()){
            System.out.println("Terminated all");
        }
        else {
            System.out.println("some tasks remaning");
        }
    }
    }

