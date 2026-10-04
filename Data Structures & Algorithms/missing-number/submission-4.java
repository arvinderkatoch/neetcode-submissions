class Solution {
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);
        int totalNumber = nums.length; // 3

        for (int i = 0 ;i < totalNumber; i++) {
            if(nums[i] != i) {
                return i;
            } 
        }
     return nums.length;
    }
}
