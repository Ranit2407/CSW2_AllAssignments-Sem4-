import java.util.LinkedList;
import java.util.Queue;

class BoundedBuffer<T> {
    private final Queue<T> buffer;
    private final int capacity;

    public BoundedBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new LinkedList<>();
    }

    public synchronized void produce(T item) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait(); // Wait if the buffer is full
        }
        buffer.add(item);
        notifyAll(); // Notify consumer that an item is added
    }

    public synchronized T consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait(); // Wait if the buffer is empty
        }
        T item = buffer.poll();
        notifyAll(); // Notify producer that an item is consumed
        return item;
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        BoundedBuffer<Integer> buffer = new BoundedBuffer<>(5);

        // Create and start producer threads
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                try {
                    int count = 1;
                    while (true) {
                        buffer.produce(count);
                        System.out.println("Produced: " + count);
                        Thread.sleep(1000);
                        count++;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        // Create and start consumer threads
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                try {
                    while (true) {
                        int item = buffer.consume();
                        System.out.println("Consumed: " + item);
                        Thread.sleep(2000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
