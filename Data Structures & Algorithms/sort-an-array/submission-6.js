class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    sortArray(nums) {
        let swapped;
        do {
            swapped = false;
            let pass = 0;
            for (let i = 0; i < nums.length-1-pass; i++) {
                if(nums[i] > nums[i + 1]){
                let temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
                swapped = true;
                pass++;
                }
            }
        } while (swapped);

        return nums;
    }
}
