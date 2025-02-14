
class Solution {
    public static int largest(int[] arr) {
        // code here
        int max = 0;
        
        for(int x: arr){
            if(x > max){
                max = x;
            }
        }
        
        return max;
    }
}
