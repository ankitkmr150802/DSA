package HARD;

class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        int pref = 1;
        int suf = 1;
        for(int i = 0; i < n; i++){
            if (pref == 0){
                pref = 1;
            }
            if (suf == 0){
                suf = 1;
            }
            pref *= nums[i];
            suf *= nums[n-i-1];
            int max = Math.max(pref, suf);
            ans = Math.max(ans, max);
            
        }
        return ans;
    }
}