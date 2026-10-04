class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        const res = {};
        for(let s of strs){
            let arr = new Array(26).fill(0);

        for(let c of s){
        arr[c.charCodeAt(c) - 97]++;
        }
        const key = arr.join(',');
        if(!res[key]) {
            res[key] = []
        }
        res[key].push(s);
        }
        return Object.values(res);
    }
}
