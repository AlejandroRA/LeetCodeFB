package linkedlistcycleii;


class ListNode{
    int value;
    ListNode next;
}
public class Solution {
    
    public ListNode checkCycle(ListNode head){
        ListNode hare = head;
        ListNode rabbit = head;
        while( hare != null && hare.next != null ){
            hare = hare.next.next;
            rabbit = rabbit.next;
            if(hare == rabbit){
                return rabbit;
            }
        }
        return null;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode intersect = checkCycle(head);
        if(intersect == null){
            return null;
        }
        ListNode p1 = head;
        ListNode p2 = intersect;
        while(p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}