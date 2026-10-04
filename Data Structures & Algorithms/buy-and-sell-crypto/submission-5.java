class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int index = 0;
        int profit = 0;

        for(int i =0; i<prices.length;i++) {
           
            if(prices[i] < minPrice) {
                minPrice = prices[i];
                System.out.println(minPrice);
                
            } else {
                
                int current = prices[i] - minPrice;

                if(current > profit){
                    profit = current;
                }
            }
        
        }



        return profit;
    }
}
