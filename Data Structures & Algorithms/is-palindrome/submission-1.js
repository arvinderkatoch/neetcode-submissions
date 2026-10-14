class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isPalindrome(s) {
        s = s.replace(/[^a-zA-Z0-9]/g, "");
        for (let i = 0; i < s.length / 2; i++) {
            if (s.toLowerCase().charAt(i) !== s.toLowerCase().charAt(s.length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
