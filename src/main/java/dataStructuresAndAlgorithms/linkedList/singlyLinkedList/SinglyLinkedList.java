package dataStructuresAndAlgorithms.linkedList.singlyLinkedList;

import dataStructuresAndAlgorithms.linkedList.Node;

public class SinglyLinkedList {


    //traverse a singly linked list
    public static void traverseSLL(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        traverseSLL(head.next);
    }

    //search in a singly linked list
    public static boolean searchSLL(Node head, int key) {

        if (head == null) {
            return false;
        }
        if (head.data == key) {
            return true;
        }
        return searchSLL(head.next, key);
    }

    //find length of a singly linked list
    public static int findLengthSLL(Node head) {
        if (head == null) {
            return 0;
        }
        return 1 + findLengthSLL(head.next);
    }

    //insertion at the beginning of a singly linked list
    public static Node insertAtStart(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    //insertion at the end of the list
    public static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    //insert at a specific position of a singly linked list
    public static Node insertAtPosition(Node head, int data, int position) {

        if (position < 1) {
            return head;
        }
        if (position == 1) {
            return insertAtStart(head, data);
        }

        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) return head;

        Node newNode = new Node(data);

        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    //delete an element from the beginning of a singly linked list
    public static Node deleteAtStart(Node head) {
        if (head == null) {
            return null;
        }
        head = head.next;
        return head;
    }

    //delete an element at the end of a singly linked list
    public static Node deleteAtEnd(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    //delete an element at a specific position of a singly linked list
    public static Node deleteAtPosition(Node head, int position) {
        Node temp = head;
        Node prev = null;

        if (temp == null) return head;

        if (position == 1) {
            head = temp.next;
            return head;
        }
        for (int i = 1; temp != null && i < position; i++) {
            prev = temp;
            temp = temp.next;
        }

        if (temp != null) {
            assert prev != null;
            prev.next = temp.next;
        } else {
            System.out.println("Data not present");
        }

        return head;
    }

    //modify contents of a singly linked list
    public static Node modifyList(Node head , int position,int newData){




        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);


        traverseSLL(head);
        System.out.println();
        traverseSLL(deleteAtPosition(head, 4));

    }
}
