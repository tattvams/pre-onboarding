import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable implements Runnable {
    private volatile int counter = 1;

    private synchronized void incrementCounter() {
        counter++;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            int localCounter;
            synchronized (this) {
                localCounter = counter;
                incrementCounter();
            }
            System.out.println(Thread.currentThread().getName() + ": " + localCounter);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable myRunnable = new MyRunnable();

        for (int i = 0; i < 2; i++) {
            executorService.execute(myRunnable);
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": Main Thread - " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();
    }
}
