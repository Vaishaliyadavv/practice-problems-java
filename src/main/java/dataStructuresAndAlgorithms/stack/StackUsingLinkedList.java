package dataStructuresAndAlgorithms.stack;

import dataStructuresAndAlgorithms.linkedList.Node;

//TC = O(1) FOR ALL
//SC = O(N) FOR N ELEMENTS


public class StackUsingLinkedList {
    int size;
    Node top;

    public StackUsingLinkedList(){
        size = 0;
        top = null;
    }

    public void push(int value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop(){
        if(top == null){
            System.out.println("Stack is empty");
            return 0;
        }
        int ele = top.data;
        top = top.next;
        size--;
        return ele;
    }

    public int top(){
        if(top == null){
            System.out.println("No elements found");
            return 0;
        }
        return top.data;
    }

    public int getSize(){
        return size;
    }
}
