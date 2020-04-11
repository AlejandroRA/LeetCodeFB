package singlenumber; 
public class Solution {

    public int SingleNumber(int arr[]){
        int s = 0;
        for(int i = 0; i < arr.length ; i++){
            s^=arr[i];
        }
        return s;
        
    }
    public static void main(String args[]){
        Solution s = new Solution();
        int arr[] = {1};
        int a = s.SingleNumber(arr);
        System.out.println(a);
    }
    
}