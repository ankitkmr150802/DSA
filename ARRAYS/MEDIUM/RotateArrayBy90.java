package MEDIUM;

class Solution {
    public void rotate(int[][] arr) {
        //steps
        //Matrix -> Transpose -> reverse every row -> rotated matrix by 90 deg

        //transpose
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr[i].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //reverse every row

        for(int i = 0; i < arr.length; i++){
            int k = arr.length - 1;
            for(int j = 0; j < arr.length / 2; j++){
                k = arr.length-1- j;
                int temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
            }
        }
    }
}
