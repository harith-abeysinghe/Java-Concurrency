public class ThreadExample4 {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("MyRunnable running");
                System.out.println("MyRunnable finished");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

    }
}
