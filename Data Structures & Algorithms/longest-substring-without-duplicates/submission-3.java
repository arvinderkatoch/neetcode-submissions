class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int length =0;
        Set<Character> hashset = new HashSet<>();
        for(int right=0; right<=s.length()-1; right++){
            while(hashset.contains(s.charAt(right))){
                hashset.remove(s.charAt(left));
                left++;
            }
            hashset.add(s.charAt(right));
            length = Integer.max(length,right - left + 1);

        }
        return length;
    }
}
