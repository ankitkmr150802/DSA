package MEDIUM;

class Solution {
    public int[] sortColors(int[] nums) {
        // int c0 = 0;
        // int c1 = 0;
        // int c2 = 0;
        int n = nums.length;

        // for(int i = 0; i < n; i++){
        //     if(nums[i] == 0){
        //         c0++;
        //     }
        //     if(nums[i] == 1){
        //         c1++;
        //     }
        //     if(nums[i] == 2){
        //         c2++;
        //     }
        // }

        // //fill = 0
        // for(int i = 0; i < c0; i++){
        //     nums[i] = 0;
        // }

        // //fill = 1
        // for(int i = c0; i < c0+c1; i++){
        //     nums[i] = 1;
        // }

        // //fill = 2
        // for(int i = c0+c1; i < n; i++){
        //     nums[i] = 2;
        // }

        // return nums;

        int start = 0;
        int mid = 0;
        int end = n-1;

        while(mid <= end){

            if(nums[mid] == 0){
                //swap start and mid
                int temp = nums[start];
                nums[start] = nums[mid];
                nums[mid] = temp;
                start++;
                mid++;
            }

            else if(nums[mid] == 1){
                mid++;
            }

            else{
                //swap mid and end 
                int temp = nums[mid];
                nums[mid] = nums[end];
                nums[end] = temp;
                
                end--;
                // mid++;
            }
        }
        return nums;
    }
}
