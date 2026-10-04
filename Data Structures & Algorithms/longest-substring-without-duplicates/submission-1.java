class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int length =0;
        Set<Character> hashset = new HashSet<>();
        for(right = 0; right<s.length();right++){
   
            while(hashset.contains(s.charAt(right))){
                hashset.remove(s.charAt(left));
                left++;
            } 
           
            hashset.add(s.charAt(right));
            System.out.print(hashset);
             length = Math.max(length, right - left + 1);
             
            }
             
          return length;
        }

    }

