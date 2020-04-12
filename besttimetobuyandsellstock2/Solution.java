package besttimetobuyandsellstock2;

public class Solution {

    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1; i < prices.length;i++){
            if(prices[i] - prices[i-1] > 0){
                profit+=prices[i] - prices[i-1];
            }
        }
        return profit;
    }

    public static void main(String args[]){
        Solution s = new Solution();
        /*Sum of profit 6 +  */
        int arr[] = {7,1,5,3,6,4};
        System.out.println(s.maxProfit(arr));
    }




}