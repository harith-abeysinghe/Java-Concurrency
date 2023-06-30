public class ThreadExample6 {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            String threadname = Thread.currentThread().getName();
            System.out.println(threadname + " running");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished");
        };
        Thread thread = new Thread(runnable, "My Thread 1");
        thread.start();
        Thread thread2 = new Thread(runnable, "My Thread 2");
        thread2.start();

    }
}