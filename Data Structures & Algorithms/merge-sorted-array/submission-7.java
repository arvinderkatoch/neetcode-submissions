class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
 int i = 0;
 int index = 0;
 int in = 0;
      for(int k =0; k < nums1.length; k++){
        if(nums1[k] == 0 && in < nums2.length) {
            nums1[k] = nums2[in];
            in++;
        }
      }
      while(i < nums1.length-1){
        // if(nums1[i] == 0){
        //      System.out.println(nums2[i]);
        //      nums1[i] = nums2[i];
        //      nums1[i + 1] = nums2[i + 1];

        //     }
          boolean swapped = false;
          
          if(nums1[i] > nums1[i + 1]){

            int temp = nums1[i];
            nums1[i] = nums1[i + 1];
            nums1[i + 1] = temp;
            swapped = true;

            
        }
        if(swapped && i > 0){
            i--;
        } else i++;
      }
        
    }
}