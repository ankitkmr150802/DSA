class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        k %= n;
        rotateArray(nums, n, k); 
        
    }

    //print finall rotated array
    public static void rotateArray(int [] nums, int n, int k){
        //reverse first n-k elements
        reverse(nums, 0, n-k-1);
        
        // reverse last k elements
        reverse(nums, n-k, n-1);

        //reverse whole array
        reverse(nums, 0, n-1);

    }

    //reverse array 
    public static void reverse(int [] arr, int start, int end){

        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }



}