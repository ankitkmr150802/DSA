
// User function Template for Java

class Solution {
    public int print2largest(int[] arr) {
        int slargest = -1;
        int largest = arr[0];
        
        
        //largest number
        for( int i = 1; i < arr.length; i++){
            if ( arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            }
            
            if(arr[i] > slargest && arr[i] < largest){
                slargest = arr[i];
            }
        }
        
        return slargest;
    }
}

