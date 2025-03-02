class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        String ans = "";
        StringBuilder sb = new StringBuilder();
        for (int i = n-1; i > -1; i--){
            char ch = s.charAt(i);
            if(ch != ' '){
                 sb.append(ch);
            }
            else{
                if(sb.length() != 0){
                    sb.reverse();
                ans += sb;
                sb.delete(0,n-1);
                ans += " ";
                }
            }
        }
        sb.reverse();
        ans += sb;
        return ans;
    }
}