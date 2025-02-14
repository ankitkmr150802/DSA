package HARD;
import java.util.*;

class Solution {
    public List<List<Integer>> generate(int n) {
        int [][] arr = new int[n][];

        for(int i = 0; i < n; i++){
            arr[i] = new int[i+1];
            for(int j = 0; j < i+1; j++){
                if(j == 0 || i == j){
                    arr[i][j] = 1;
                }
                else{
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }

        //convert 2d list in arraylist

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < n; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < arr[i].length; j++){
                row.add(arr[i][j]);
            }
            ans.add(row);
        }
        return ans;
    }
}
