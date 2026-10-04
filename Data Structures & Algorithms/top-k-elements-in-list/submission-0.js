class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        let freq = new Map();

        for (let num of nums) {
         freq.set(num, (freq.get(num) || 0) + 1);
        }

       
        let arr = [...freq];
        let res = [];
        arr.sort((a,b) => b[1] - a[1]);
       for(let i =0; i<k;i++){
         res.push(arr[i][0])
       }
 return res;
    }
}
