class Solution {
    public int maxSubArray(int[] nums) {
        int maxSub = nums[0];
        int curSum =0;
        for(int num : nums){
            if(curSum < 0){
                curSum =0;
            }
            curSum = curSum+ num;
            if(maxSub < curSum){
                maxSub = curSum;
            }
        }
        return maxSub;
    }
}
