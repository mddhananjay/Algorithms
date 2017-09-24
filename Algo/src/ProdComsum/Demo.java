package ProdComsum;

import java.util.Vector;

public class Demo {


    public static void main(String[] args) {
        Vector<Integer> sharedQueue = new Vector<>();
        Producer producer = new Producer(sharedQueue,4);
        Consumer consumer = new Consumer(sharedQueue,4);
        Thread p = new Thread(producer);
        p.start();

        Thread c = new Thread(consumer);
        c.start();
    }
}
