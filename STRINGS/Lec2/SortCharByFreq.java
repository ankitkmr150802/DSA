package Lec2;
import java.util.*;

class Solution {
    public String frequencySort(String s) {

        //freq map
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0)+1);
        }
        
        //sorting map
        List<Map.Entry<Character, Integer>> arr = new ArrayList<>(mp.entrySet());
        arr.sort((a,b) -> b.getValue()- a.getValue()); //sort the Arraylist

        //final string
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> ele: arr){
            char ch = ele.getKey();
            int freq = ele.getValue();
            for(int i = 0; i < freq; i++){
                sb.append(ch);
            }

        }

        //convert to string
        return sb.toString();
        
    }
}