class Solution {
    public boolean rotateString(String s, String g) {

        //equal length
        if(s.length() != g.length()){
            return false;
        }

        String ans = s + s ; //adding string twice to track substribng

        if(ans.contains(g)){
            return true;
        }
        else{
            return false;
        }
        
        
    }
}