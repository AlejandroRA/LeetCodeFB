package findnumberswithevennumberofdigits;

public class Solution {

    public int countDigit(int n){
        int res = 0;
        while( n > 0){
            n/=10;
            res++;
        }
        return res;
    }

    public int findNumbers(int[] nums) {
        int res = 0;
        for(int item: nums){
            if(countDigit(item) % 2 ==0){
                res++;
            }
        }
        return res;    
    }

    public static void main(String args[]){
        Solution s = new Solution();
        int nums[] = {122,345,2,6,7896};
        System.out.println(s.findNumbers(nums));
        

    }
}