package queues.myqueue;

// Custom Queue implementation
public class MyQueue<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public MyQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(T data){
        Node<T> newNode = new Node<>(data);
        if (this.rear == null) {
            this.front = newNode;
            this.rear = newNode; // If the queue is empty, the new node is both front and rear
        }
        else{
            this.rear.setNext(newNode);
            this.rear = newNode; // rear should indicate always the point last one
        }
        size++;

    }

    public T dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        T data = this.front.getData();
        this.front = this.front.getNext();
        if(this.front == null){
            this.rear = null;
        }
        size--;
        return data;
    }

    public T peek(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        return this.front.getData();
    }

    public boolean isEmpty(){
        return this.front == null;
    }

    public int size(){
        return size;
    }
}
