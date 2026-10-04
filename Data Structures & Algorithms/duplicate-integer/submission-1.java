class Solution {
    public boolean hasDuplicate(int[] nums) {
         Arrays.sort(nums);
        int prevValue = 0;

        for(int number : nums) {
            if(number != prevValue) {
                prevValue = number;
            } else return true;
        }

        return false;
    }
}