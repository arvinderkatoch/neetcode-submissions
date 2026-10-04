class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int arr[] = new int[nums.length * 2];
        for(int i=0;i<nums.length;i++){
        arr[i] = nums[i];
        arr[length] = nums[i];
        length++;
        }

        return arr;
    }
}