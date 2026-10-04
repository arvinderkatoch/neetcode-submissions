class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] resultArr = new int[nums.length * 2];

        for(int i = 0; i< nums.length;i++) {
            resultArr[i] = nums[i];
            resultArr[i + nums.length] = nums[i];
        }

        return resultArr;
    }
}