public class SeparateObjects {
    public static void main(String[] args) {

        Runnable r1 = new MyRunnable();
        Runnable r2 = new MyRunnable();

        Thread thread1 = new Thread(r1, "Thread 1");
        Thread thread2 = new Thread(r2, "Thread 2");

        thread1.start();
        thread2.start();
    }
}