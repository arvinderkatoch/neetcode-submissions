class Solution {
    public String mergeAlternately(String word1, String word2) {
        int start = 0;
        int last = word2.length();
 
  String merge = "";

            while (start < word1.length() && start < word2.length()) {
            merge+=String.valueOf(word1.charAt(start)) + String.valueOf(word2.charAt(start));
            start++;
            
        }
      
      while(start < word2.length()) {
         merge+=String.valueOf(word2.charAt(start));
         start++;
      }
        
      while(start < word1.length()) {
         merge+=String.valueOf(word1.charAt(start));
         start++;
      }
     
return merge;
    }
}