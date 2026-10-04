class Solution {
    /**
     * @param {string[]} strs
     * @return {string}
     */
    longestCommonPrefix(strs) {
        strs.sort();
        let arr = strs[0];
        let s = "";
        let lastArr = strs[strs.length-1];
        for(let i = 0; i<arr.length;i++){
            console.log(arr[i]);
            console.log(lastArr[i]);
            console.log(arr[i] == lastArr[i]);
          if(arr[i] == lastArr[i]) {
           s+=arr[i];
          } else return s;
        }
        return s;
    }
}
