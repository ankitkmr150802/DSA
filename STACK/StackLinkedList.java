
public class StackLinkedList {
    public static class Node {
        Node next;
        int val;
        Node(int val){
            this.next = null;
            this.val  = val;
        }
    }
    
    public static class Stack{
        private Node head = null;
        int size = 0;
        
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        
        void pop(){
            if(head == null) return;
            head = head.next;
            size--;
        }
        
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        
        int peek(){
            if(head == null) return -1;
            return head.val;
        }
        
        int size(){
            return size;
        }
        
        boolean isEmpty(){
            if(head == null) return true;
            return false;
        }
        
        void clear(){
            head = null;
            size = 0;
            return;
        }
        
    }
    
    public static void main(String[] args) {
        Stack st = new Stack();

        System.out.println("Is stack empty? " + st.isEmpty());
    
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println("Top element: " + st.peek());
        System.out.println("Stack size: " + st.size());
    
        st.display();  // Should print 40 30 20 10
    
        st.pop();
        st.pop();
    
        System.out.println("After popping 2 elements:");
        st.display();  // Should print 20 10
    
        st.clear();
        System.out.println("After clearing stack:");
        st.display();  // Should say empty
    }
}
