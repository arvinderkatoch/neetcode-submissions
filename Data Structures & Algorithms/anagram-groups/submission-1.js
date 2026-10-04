class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        let res = {};
        for (let s of strs) {
            let arr = new Array(26).fill(0);
            for (let p of s) {
                arr[p.charCodeAt(p) - 97]++;
            }

             let key = arr.join(',');
              if (!res[key]) {
            res[key] = [];
        }
        res[key].push(s);
        }
        return Object.values(res);
    }
}
