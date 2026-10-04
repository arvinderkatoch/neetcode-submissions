class Solution {
    public void sortColors(int[] nums) {
        boolean swap;
        do{
             swap = false;
            for(int i = 1; i<nums.length;i++){
                if(nums[i] < nums[i - 1]){
                    int temp = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = temp;
                    swap = true;
                   
                }
            }
        } while(swap);
    }
}