class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
       for(int i =1; i<prices.length;i++){
        if(prices[i] < minPrice){
            minPrice = prices[i];
        } else if(prices[i] - minPrice > 0){
            int dayProfit = prices[i] - minPrice;
            System.out.println(dayProfit);
            maxProfit = Integer.max(maxProfit, dayProfit);
            }
        
       }
       return maxProfit;
    }
    
}
