class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int ans = 0;
        for(int num: nums){
            if(num == 1){
                ans ++;
            }
            else{
                ans = 0;
            }
            max = Math.max(ans, max);
        }
        return max;

    }
}