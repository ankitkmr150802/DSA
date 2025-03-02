import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0){
            return "";
        }
        //sort the string strs
        Arrays.sort(strs);

        String s1 = strs[0];
        String s2 = strs[strs.length-1];

        int i = 0; 

        while(i < s1.length() && i < s2.length() && s1.charAt(i) == s2.charAt(i)){
            i++;
        }

        return s1.substring(0,i);

    }
}