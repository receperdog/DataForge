package queues.myqueue;

public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        
        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.peek()); // Should print 10
        System.out.println("Dequeued: " + queue.dequeue()); // Should remove 10
        System.out.println("Front element after dequeue: " + queue.peek()); // Should print 20
        
        queue.enqueue(40);
        System.out.println("Dequeued: " + queue.dequeue()); // Should remove 20
        System.out.println("Queue size: " + queue.size()); // Should print 2
    }
}
