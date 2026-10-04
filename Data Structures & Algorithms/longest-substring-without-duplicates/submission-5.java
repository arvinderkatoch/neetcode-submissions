class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int length = 0;
        HashMap<Character, Integer> hashmap = new HashMap<>();
        for (right = 0; right < s.length(); right++) {
            while (hashmap.containsKey(s.charAt(right))) {
                hashmap.remove(s.charAt(left));
                left++;
            }
            hashmap.put(s.charAt(right), right);
            System.out.println(hashmap);
            length = Math.max(right - left + 1, length);
         
        }
        return length;
    }
}
