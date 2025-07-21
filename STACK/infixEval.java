import java.util.*;
class infix{
    public static void main(String[] args){
        String s = "9-(5*2)*4/6";
        int n = s.length();
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            int ascii = (int) ch - 48;
            // System.out.print(ascii+" ");

            if(ascii >= 0 && ascii <= 9) val.push(ascii);

            else if(op.size() == 0 || ch == '(' || op.peek() == '(') op.push(ch);
            else if( ch == ')'){
                while( op.peek() != '('){
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek() == '+') val.push(v1+v2);
                    if(op.peek() == '-') val.push(v1-v2);
                    if(op.peek() == '*') val.push(v1*v2);
                    if(op.peek() == '/') val.push(v1/v2);
                    op.pop();
                }
                op.pop(); // '(' removed 
            }

            else{
                if( ch == '+' || ch == '-' ){
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek() == '+') val.push(v1+v2);
                    if(op.peek() == '-') val.push(v1-v2);
                    if(op.peek() == '*') val.push(v1*v2);
                    if(op.peek() == '/') val.push(v1/v2);
                    op.pop();
                    op.push(ch);

                }
                else if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' ||op.peek() == '/'){
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if(op.peek() == '*') val.push(v1*v2);
                        if(op.peek() == '/') val.push(v1/v2);
                        op.pop();
                    }
                    op.push(ch); 
                }
            }
        }
        while(val.size() > 1){
            int v2 = val.pop();
            int v1 = val.pop();
            if(op.peek() == '+') val.push(v1+v2);
            if(op.peek() == '-') val.push(v1-v2);
            if(op.peek() == '*') val.push(v1*v2);
            if(op.peek() == '/') val.push(v1/v2);
            op.pop();
            
        }
        System.out.print("eval: "+ val.peek());
        
    }
}
