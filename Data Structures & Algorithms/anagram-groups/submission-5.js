class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        let res = {};
        for (let s of strs) {
            let arr = new Array(26).fill(0);
            for (let i = 0; i < s.length; i++) {
                arr[s.charCodeAt(i) - 97]++;
            }

            let key = arr.join(',');

            if (res[key]) {
                res[key].push(s);
            } else {
                res[key] = [s];
            }
        }
        return Object.values(res);
    }
}
