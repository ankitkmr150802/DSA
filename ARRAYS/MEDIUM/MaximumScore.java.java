package MEDIUM;

// User function Template for Java

class Solution {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(int arr[]) {
        // Your code goes here
        int n = arr.length;
        int ans = 0;
        for(int i = 0; i < n-1;i++){
            int sum = arr[i] + arr[i+1];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
