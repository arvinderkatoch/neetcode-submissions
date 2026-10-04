class Solution {
    public int maxProfit(int[] prices) {

      if(prices.length <= 0){
        return prices[0];
      }
       int minPrice = prices[0];
         int maxProfit = 0;
        for(int i = 0; i<prices.length-1;i++){
            if(prices[i+1] < minPrice) {
                minPrice = prices[i+1];
            } else if(prices[i + 1] - minPrice > maxProfit){
                maxProfit = prices[i + 1] - minPrice;
            }
            
        }
        System.out.println(minPrice);
         return maxProfit;
    }

}
