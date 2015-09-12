package leetcode;
import java.util.*;
public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {
        if(nums.length == 0) return new ArrayList<List<Integer>>();
		 int[] numsSort = sort(nums,0,nums.length-1);
		 List<List<Integer>> add_0 = new ArrayList();
		 for(int i = 0; i<nums.length-2 ; i++){
		    if(i > 0){
		         if(numsSort[i] == numsSort[i-1] )
		         continue;
		     }
			 for(int j = i+1; j< nums.length-1; j++){
			    if(j > i+1){
			         if(numsSort[j] == numsSort[j-1])
			         continue;
			     }
				 int sum = numsSort[i]+numsSort[j];
				 if(sum + numsSort[nums.length-1] < 0)
					 continue;
				 for(int k = j+1; k <nums.length;k++ ){
					
					 if(sum+numsSort[k] == 0){
						 List<Integer> sum_0 = new ArrayList();
						 sum_0.add(numsSort[i]);
						 sum_0.add(numsSort[j]);
						 sum_0.add(numsSort[k]);
						 add_0.add(sum_0);
						 break;
					 }
					 else if(sum+numsSort[k] > 0)
						 break;
						 
				 }
			 }
		 }
		 return add_0;
	    }
	 
	
	    
	   
	 public static int[] sort(int[] a, int start, int end){
	        if(start >= end) {
	            int[] single = new int[1];
	            single[0] = a[start];
	            return single;
	        }
	      int middle = (start+end)/2;
	      int[] firstHalf =  sort(a,start,middle);
	      int[] secondHalf = sort(a,middle+1,end);
	      int[] mergeA = merge(firstHalf,secondHalf);
	      return mergeA;
	    }
	    
	    private static int[] merge(int[] a, int[] b){
	        int[] mergeArray = new int[a.length+b.length];
	        int k = 0;
	        int i = 0;
	        int j = 0;
	       while(i<a.length || j<b.length){
	            if(j == b.length) mergeArray[k++] = a[i++];
	            else if(i == a.length) mergeArray[k++] = b[j++];
	            else if(a[i] < b[j]) mergeArray[k++] = a[i++];
	            else mergeArray[k++] = b[j++];
	       } 
	       return mergeArray;
	    }
	 
	 public static void main(String[] args){
	/*	 int[] a = {1,-1,-1,0,1,1,-2};
		 String[] b =  {"1","-1","-2","0","1","1","3"};
		 b[1] = null;
	//	 int[] b = sort(a ,0, a.length-1);
	//	 for(int i = 0; i<b.length;i++){
		 System.out.println(b[1]);
		 
//		HashSet<int[]> c = new HashSet<int []>();
	//	int[] d = {1,2};
	//	int[] e={1,2};
	//	Math.min
	//	c.add(d);
	//	c.add(e);
	//	System.out.println(d.equals(e));
	 * */
	 
	// }
		 List<Integer> a = new ArrayList<Integer>();
		 a.add(0);
		 a.add(1);
		 List<Integer> b = new ArrayList<Integer>(a);
		 b.add(2);
		 System.out.println(a);
		 Stack<String> f = new Stack<String>();
	//	 f.
	//	String e = "sdsdsd";
	//	e.
		 
	 }
}
