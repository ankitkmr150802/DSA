package HARD;
import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int cnt1 =0,cnt2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;

        //extended moore voting algo
        for(int num: nums){
            if(cnt1 == 0 && ele2 != num){
                ele1 = num;
                cnt1++;
            }
            else if(cnt2 == 0 && ele1 != num){
                ele2 = num;
                cnt2++;
            }
            else if(num == ele1){
                cnt1++;
            }
            else if(num == ele2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }

        //verify the majority element
        cnt1 = 0;
        cnt2 = 0;
        for(int num: nums){
            if(num == ele1){
                cnt1++;
            }
            else if(num == ele2){
                cnt2++;
            }
        }

        if(cnt1 > n/3){
            arr.add(ele1);
        }

        if(cnt2 > n/3){
            arr.add(ele2);
        }
        Collections.sort(arr);
        return arr;


    }
}