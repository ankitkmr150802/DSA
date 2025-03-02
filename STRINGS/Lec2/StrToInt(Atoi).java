package Lec2;

class Solution {
    public int myAtoi(String str) {
        int n = str.length();
        int ans = 0;
        int sign = 1;

        if(n == 0){
            return 0;
        }

        //ignoring white spaces
        int i = 0; 
        while(i < n && str.charAt(i) == ' '){
            i++;
        }
        //edge case all white space
        if(i == n){
            return 0;
        }

        //signedness
        if(str.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        else if(str.charAt(i) == '+'){
            i++;
        }


        //conversion
        while(i < n){
            int num = str.charAt(i) - '0'; //integer

            
            if( num >=0 && num <= 9){
                //overflow handling
                if (ans > Integer.MAX_VALUE / 10 || 
                    (ans == Integer.MAX_VALUE / 10 && num > 7)) {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                ans = (ans * 10 +num);
            }
            else{
                break;
            }
            i++;
        }
        return ans * sign;   
    }
}
