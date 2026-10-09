class Solution {
    /**
     * @param {number[]} prices
     * @return {number}
     */
    maxProfit(prices) {
        let min = prices[0];
        let profit = 0;
        for(let i = 0; i<prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }
            console.log(prices[i] - min);
           if(prices[i] - min > 0){
           profit+= prices[i] - min;
           min = prices[i];

           }
        }
        return profit;
    }
}
