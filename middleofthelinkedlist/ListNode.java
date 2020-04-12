package middleofthelinkedlist;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public static ListNode init(int n){

        ListNode res = new ListNode(0);
        ListNode aux = res;
        for(int i = 1; i < n;i++){
            ListNode node = new ListNode(i);
            aux.next = node;
            aux = node;
        }
        return res;
    }

    public static ListNode init(int[] n){
        ListNode res = null;
        if(n.length > 0){
            ListNode aux = new ListNode(n[0]);
            for(int i = 1; i < n.length;i++){
                ListNode node = new ListNode(n[i]);
                aux.next = node;
                aux = node;
            }
        }
        return res;

    }
    
    public static void printListNode(ListNode list){
        while(list != null){
            System.out.print(list.val + " -> ");
            list = list.next;
        }
        System.out.println("null");

    }
}
