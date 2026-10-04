class Solution {
    /**
     * @param {number[]} nums
     * @return {void} Do not return anything, modify nums in-place instead.
     */
    moveZeroes(nums) {
        let insertPos = 0;
        for(let  i = 0; i<nums.length;i++){
            if(nums[i] != 0) {
                if(i != insertPos){
                nums[insertPos] = nums[i];
                nums[i] = 0;

                }
                console.log(nums.toString())
               insertPos++; 
            }

        }
    }
}
