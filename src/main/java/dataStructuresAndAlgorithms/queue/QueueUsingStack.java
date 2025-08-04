package dataStructuresAndAlgorithms.queue;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    // Approach 1: Costly push (O(N)), pop O(1)
    public void push1(int value) {
        // Move all elements from st to st2
        while (!st.isEmpty()) {
            st2.push(st.pop());
        }

        // Push new element into st
        st.push(value);

        // Move everything back from st2 to st
        while (!st2.isEmpty()) {
            st.push(st2.pop());
        }
    }

    // Approach 2: Costly pop (O(N)), push O(1)
    public void push2(int value) {
        st.push(value);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (st2.isEmpty()) {
            while (!st.isEmpty()) {
                st2.push(st.pop());
            }
        }
        return st2.pop();
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (st2.isEmpty()) {
            while (!st.isEmpty()) {
                st2.push(st.pop());
            }
        }
        return st2.peek();
    }

    public boolean isEmpty() {
        return st.isEmpty() && st2.isEmpty();
    }
}
