package removenthnodefromendoflist;


class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    private ListNode target = null;
    private int tg = 0;
    public void reverseTarget(ListNode curr, int index,int n){
        if(curr == null){
            tg = index-n-1;
            return;
        }
        reverseTarget(curr.next, index+1, n);
        if(index == tg){
            target = curr;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return null;
        ListNode curr = head;
        reverseTarget(curr, 1, n);
        if(tg == 0)
            head = head.next;
        else
            target.next = target.next.next;
        return head;
    }

    
}