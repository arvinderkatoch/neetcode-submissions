class Solution {
    public void sortColors(int[] nums) {
        boolean isSwapped;
        do{
        isSwapped = false;
        for(int i = 1; i< nums.length; i++){
         if(nums[i] < nums[i - 1]){
         int temp = nums[i-1];
         nums[i - 1] = nums[i];
         nums[i] = temp;
      isSwapped = true;
            }
        }

        } while(isSwapped);
    }
}