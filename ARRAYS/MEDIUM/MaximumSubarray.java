package MEDIUM;

class Solution {
    public int maxSubArray(int[] arr) {
        
        int ans = Integer.MIN_VALUE;
        int psum = 0;
        for(int num: arr){
            psum += num;
            
            ans = Math.max(ans, psum);
            if(psum < 0){
                psum = 0;
                
            }
        }
        return ans;
    }
}
