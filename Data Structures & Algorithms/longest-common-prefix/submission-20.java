class Solution {
    public String longestCommonPrefix(String[] strs) {
      StringBuilder val = new StringBuilder();
      Arrays.sort(strs);
        char[] firstArr = strs[0].toCharArray();
        char[] lastArr = strs[strs.length-1].toCharArray();

        for(int i =0;i < firstArr.length;i++){
          if(firstArr[i] != lastArr[i]){
           return val.toString();
          } else {
            val.append(firstArr[i]);
          }
        }
return val.toString();
    }
}