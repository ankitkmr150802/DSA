
import java.util.*;
class Main {
    public static void display(Stack<Integer> st){
        if(st.size() < 1) return; 
        int x = st.pop();
        System.out.print(x+" ");
        display(st);
    }
    
    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();
        int x = 10;
        int idx = 2;
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        Stack<Integer> gt = new Stack<>();
        while(st.size() > idx){
            gt.push(st.pop());
        }
        st.push(x);
        while(gt.size() > 0){
            st.push(gt.pop());
        }
        display(st);
        System.out.println(st);
        
    }
}
