class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s: string, t: string): boolean {
        if (s.length != t.length) {
            return false;
        }
        let arr: number[] = new Array(26).fill(0);

        for (let i = 0; i < s.length; i++) {
            arr[s.charCodeAt(i) - 97]++;
            arr[t.charCodeAt(i) - 97]--;
        }

       for(let ar of arr){
      if(ar !== 0) {
        return false;
      }
      
       }
        return true;
    }
}
