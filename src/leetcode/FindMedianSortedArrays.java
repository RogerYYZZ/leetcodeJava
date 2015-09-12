package leetcode;

public class FindMedianSortedArrays {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] totalArray  = new int[nums1.length+nums2.length];
          double median = 0.0000;
          int k = 0;
          int i = 0;
          int j = 0;
          while(i < nums1.length || j < nums2.length){
              if(i == nums1.length) totalArray[k++] = nums2[j++];
              else if(j == nums2.length) totalArray[k++] = nums1[i++];
              else if(nums1[i] > nums2[j]) totalArray[k++] = nums2[j++];
              else totalArray[k++] = nums1[i++];
          }
          if((nums1.length+nums2.length)%2 == 0)
          median = ((double)(totalArray[(nums1.length+nums2.length)/2]+totalArray[(nums1.length+nums2.length)/2-1])/2.0000);
          
          else 
          median = totalArray[(nums1.length+nums2.length)/2];
          return median;
    }
	public static void main(String[] args){
		int[] a = {1};
		int[] b = {2,3,6,8,10}; 
		System.out.println(findMedianSortedArrays(a,b));
	}
}
