import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 2, 2, 1};
        int n = arr.length;

        Stack<Integer> st = new Stack<>();
        int i = 0;

        while (i < n) {
            if (st.isEmpty()) {
                st.push(arr[i]);
            } else if (st.peek() == arr[i]) {
                while (i < n && st.peek() == arr[i]) {
                    i++;
                }
                st.pop();
                if (i < n) {
                    st.push(arr[i]);
                }
            } else {
                st.push(arr[i]);
            }
            i++;
        }

        System.out.println(st);
    }
}
