class Solution {
    public int[] twoSum(int[] nums, int target) {

      HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int i = 0 ; i<nums.length;i++) {
        int remainingAmount = target - nums[i];

        if(hashmap.containsKey(remainingAmount)) {
            return new int[] {hashmap.get(remainingAmount), i};
        } else {
            hashmap.put(nums[i] , i);
        }

       
        }
         return new int[] {};
    }
}
