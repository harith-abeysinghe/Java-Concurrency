public class ThreadExample5 {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            String threadname = Thread.currentThread().getName();
            System.out.println(threadname + " running");
            // System.out.println("Lambda finished");
        };
        Thread thread = new Thread(runnable, "My Thread 1");
        thread.start();
        Thread thread2 = new Thread(runnable, "My Thread 2");
        thread2.start();

    }
}