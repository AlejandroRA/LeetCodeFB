package countingelements;

import java.util.Set;
import java.util.HashSet;

public class Solution {

    public int countElements(int[] arr) {
        int s = 0;
        Set<Integer> set = new HashSet<>();
        for(int item: arr){
            set.add(item);
        }
        for(int item: arr){
            if(set.contains(item+1)){
                s++;
            }
        }
        return s;
    }

    public static void main(String args[]){
        Solution s = new Solution();
        int arr[] = {1,1,2,2};
        System.out.println(s.countElements(arr));
    }

}