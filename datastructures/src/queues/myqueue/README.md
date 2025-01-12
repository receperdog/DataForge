# MyQueue Implementation

This package contains an implementation of a queue data structure in Java. A queue is a linear data structure that follows the First In First Out (FIFO) principle. This means that the first element added to the queue will be the first one to be removed.

## Features

- Enqueue: Add an element to the end of the queue.
- Dequeue: Remove an element from the front of the queue.
- Peek: View the element at the front of the queue without removing it.
- IsEmpty: Check if the queue is empty.
- Size: Get the number of elements in the queue.

## Usage

To use this queue implementation, you can create an instance of `MyQueue` and use its methods to manipulate the queue.

```java
MyQueue<Integer> queue = new MyQueue<>();
queue.enqueue(1);
queue.enqueue(2);
queue.enqueue(3);

System.out.println(queue.dequeue()); // Outputs: 1
System.out.println(queue.peek());    // Outputs: 2
System.out.println(queue.size());    // Outputs: 2
System.out.println(queue.isEmpty()); // Outputs: false
```
## Linked List Visualization

To better understand how the queue operates internally, you can visualize it using a linked list. Here are two different links to visualize linked lists:

- [Visualgo](https://visualgo.net/en/list)
- [Linked List Visualizer](https://www.cs.usfca.edu/~galles/visualization/QueueArray.html)