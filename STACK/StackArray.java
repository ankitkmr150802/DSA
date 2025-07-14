
public class StackArray {
    public static class Stack{
        private int[] arr = new int[5];
        private int top = -1;
        private int n = arr.length;
        
        void push(int x){
            if(top == n-1) return;
            top++;
            arr[top] = x;
        }
        void pop(){
            if(top == -1) return;
            arr[top] = 0;
            top--;
        }
        
        void display(){
            if( top == -1){
                System.out.println("stack is Empty!");
                return;
            }
            for(int i = top; i >= 0; i--){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        
        int peek(){
            if( top == -1) return -1;
            return arr[top];
        }
        
        int size(){
            return top+1;
        }
        
        boolean isEmpty(){
            if(top == -1) return true;
            return false;
        }
        
        boolean isFull(){
            if( top == n-1) return true;
            return false;
        }
        void clear(){
            top = -1;
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
        st.push(50);
        st.push(60); // Won't be added (overflow)
    
        System.out.println("Is stack full? " + st.isFull());
        System.out.println("Top element: " + st.peek());
        System.out.println("Stack size: " + st.size());
    
        st.display();  // Should print 50 40 30 20 10
    
        st.pop();
        st.pop();
    
        System.out.println("After popping 2 elements:");
        st.display();  // Should print 30 20 10
    
        st.clear();
        System.out.println("After clearing stack:");
        st.display();  // Should say empty
    }
}
