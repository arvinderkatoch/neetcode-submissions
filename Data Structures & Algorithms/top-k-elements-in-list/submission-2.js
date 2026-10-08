class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        let freq = new Map();

        for (let i = 0; i < nums.length; i++) {
            freq.set(nums[i], (freq.get(nums[i]) || 0) + 1);
        }

        let arr = [...freq];
        arr.sort((a, b) => b[1] - a[1]);
        const res = [];

        for (let i = 0; i < k; i++) {
            res.push(arr[i][0]);
        }
        return res;
    }
}
