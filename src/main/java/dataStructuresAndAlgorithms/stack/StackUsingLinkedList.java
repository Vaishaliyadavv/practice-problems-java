package dataStructuresAndAlgorithms.stack;

import dataStructuresAndAlgorithms.linkedList.Node;

public class StackUsingLinkedList {
   static Node top;
   static int size ;
   public StackUsingLinkedList(){
       top = null;
       size = 0;
   }

   public static boolean isEmpty(){
       return top == null;
   }

   public static void push(int data){
       Node newNode = new Node(data);
       newNode.next = top;
       top = newNode;
       size++;
   }

   public static int peek(){
       if(!isEmpty()){
           return top.data;
       }
       System.out.println("stack is empty");
       return Integer.MAX_VALUE;
   }

   public static void pop(){
       if(isEmpty()){
           System.out.println("stack is empty");
       }
       else {
           top = top.next;
           size--;
       }
   }

   public static int getSize(){
       return size;
   }


    public static void main(String[] args) {
        StackUsingLinkedList st = new StackUsingLinkedList();
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        System.out.println(peek());
        System.out.println(getSize());
        pop();
        pop();
        System.out.println(peek());
        System.out.println(getSize());
    }
}
