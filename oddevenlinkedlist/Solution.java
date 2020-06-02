 
 package oddevenlinkedlist;
 // Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return null;
        
        ListNode headeven = head;
        ListNode headodd = head.next;
        ListNode auxeven = headeven;
        ListNode auxodd = headodd;
        while(auxodd != null && auxodd.next != null){
            auxeven.next = auxeven.next.next;
            auxodd.next = auxodd.next.next;
            
            auxeven = auxeven.next;
            auxodd = auxodd.next;
        }
        auxeven.next = headodd;
        return headeven;
        
    }
}