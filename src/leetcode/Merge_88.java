package leetcode;
import java.util.*;
public class Merge_88 {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] a = new int[m+n];
        int i = 0, j = 0, k = 0;
        
        while( i < m || j < n){
            if(i == m && j < n)
            a[k++] = nums2[j++];
          else  if(j == n && i < m)
            a[k++] = nums1[i++];
          else{
                if(nums1[i] < nums2[j]){
                    a[k++] = nums1[i++];
                }
                else
                a[k++] = nums2[j++];
            }
        }
        nums1 = a;
    }
	public static void main(String[] args){
		int[] nums1 = {0};
		int[] nums2 = {1};
		merge(nums1, 0, nums2, 1);
		System.out.println(nums1[0]);
	
	}
}
