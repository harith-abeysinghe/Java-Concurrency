public class ThreadExample9 {

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Runnable r = () -> {
            while (true) {
                sleep(1000);
                System.out.println("Running");

            }
        };

        Thread thread = new Thread(r);
        thread.start();
    }

}
