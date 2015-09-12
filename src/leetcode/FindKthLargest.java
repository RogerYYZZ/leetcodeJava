package leetcode;

public class FindKthLargest {
	public int findKthLargest(int[] nums, int k) {
        int start = 0;
        int end = nums.length-1;
       return sort(nums,start,end)[end-k+1];
        
    
    }
    private int[] sort(int[] a, int start, int end){
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
    
    private int[] merge(int[] a, int[] b){
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
    	int[] a = {3,2,1,5,6,4,10};
    	FindKthLargest find = new FindKthLargest();
    	System.out.println(find.findKthLargest(a, 4));
    	
    }
}
