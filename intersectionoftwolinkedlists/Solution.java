package intersectionoftwolinkedlists;


class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}
public class Solution {
    public int sizeListNode(ListNode head){
        ListNode curr = head;
        int size = 0;
        while(curr != null){
            size++;
            curr = curr.next;
        }
        return size;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = sizeListNode(headA);
        int sizeB = sizeListNode(headB);
        if(sizeA < sizeB){
            ListNode aux = headA;
            headA = headB;
            headB = aux;
        }
        int diff = Math.abs(sizeA-sizeB);
        for(int i = 0; i < diff;i++  ){
            headA = headA.next;
        }
        while(headA != null && headB != null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}