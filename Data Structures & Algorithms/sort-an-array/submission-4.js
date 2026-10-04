class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    sortArray(nums) {
        let swapped;
        let len = nums.length;
        do {
            swapped = false;
            for (let i = 0; i < len - 1 ; i++) {
                if (nums[i] > nums[i + 1]) {
                    let temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                     swapped = true;
                }

        
            }
             len--;
        } while (swapped);

        return nums;
    }
}
