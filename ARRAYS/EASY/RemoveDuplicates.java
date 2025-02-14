class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        int ans = 1;
        int i = 0;
        int j = 1;
        while(j < n){
            if (arr[i] != arr[j]){
                ans++;
                arr[i+1] = arr[j];
                i++;
               
            }
            j++;
            
        }
        return ans;
    }
}