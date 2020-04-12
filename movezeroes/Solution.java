package movezeroes;

public class Solution {

    public void moveZeroes(int[] nums) {
        int numZeros = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == 0){
                numZeros++;
            }
            else{
                int aux = nums[i-numZeros];
                nums[i-numZeros] = nums[i];
                nums[i] = aux;
            }
        }
    }
    public static void main(String args[]){
        Solution s = new Solution();
        int nums[] = {0,1,0,3,12};
        s.moveZeroes(nums);
        for(int item: nums){
            System.out.println(item);
        }
    }

}