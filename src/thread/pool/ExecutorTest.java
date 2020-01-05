package thread.pool;

import java.util.concurrent.*;

public class ExecutorTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new MyClass());
        System.out.println(executorService.submit(new MyCallable()).get());
        executorService.shutdown();
    }

    static class MyClass implements Runnable {

        @Override
        public void run() {
            System.out.println("Hello");
        }
    }

    static class MyCallable implements Callable<Integer> {

        @Override
        public Integer call() {
            return 1;
        }
    }
}

