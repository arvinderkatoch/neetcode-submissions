class Solution {
    public void sortColors(int[] nums) {
        boolean swapped;
        do
        {
     swapped = false;
        for(int i =1; i< nums.length;i++) {
            if(nums[i-1] > nums[i]) {
                int temp = nums[i-1];
                 nums[i-1] = nums[i];
                 nums[i] = temp;
 swapped = true;
              
                
            }
        }

        } while(swapped);
       
    }
}

