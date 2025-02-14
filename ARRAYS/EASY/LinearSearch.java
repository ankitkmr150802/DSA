//gfg platform

class Solution {
    static int searchInSorted(int arr[], int N, int K) {

        // Your code here
        int ans = -1;
        for(int x: arr){
            if (K == x){
                ans = 1;
                break;
            }
        }
        return ans;
    }
}