class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    validPalindrome(s) {

      if(s.length <= 1){
        return true;
      }
        let left = 0;
        let right = s.length - 1;

        while(left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return checkPalindrone(s, left + 1, right) || checkPalindrone(s, left, right - 1);
            } else {
                left++;
                right--;
            }
        }
        return true;
        function checkPalindrone(s, left, right) {
            while (left < right) {
                if (s.charAt(left) == s.charAt(right)) {
                   left++;
                    right--;
                } else {
                    return false;
                }
            }
            return true;
        }
    }
}
