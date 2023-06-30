public class SharedObjects {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        Runnable r1 = new MyRunnable(myObject);
        // Runnable r2 = new MyRunnable();

        Thread thread1 = new Thread(r1, "Thread 1");
        Thread thread2 = new Thread(r1, "Thread 2");

        thread1.start();
        thread2.start();
    }
}