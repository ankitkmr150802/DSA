import java.util.*;

public class prefixEval {
    public static void main(String[] args) {
        String s = "-9/*+5346";
        int n = s.length();
        Stack<Integer> val = new Stack<>();

        for(int i = n-1; i >= 0; i--){
            char ch = s.charAt(i);
            int ascii = (int) ch - 48;

            if( ascii >= 0 && ascii <=9 ) val.push(ascii);

            else{
                int v1 = val.pop();
                int v2 = val.pop();
                if( ch == '+') val.push(v1 + v2);
                if( ch == '-') val.push(v1 - v2);
                if( ch == '*') val.push(v1 * v2);
                if( ch == '/') val.push(v1 / v2);
            }
        }
        System.out.println(val.peek());
    }
}
