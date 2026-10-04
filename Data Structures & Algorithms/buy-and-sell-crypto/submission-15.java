class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int MaxProfit = 0;
        for(int i =0; i<prices.length;i++){
          minPrice = Math.min(minPrice, prices[i]);
          if(prices[i] - minPrice > MaxProfit){
            MaxProfit = prices[i] - minPrice;
          }
        }

        return MaxProfit;
    }
}
