package linkedlistcycle;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode slow = head;
        /* One step */
        ListNode speed = head.next;
        /* Two steps */
        while (slow != null && speed != null && speed.next != null) {
            if (slow == speed) {
                return true;
            }
            slow = slow.next;
            speed = speed.next.next;
        }
        return false;

    }
}