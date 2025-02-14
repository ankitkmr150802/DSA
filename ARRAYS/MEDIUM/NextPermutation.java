package MEDIUM;

class Solution {
    public int[] nextPermutation(int[] arr) {
        int n = arr.length;
        int index = -1;
        //find breakpoint

        for(int i = n-2; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            //reverse
            int i = 0, j = n-1;
            while(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            return arr;
        }

        //find just > 1
        for(int i = n-1; i >= index+1; i--){
            if(arr[i] > arr[index]){
                //swap
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                break;
            }
        }

        //sort the remaining array
        int start = index+1, end = n-1;
        while(start< end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }
}