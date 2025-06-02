package dataStructuresAndAlgorithms.linkedList.doublyLinkedList;


import dataStructuresAndAlgorithms.linkedList.Node;

public class DoublyLinkedList {

    public static void traverseSLL(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        traverseSLL(head.next);
    }

    //inert a node at the start of a DLL
    public static void insertAtStart(Node head, int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
    }




    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.prev = head;
        head.next.next = new Node(4);
        head.next.next.prev = head.next;

//        traverseSLL(insertBeforePosition(head, 0, 0));
    }

}
