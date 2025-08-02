package dataStructuresAndAlgorithms.queue;

//TC - O(1) FOR ALL BUT SC - O(SIZE) FOR QUEUE ARRAY

public class QueueUsingArray {
    int currSize=0;
    int size;
    int start = -1;
    int end = -1;
    int[] queue;

    public QueueUsingArray(int size){
        this.size = size;
        queue = new int[size];
    }

    public void push(int value){
        if(currSize == size){
            System.out.println("Queue is full");
            return;
        }
        if(currSize == 0){
            start = 0;
            end = 0;
        } else {
            end = (end + 1) % size;
        }
        queue[end] = value;
        currSize++;
    }

    public int pop(){
        if(currSize == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        int element = queue[start];
        if(currSize == 1){
            start = -1;
            end = -1;
        } else{
            start = (start + 1) % size;
        }

        currSize--;
        return element;
    }

    public int top(){
        if(currSize == 0){
            System.out.println("Queue is empty");
            return -1;
        }

        return queue[start];
    }

    public int getSize(){
        return currSize;
    }

}
