package leetcodeProblems.linkedList;

import leetcodeProblems.ListNode;

public class Problem83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;

        while(curr != null){
            if(curr.next != null && curr.val == curr.next.val){
                int duplicate = curr.val;

                while(curr != null && curr.val == duplicate){
                    curr = curr.next;
                }
                prev = prev.next;
                prev.next = curr;
            }
            else {
                prev = prev.next;
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}
