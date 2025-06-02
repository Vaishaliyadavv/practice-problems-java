package leetcodeProblems.linkedList;

import leetcodeProblems.ListNode;

//https://leetcode.com/problems/reverse-linked-list/description/
public class Problem206 {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null){
            ListNode front  = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}
