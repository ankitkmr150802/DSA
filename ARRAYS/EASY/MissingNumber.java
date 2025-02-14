class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int Tsum = (n * (n+1)) / 2;
        int sum = 0;
        for(int num: nums){
            sum += num;
        }

        ans = Tsum - sum;
        return ans;

    }
}