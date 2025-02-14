package HARD;



// User function Template for Java
// import java.util.HashMap;
class Solve {
    int[] findTwoElement(int arr[]) {
        int n = arr.length;
        int repeating = 0, missing = 0;

        int[] hash = new int[n+1];
        
        for(int num: arr){
            hash[num]++;
        }
        
        for(int i = 1; i <= n; i++){
            if(hash[i] == 2){
                repeating = i;
            }
            else if(hash[i] == 0 ){
                missing = i;
            }
        }
        
        
        
        
        int[] ans = {repeating, missing};
        
        return ans;
    }
}