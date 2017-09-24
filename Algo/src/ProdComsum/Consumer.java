package ProdComsum;

import java.util.Vector;

public class Consumer implements Runnable {

    Vector<Integer> sharedQueue;
    Integer size;

    public Consumer(Vector<Integer> sharedQueue, Integer size) {
        this.sharedQueue = sharedQueue;
        this.size = size;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            consume();
        }
    }

    private void consume() {
        while (sharedQueue.isEmpty()) {
            synchronized (sharedQueue) {
                try {
                    System.out.println("consumer waiting for product");
                    sharedQueue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        synchronized (sharedQueue) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("consuming " + sharedQueue.remove(0));

            sharedQueue.notify();
        }
    }
}
