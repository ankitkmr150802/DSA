import java.util.*;
class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int[] arr = {1,3,2,1,8,6,3,4};
        int n = arr.length;
        int [] res = new int[n];
        st.push(arr[n-1]);
        res[n-1] = -1;
        
        for(int i = n-2; i >=0; i--){
            // res[i] = -1;
            while(st.size() > 0 && arr[i] > st.peek()) st.pop();
            if( st.isEmpty()) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        for(int i = 0;i < n; i++){
            System.out.print(res[i]+" ");
        }
        System.out.println(st);
    }
}
