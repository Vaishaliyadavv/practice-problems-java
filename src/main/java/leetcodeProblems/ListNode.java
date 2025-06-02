package leetcodeProblems;

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/1196623028/
public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
