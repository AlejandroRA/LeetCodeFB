package reverselinkedlist;

class ListNode{
    int val;
    ListNode next;
}
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode list = head;
        while(head.next != null){
            ListNode aux = head.next;
            head.next = head.next.next;
            aux.next = list;
            list = aux;
        }
        return list;
    }
}