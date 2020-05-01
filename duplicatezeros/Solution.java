package duplicatezeros;

public class Solution {
    
    public void duplicateZeros(int[] arr) {
        int numZeros = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] != 0 && numZeros > 0){
                int dup = numZeros;
                for(int z = arr.length-1 ; z>=i;z--){
                    if(z+dup < arr.length){
                        arr[z+dup] = arr[z];
                    }
                }
                int count = 0;
                
                while(i < arr.length && count < dup){
                    arr[i++] = 0;
                    count++;
                }
                numZeros = 0;
                
            }else if(arr[i]==0) {
                numZeros ++;
            }
        }
    }

    
    public static void main(String args[]){
        int nums[]={1,0,2,3,0,4,5,0};
        Solution s = new Solution();
        s.duplicateZeros(nums);
    }
}