package removelinkedlistelements;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){ this.val = val;}
}
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode aux = dummy;
        while(dummy != null && dummy.next != null){
            if(dummy.next.val == val){
                dummy.next = dummy.next.next;
            }else
                dummy = dummy.next;
        }
        return aux.next;
        
    }
}