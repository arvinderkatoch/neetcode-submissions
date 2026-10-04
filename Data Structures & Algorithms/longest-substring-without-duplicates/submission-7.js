class Solution {
    /**
     * @param {string} s
     * @return {number}
     */
    lengthOfLongestSubstring(s) {
        const hashMap = new Map();
        let left = 0;
        let right = 0;
        let lengthMax = 0;

        for (let right = 0; right < s.length; right++) {
            while (hashMap.has(s.charAt(right))) {
                hashMap.delete(s.charAt(left));
                left++;
            }
          hashMap.set(s.charAt(right), right);
          lengthMax = Math.max(lengthMax, right - left + 1);
        }
return lengthMax;
    }
}
