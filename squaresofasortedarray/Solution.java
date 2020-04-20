package squaresofasortedarray;

public class Solution {

    public int[] sortedSquares(int[] A) {
        int res[] = new int[A.length];
        int negativeLim = 0;
        while(negativeLim < A.length && A[negativeLim] < 0){
            negativeLim++;
        }
        int i = negativeLim-1; 
        int j = negativeLim;
        int t = 0;
                
        while(i >=0 || j < A.length){
        
            if(i >=0 && j < A.length){

     
                int squareNegative = A[i] * A[i];
                int squarePositive = A[j] * A[j];
                if(squareNegative < squarePositive){
                    res[t++] = squareNegative;
                    i--;
                }else{
                    res[t++] = squarePositive;
                    j++;
                }
            }else if(i >=0 ){
                
                int squareNegative = A[i] * A[i];
                res[t++] = squareNegative;
                i--;
            }else if(j < A.length){
                
                int squarePositive = A[j] * A[j];
                res[t++] = squarePositive;
                j++;
            }
        }
        return res;   
    }

    public static void main(String args[]){
        int nums[] = {10,13};
        Solution s = new Solution();
        nums = s.sortedSquares(nums);
        for(int item: nums){
            System.out.println(item);
        }
    }

}