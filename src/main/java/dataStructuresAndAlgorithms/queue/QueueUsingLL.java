package dataStructuresAndAlgorithms.queue;

import dataStructuresAndAlgorithms.linkedList.Node;



public class QueueUsingLL {

    Node start;
    Node end;
    int size;

    public QueueUsingLL(){
        start=null;
        end=null;
        size=0;
    }

    public void push(int value){
        Node newNode = new Node(value);

        if(start == null){
            start = end = newNode;
        } else{
            end.next = newNode;
            end = newNode;
            size++;
        }
    }

    public int pop(){
        if(start == null){
            System.out.println("No elements found");
            return 0;
        }

        int ele = start.data;
        start = start.next;
        size--;

        return ele;
    }

    public int getSize(){
        return size;
    }

    public int top(){
        if(start == null){
            System.out.println("no elements found");
            return 0;
        }
        return start.data;
    }

}
