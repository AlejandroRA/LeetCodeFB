package happynumber;

import java.util.Set;
import java.util.HashSet;
public class Solution {


    public int squareNumbers(int n){

        int res = 0;
        int digit = 0;
        while(n != 0){
            digit = n%10;
            res += (digit*digit);
            n/=10;            
        }
        return res;

    }
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        do{
            set.add(n);
            n = squareNumbers(n);
            if(n == 1){
                return true;
            }
        }while(!set.contains(n));
        return false;
    }

    public static void main(String args[]){
        Solution s = new Solution();
        System.out.println(s.isHappy(19));
        System.out.println(s.isHappy(20));
        System.out.println(s.isHappy(10000));
    }
}