package dataStructuresAndAlgorithms.queue;

import dataStructuresAndAlgorithms.linkedList.Node;

public class QueueUsingLL {
    int size;
    Node start, end;

    public QueueUsingLL() {

        start = end = null;
        size = 0;
    }

    public static void main(String[] args) {
        QueueUsingLL qe = new QueueUsingLL();

        System.out.println("Enqueuing 10, 20, 30, 40, 50...");
        qe.enqueue(10);
        qe.enqueue(20);
        qe.enqueue(30);
        qe.enqueue(40);
        qe.enqueue(50);
        qe.printQueue(); // Expected: 10 20 30 40 50
        System.out.println("Size after enqueues: " + qe.size); // Expected: 5

        // Test 2: Dequeue one element
        System.out.println("\nDequeuing one element...");
        qe.dequeue();
        qe.printQueue(); // Expected: 20 30 40 50
        System.out.println("Size after one dequeue: " + qe.size); // Expected: 4
        System.out.println("top element: " + qe.peek());


    }

    public void printQueue() {
        if (start == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = start;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (start == null && end == null) {
            start = end = newNode;
        } else {
            end.next = newNode;
            end = newNode;
        }
        size++;
    }

    public void dequeue() {
        if (start == null) {
            System.out.println("No elements in the queue");
            return;
        }
        start = start.next;
        if (start == null) {
            end = null;
        }
        size--;
    }

    public int peek() {
        return start.data;
    }


}
