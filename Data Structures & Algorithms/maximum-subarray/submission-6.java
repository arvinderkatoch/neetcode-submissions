class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length <= 1) {
            return nums[nums.length - 1];
        }
         int currentSum = nums[0];
        int maxSum = nums[0];
       for(int i = 1; i<nums.length;i++){
          if(currentSum <= 0) currentSum = 0;
        currentSum += nums[i];
       
        maxSum = Math.max(maxSum, currentSum);
        
      


       }
       return maxSum;
    }
}
