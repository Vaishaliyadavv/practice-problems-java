package dataStructuresAndAlgorithms.stack;


import java.util.ArrayList;

//implement a stack using array and arrayList
public class StackUsingArrays {
    int top = -1;
    int[] stack;
    int size;

    public StackUsingArrays(int size){
        this.size = size;
        stack = new int[size];
    }

    //O(1)
    public void push(int value){

        if(top>=size){
            System.out.println("Stack is full");
        }
        top++;
        stack[top] = value;
        System.out.println("Element pushed");
    }

    //O(1)
    public int top(){
        if(top == -1){
            System.out.println("Stack is empty");
            return 0;
        }
        return stack[top];
    }

    //O(1)
    public void pop(){
        if(top == -1){
            System.out.println("Stack is empty");
        } else{
            stack[top] = 0;
            top--;
            System.out.println("Element deleted");
        }
    }

    //O(1)
    public int size(){
        return top+1;
    }
}
