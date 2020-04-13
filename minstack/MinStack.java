package minstack;


public class MinStack {
    private Element top = null;
    public class Element{
        int value;
        int min;
        Element next;

        public Element(int val, int min){
            this.value = val;
            this.min = min;
        }
    }
    public MinStack() {

    }
    public void push(int x) {
        if(top == null){
            top = new Element(x,x);
        }else{
            Element aux = top;
            top = new Element(x,Math.min(x,top.min));
            top.next = aux;
        }   
    }
    public void pop() {
        if(top == null)
            return;
        top = top.next;
    }
    
    public int top() {
        return top.value;
    }
    
    public int getMin() {
        return top.min;
    }

    public static void main(String args[]){
        MinStack minStack = new MinStack();
        minStack.push(-2);  
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());  
        System.out.println(minStack.getMin());   
    }
}