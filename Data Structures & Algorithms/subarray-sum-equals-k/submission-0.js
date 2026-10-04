class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number}
     */
    subarraySum(nums, k) {
        let totalSubArray = 0;

        for (let start = 0; start < nums.length; start++) {
            let sum = 0;
            for (let end = start; end < nums.length; end++) {
                sum += nums[end];
                if (sum == k) {
                    totalSubArray += 1;
                }
            }
        }
         return totalSubArray;
    }
}
