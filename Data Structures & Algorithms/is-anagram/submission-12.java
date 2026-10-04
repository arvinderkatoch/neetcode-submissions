class Solution {
    public boolean isAnagram(String s, String t) {
      int left = 0;
    int[] arr = new int[26];
    if(s.length() != t.length()) {
        return false;
    }
 while( left <= s.length()-1 && left <= t.length()-1){
        arr[s.charAt(left) - 'a']++;
        arr[t.charAt(left) - 'a']--;
        left++;
 }

     for(int j : arr) {
        if(j != 0) {
            return false;
        }
     }
     return true;
    }
}
