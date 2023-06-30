public class ThreadExample10 {

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i = 0; i < 5; i++) {
                sleep(100);
                System.out.println("Running");

            }
        };

        Thread thread = new Thread(r);
        thread.setDaemon(true);
        thread.start();
        sleep(3000);
        try {
            thread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
