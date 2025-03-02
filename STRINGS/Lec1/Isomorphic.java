import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int m = t.length();

        //check length
        if(n!=m){
            return false;
        }

        //freq map
        HashMap<Character, Character> mp1 = new HashMap<>();
        for(int i = 0; i < n; i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(!mp1.containsKey(ch1)){
                mp1.put(ch1, ch2);
            }
            else{
                if(ch2 != mp1.get(ch1)){
                    return false;
                }
            }
        }

        HashMap<Character, Character> mp2 = new HashMap<>();
        for(int i = 0; i < n; i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(!mp2.containsKey(ch2)){
                mp2.put(ch2, ch1);
            }
            else{
                if(ch1 != mp2.get(ch2)){
                    return false;
                }
            }
        }
        
        return true;
   
    }
    
}