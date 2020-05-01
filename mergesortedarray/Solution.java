package mergesortedarray;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        
        for(int p = nums1.length-1; p>=0;p--){

            if(p1 >= 0 && p2 >= 0){
                if(nums1[p1] > nums2[p2])
                    nums1[p] = nums1[p1--];
                else
                    nums1[p] = nums2[p2--]; 
            }
            else if(p1 >= 0){
                nums1[p] = nums1[p1--];
            }else if(p2 >= 0){
                nums1[p] = nums2[p2--];
            }
        }

    }

    public void print(int a[]){
        for(int item:a){
            System.out.print(item+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int nums1[] = {0};
        int m = 0;
        int nums2[] = {1};
        int n = 1;
        Solution s = new Solution();
        s.print(nums1);
        s.merge(nums1, m, nums2, n);
        s.print(nums1);
        

    }
}