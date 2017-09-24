package ProdComsum;

import java.util.Vector;

public class Producer implements Runnable {

    Vector<Integer> sharedQueue;
    Integer size;

    public Producer(Vector<Integer> sharedQueue, Integer size) {
        this.sharedQueue = sharedQueue;
        this.size = size;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            produce(i);
        }

    }

    private void produce(Integer integer) {
        while (sharedQueue.size() == size) {
            synchronized (sharedQueue) {
                try {
                    System.out.println("shared queue is full");
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
                System.out.println("producing " + integer);
                sharedQueue.add(integer);
                sharedQueue.notify();
            }

    }

}
