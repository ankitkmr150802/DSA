package HARD;
import java.util.*;

class GfG{
    int maxLen(int arr[], int n){
        // Your code here
        
        int len = 0;
        int psum = 0;
        
        HashMap <Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);
        
        for(int i = 0; i < n; i++){
            psum += arr[i];
            
            if(mp.containsKey(psum)){
                len = Math.max(len, i- mp.get(psum));
            }
            else{
                mp.put(psum,i);
            }
        }
        return len;
    }
}
