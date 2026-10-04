class Solution {
    public String longestCommonPrefix(String[] strs) {
        for(int i = 0; i<strs[0].length();i++) {
if (strs == null || strs.length == 0) return "";
         for(String word : strs )
          if(word.length() -1 < i || word.charAt(i) != strs[0].charAt(i)) {
            return word.substring(0,i);
          }
        }

        return strs[0];
    }
    
}