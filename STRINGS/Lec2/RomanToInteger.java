package Lec2;
import java.util.*;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);

        int ans = 0;
        ans += mp.get(s.charAt(s.length()-1));
        for(int i = s.length()-2; i >= 0; i--){
            
            char pref = s.charAt(i); //prefix
            char suff = s.charAt(i+1); //suffix
            
            if(mp.get(pref) >= mp.get(suff)){
                ans += mp.get(pref);
            }
            else{
                ans -= mp.get(pref);
                
            }
        }
        return ans;
   
    }
}
