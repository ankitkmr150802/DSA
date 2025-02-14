import java.util.*;

// User function Template for Java

class Solution {
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr(int arr[], int n, int K) {
        // Complete the function
        int psum = 0;
        int len = 0;
        HashMap <Integer,Integer> mp = new HashMap<>();
        // mp.put(0,-1);
        
        for(int i = 0; i < n; i++){
            psum += arr[i];
            
            if(psum == K){
                len = i+1;
            }
            
            if(mp.containsKey(psum-K)){
                len = Math.max(len, i - mp.get(psum-K));
            }
            if(!mp.containsKey(psum)){
                mp.put(psum, i);
            }
        }
        return len;
    }
}