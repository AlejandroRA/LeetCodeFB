package middleofthelinkedlist;


public class Solution {
    
    public ListNode middleNode(ListNode head) {
        ListNode aux = head;
        int s = 0;
        while(aux!=null){
            s++;
            aux = aux.next;
        }
        s = s/2+1;
        aux = head;
        while(s > 1){
            aux = aux.next;
            s--;
        }
        return aux;
    }

    public static void main(String args[]){
        ListNode list = ListNode.init(4);
        ListNode.printListNode(list);
        Solution s = new Solution();
        list = s.middleNode(list);
        ListNode.printListNode(list);
    }

}