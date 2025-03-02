import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n != m){
            return false; 
        }
        
        HashMap<Character, Integer> mp = new HashMap<>(); 
        //making freq hashmap
        for(int i = 0; i < s.length(); i++){
            Character ch = s.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else{
                mp.put(ch, mp.get(ch)+1);
            }
        }
        
        //compare
        for(int i = 0; i < t.length(); i++){
            Character ch = t.charAt(i);
            
            if(mp.containsKey(ch)){
                mp.put(ch, mp.get(ch)-1);
            }
            else{
                return false;
            }
        }
        
        //check
        for(int i = 0; i < n; i++){
            Character ch = t.charAt(i);
            if(mp.get(ch) != 0){
                return false;
            }
        }
        // System.gc();
        return true;

    }
}