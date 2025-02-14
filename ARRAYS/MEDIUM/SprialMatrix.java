package MEDIUM;
import java.util.*;


class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
    int row = arr.length;
    int col = arr[0].length;
    ArrayList<Integer> array = new ArrayList<>();
    int toprow = 0, bottomrow = row-1, leftcol = 0, rightcol = col-1;
    int totalelements = 0;
    while(totalelements < row * col){

        //toprow -> leftcol to rightcol
        for(int j = leftcol; j <= rightcol && totalelements < row * col; j++){
            array.add(arr[toprow][j]);
            totalelements++;
        }
        toprow++;

        //rightcol -> toprow to bottomrow
        for(int j = toprow; j <= bottomrow && totalelements < row * col; j++){
            array.add(arr[j][rightcol]);

            totalelements++;
        }
        rightcol--;

        //bottomrow -> rightcol to leftcol
        for(int j = rightcol; j >= leftcol && totalelements < row * col; j--){
            array.add(arr[bottomrow][j]);
            totalelements++;
        }
        bottomrow--;

        //leftcol -> bottomrow to toprow
        for(int j = bottomrow; j >= toprow && totalelements < row * col; j--){
            array.add(arr[j][leftcol]);
            totalelements++;
        }
        leftcol++;
    }
    return array;

    }
}