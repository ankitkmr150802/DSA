import java.util.*;

public class infixToPrefix{
    public static void main(String[] args){
        String s = "(5+1)*(1-2)";
        int n = s.length();
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            int ascii = (int) ch - 48;
            String str = String.valueOf(ascii);
            if(ascii >= 0 && ascii <= 9) val.push(str);

            else if(op.size() == 0 || ch == '(' || op.peek() == '(') op.push(ch);

            else if(ch == ')'){
                while( op.peek() != '('){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char oper = op.pop();
                    String temp = oper + v1 + v2;
                    val.push(temp);

                }
                op.pop(); // '(' removed 
            }
            
            else{
                if( ch == '+' || ch == '-' ){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char oper = op.pop();
                    String temp = oper + v1 + v2;
                    val.push(temp);
                    op.push(ch); 

                }
                else if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' ||op.peek() == '/'){
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char oper = op.pop();
                        String temp = oper + v1 + v2;
                        val.push(temp);
                    }
                    op.push(ch); 
                }
            }
        }
        while(val.size() > 1){
            String v2 = val.pop();
            String v1 = val.pop();
            char oper = op.pop();
            String temp = oper + v1 + v2;
            val.push(temp);
            
        }
        System.out.print("eval: "+ val.peek());

    }
}