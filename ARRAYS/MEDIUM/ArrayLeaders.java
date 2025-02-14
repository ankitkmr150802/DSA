package MEDIUM;
import java.util.*;


class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n = arr.length;
        int flag = -1;

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = n-1; i >=0; i--){
            if(arr[i] >= flag){
                ans.add(arr[i]);
            }
            flag = Math.max(arr[i],flag);
        }

        //reverse the arraylist
        int start = 0, end = ans.size()-1;
        while(start < end){
            int temp = ans.get(start);
            ans.set(start,ans.get(end));
            ans.set(end, temp);
            start++;
            end--;
        }
        return ans;
    }
}
