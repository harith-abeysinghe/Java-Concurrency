public class ThreadExample7 {

    public static class StoppableRunnable implements Runnable {
        private boolean stopRequest = false;

        public synchronized void requestStop() {
            this.stopRequest = true;
        }

        public synchronized boolean isStopRequest() {
            return this.stopRequest;
        }

        private void sleep(long millis) {
            try {
                Thread.sleep(millis);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            System.out.println("StoppableRunnable running");
            while (!isStopRequest()) {
                sleep(100);
                System.out.println("...");
            }
            System.out.println("StoppableRunnable stopped");

        }

    }

    public static void main(String[] args) {
        StoppableRunnable sRunnable = new StoppableRunnable();
        Thread thread = new Thread(sRunnable, "The Thread");
        thread.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Request Stop");
        sRunnable.requestStop();
        System.out.println("Stop Requested");

    }
}
