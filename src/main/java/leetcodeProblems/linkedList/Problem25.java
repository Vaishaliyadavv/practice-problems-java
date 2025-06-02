package leetcodeProblems.linkedList;


import leetcodeProblems.ListNode;
//https://leetcode.com/problems/reverse-nodes-in-k-group/?envType=problem-list-v2&envId=linked-list
public class Problem25 {
    public ListNode findKthNode(ListNode temp, int k) {
        k -= 1;
        while (temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;

        while (true) {
            ListNode kth = findKthNode(prevGroupEnd.next, k);
            if (kth == null) break;

            ListNode groupStart = prevGroupEnd.next;
            ListNode nextGroupStart = kth.next;

            // Detach the group and reverse it
            kth.next = null;
            ListNode newGroupHead = reverseList(groupStart);

            // Reconnect
            prevGroupEnd.next = newGroupHead;
            groupStart.next = nextGroupStart;

            // Move to the next group
            prevGroupEnd = groupStart;
        }

        return dummy.next;
    }
}
