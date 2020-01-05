package thread.pool.thread.local;

public class ThreadLocalMain {

    private static ThreadLocal<String> THREAD_LOCAL = new ThreadLocal<>();

    public static void main(String[] args) {
        THREAD_LOCAL.set("1");

        print(new MyThread1());
        print(new MyThread2());

        System.out.println("Main " + THREAD_LOCAL.get());
    }

    private static void print(MyBaseThread myThread) {
        System.out.println(myThread.getClass().getName());
        myThread.start();
    }

    abstract static class MyBaseThread extends Thread {

        abstract String getValue();

        @Override
        public void run() {
            THREAD_LOCAL.set(getValue());
            System.out.println("MyThread " + THREAD_LOCAL.get());
        }
    }

    static class MyThread1 extends MyBaseThread {
        @Override
        String getValue() {
            return "2";
        }
    }

    static class MyThread2 extends MyBaseThread {
        @Override
        String getValue() {
            return "3";
        }
    }
}
