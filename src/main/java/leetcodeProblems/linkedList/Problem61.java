package leetcodeProblems.linkedList;

import leetcodeProblems.ListNode;

public class Problem61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }

        ListNode temp = head;
        int length = 1;
        while(temp.next!=null){
            temp=temp.next;
            length++;
        }

        k = k % length;
        if(k == 0){
            return head;
        }

        ListNode tail = head;
        for(int i = 1; i< length - k; i++){
            tail = tail.next;
        }
        ListNode newHead = tail.next;
        temp.next = head;
        tail.next = null;

        return newHead;
    }
}
