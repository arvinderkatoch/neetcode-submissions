class Solution {
    public int maxProfit(int[] prices) {

       int minPrice = prices[0];
         int maxProfit = 0;
        
        for(int i = 0; i<prices.length-1;i++){
            if(prices[i+1] < minPrice) {
                minPrice = prices[i+1];
            } else if(prices[i + 1] - minPrice > maxProfit){
                maxProfit = prices[i + 1] - minPrice;
            }
             System.out.print(maxProfit + "ak");
          System.out.print(minPrice + "pk");
        }
      
         return maxProfit;
    }

}
