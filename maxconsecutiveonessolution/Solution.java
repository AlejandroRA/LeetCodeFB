package maxconsecutiveonessolution;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        int res = 0;
        for(int item: nums){
            if(item == 1){
                res++;
            }else{
                max = Math.max(res,max);
                res = 0;
            }
        }
        max = Math.max(res, max);
        return max;
    }

    public static void main(String args[]){
        int array[] = {1,1,1,1,1,1,1,0,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,0,1};
        Solution s = new Solution();
        System.out.println(s.findMaxConsecutiveOnes(array));
    }
}