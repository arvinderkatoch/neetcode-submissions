class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    majorityElement(nums) {
        let count = 1;

        nums.sort((a, b) => a - b);
        let current = nums[0];
        for (let i = 1; i < nums.length; i++) {
            if (nums[i] == current) {
                count++;
            } else {
                current = nums[i];
                count = 1;
            }
            if (count > nums.length / 2) return current;
        }
        return current;
    }
}
