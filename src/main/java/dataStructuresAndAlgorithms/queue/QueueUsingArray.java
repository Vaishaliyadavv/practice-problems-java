package dataStructuresAndAlgorithms.queue;

//TC - O(1) FOR ALL BUT SC - O(SIZE) FOR QUEUE ARRAY

public class QueueUsingArray {
    private final int size;
    private final int[] queue;
    private int currSize;
    private int start, end;

    public QueueUsingArray(int c) {
        size = c;
        queue = new int[c];
        start = -1;
        end = -1;
        currSize = 0;
    }

    public static void main(String[] args) {
        QueueUsingArray qe = new QueueUsingArray(5);

        qe.enqueue(10);
        qe.enqueue(20);
        qe.enqueue(30);
        qe.enqueue(40);
        qe.enqueue(50);

        qe.printQueue();

        System.out.println(qe.dequeue());
        System.out.println(qe.dequeue());
        System.out.println(qe.dequeue());
        System.out.println(qe.dequeue());
        System.out.println(qe.dequeue());
        System.out.println(qe.dequeue());
        qe.enqueue(60);
        qe.enqueue(70);
        System.out.println(qe.dequeue());
        System.out.println(qe.dequeue());
        System.out.println(qe.dequeue());

    }

    public void printQueue() {
        if (currSize == 0) {
            System.out.println("Queue is empty");
            return;
        }
        int i = start;
        for (int count = 0; count < currSize; count++) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public void enqueue(int data) {
        if (currSize == size) {
            System.out.println("Queue is full");
            return;
        }

        if (currSize == 0) {
            start = 0;
            end = 0;
        } else {
            end = (end + 1) % size;
        }

        queue[end] = data;
        currSize++;
    }

    public int dequeue() {
        if (currSize == 0) {
            System.out.println("No element in the queue");
            return -1; // Error value
        }

        int ele = queue[start];
        if (currSize == 1) {
            start = -1;
            end = -1;
        } else {
            start = (start + 1) % size;
        }

        currSize--;
        return ele;
    }

    public int peek() {
        if (currSize == 0) {
            System.out.println("no element in the queue");
            return -1;
        }
        return queue[start];
    }
}
