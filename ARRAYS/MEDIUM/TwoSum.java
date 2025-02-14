package MEDIUM;

import java.util.HashMap;

public class TwoSum {
    class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int [] ans = {-1};

        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < n; i++){
            int partner = target - nums[i];
            if(mp.containsKey(partner)){
                ans = new int[] {mp.get(partner),i};
                return ans;
            }
            mp.put(nums[i],i);
        }
        return ans;
    }
}
}
