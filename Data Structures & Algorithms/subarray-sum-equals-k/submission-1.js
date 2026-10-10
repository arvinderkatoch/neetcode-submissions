class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number}
     */
    subarraySum(nums, k) {
        let totalArray = 0;
        for (let start = 0; start < nums.length; start++) {
            let sum = 0;
            for (let end = start; end < nums.length; end++) {
                sum += nums[end];
                if (sum == k) {
                    totalArray += 1;
                }
            }
        }

        return totalArray;
    }
}
