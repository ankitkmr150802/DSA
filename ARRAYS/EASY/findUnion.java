import java.util.*;

//User function Template for Java

//arr1,arr2 : the arrays
// n, m: size of arrays
class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m){
        // add your code here
        
        HashSet<Integer> st = new HashSet<>();
        ArrayList<Integer> array = new ArrayList<>();
        
        //adding arr1 in hashset
        for(int num : arr1){
            st.add(num);
        }
        
        //check for arr2 elements
        
        for(int num : arr2){
            if(!st.contains(num)){
                st.add(num);
            }
        }
        
        for(int num: st){
            array.add(num);
        }
        Collections.sort(array);
        return array;
    }
}

