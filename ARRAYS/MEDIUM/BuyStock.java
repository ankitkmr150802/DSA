package MEDIUM;

class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int maxProfit = 0;
        int buy = arr[0];
        for(int i = 1; i < n; i++){
            int sell = arr[i];
            int profit = sell - buy;
            maxProfit = Math.max(profit, maxProfit); //try to maximize
            buy = Math.min(buy, sell);
        }
        return maxProfit;
    }
}