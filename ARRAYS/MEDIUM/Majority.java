package MEDIUM;

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        int ele = 0;
        for(int num: nums){
            if(cnt == 0){
                ele = num;
                cnt++;
            }
            else if(ele == num){
                cnt++;
            }
            else{
                cnt--;
            }
        }

        //Count of that ele
        int cnt1 = 0;
        for(int num: nums){
            if (num == ele){
                cnt1++;
            }
        }

        //check for count
        if(cnt1 > (n/2)){
            return ele;
        }
        return -1;
    }
}