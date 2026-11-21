class Solution {
    /**
     * @param {string} s
     * @return {number}
     */
    lengthOfLongestSubstring(s) {
        let left = 0;
        let right = 0;
        let length = 0;
        let map = new Map();
        for (right = 0; right < s.length; right++) {
            while (map.has(s.charAt(right))) {
                map.delete(s.charAt(left));
                left++;
            }
            map.set(s.charAt(right), right);
            length = Math.max(length,right - left + 1)
        }
        return length;
    }
}
