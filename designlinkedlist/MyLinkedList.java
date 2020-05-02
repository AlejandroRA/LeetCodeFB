package designlinkedlist;



public class MyLinkedList {

    class Lista {
        int val;
        Lista next;
    
        public Lista(int val) {
            this.val = val;
        }
    }

    public void print() {
        Lista curr = head;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
        
    }

    Lista head;
    int size;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        size = 0;
        head = new Lista(0);
    }

    /**
     * Get the value of the index-th node in the linked Lista. If the index is
     * invalid, return -1.
     */
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Lista curr = head;
        for (int i = 0; i <= index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    /**
     * Add a node of value val before the first element of the linked Lista. After
     * the insertion, the new node will be the first node of the linked Lista.
     */
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    /** Append a node of value val to the last element of the linked Lista. */
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    /**
     * Add a node of value val before the index-th node in the linked Lista. If
     * index equals to the length of linked Lista, the node will be appended to the
     * end of linked Lista. If index is greater than the length, the node will not
     * be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index > size)
            return;
        if (index < 0)
            index = 0;
        Lista curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        Lista values = new Lista(val);
        values.next = curr.next;
        curr.next = values;

        size++;

    }

    /** Delete the index-th node in the linked Lista, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size)
            return;
        Lista curr = head;
        for (int i = 0; i < index; i++)
            curr = curr.next;
        curr.next = curr.next.next;
        size--;
    }

    public static void main(String args[]) {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(1);
        obj.addAtTail(3);
        obj.addAtIndex(1,2);
        obj.print();
        System.out.println(obj.get(1));
        obj.deleteAtIndex(1);
        System.out.println(obj.get(1));
        obj.print();
    }
}

