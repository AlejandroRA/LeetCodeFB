package maximumsubarray;

/**
 * Solution
 */
public class Solution {

    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = nums[0];
        for(int i = 1; i < nums.length;i++){
            sum = Math.max(nums[i], sum + nums[i]);
            res = Math.max(res, sum);
        }
        return res;
    }

    public static void main(String args[]){
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        Solution s = new Solution();
        System.out.println(s.maxSubArray(nums));
    }
}