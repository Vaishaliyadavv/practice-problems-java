package dataStructuresAndAlgorithms.stack;


import dataStructuresAndAlgorithms.queue.QueueUsingArray;

public class StackUsingQueue {
    QueueUsingArray queue = new QueueUsingArray(10);

    public void push(int value){
        int size = queue.getSize();;
        queue.push(value);
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                int temp = queue.pop();
                queue.push(temp);
            }
        }
    }

    public int pop(){
        return queue.pop();
    }

    public int size(){
        return queue.getSize();
    }

    public int top(){
        return queue.top();
    }

}
