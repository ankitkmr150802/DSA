package MEDIUM;
import java.util.*;


class Solution {
    public int subarraySum(int[] arr, int k) {
      int n = arr.length;
      
      HashMap<Integer,Integer> mp = new HashMap<>();
      mp.put(0,1);
      int psum = 0;
      int ans = 0;
      
      //traverse
      for(int i = 0; i < n; i++){
        psum += arr[i];
        
        if(mp.containsKey(psum-k)){
          ans += mp.get(psum-k);
        }
        mp.put(psum,mp.getOrDefault(psum,0)+1);
      }
      return ans;
    }
}
