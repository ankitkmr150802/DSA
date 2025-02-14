package MEDIUM;
import java.util.*;

class Solution {
    public void setZeroes(int[][] nums) {
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                if (nums[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }

        //row
        for(int num : row){
            for( int j = 0; j < nums[0].length; j++){
                nums[num][j] = 0;
            }
        }
        
        //column
        for(int i = 0; i < nums.length; i++){
            for(int num: col){
                nums[i][num] = 0;
            }
        }
        
    }
}
