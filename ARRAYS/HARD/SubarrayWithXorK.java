package HARD;
import java.util.*;


class Solution {
    public long subarrayXor(int arr[], int m) {
        // code here
        
        long ans = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);

        int xor = 0;
        for(int num: arr){
            xor = xor ^ num;
            int x = xor ^ m;
            if(mp.containsKey(x)){
                ans += mp.get(x);
            }
            mp.put(xor,mp.getOrDefault(xor,0)+1);
        }
        return ans;
    }
}
