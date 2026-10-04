class Solution {
    public int maxProfit(int[] prices) {
       int lowestNum = prices[0];
       int profit = 0;
       for(int i = 0; i<prices.length-1;i++) {
        if(prices[i] < lowestNum){
          lowestNum = prices[i];
        }
        profit = Math.max(prices[i + 1] - lowestNum,profit );
       }

       return profit;
    }
}
