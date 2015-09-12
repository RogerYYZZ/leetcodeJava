package leetcode;

public class CloseThreeSum {
	public int threeSumClosest(int[] nums, int target) {
        int[] closeTarget = sort(nums,0,nums.length-1);
        if(closeTarget[0] + closeTarget[1] + closeTarget[2] >= target )
        return closeTarget[0] + closeTarget[1] + closeTarget[2];
        else if (closeTarget[nums.length-1] + closeTarget[nums.length-2] + closeTarget[nums.length-3] <= target)
        return closeTarget[nums.length-1] + closeTarget[nums.length-2] + closeTarget[nums.length-3];
        else{
            int close = closeTarget[0] + closeTarget[1] + closeTarget[2];
       //     int bigger = 0;
       //     boolean find = false;
            for(int i = 0; i < nums.length-2; i++){
         //       if(find == true)
          //      break;
                if(i > 0){
		         if(closeTarget[i] == closeTarget[i-1] )
		         continue;
		     }
                for(int j = i+1; j < nums.length-1; j++ ){
            //        if(find == true)
              //      break;
                    if(j > i+1){
			         if(closeTarget[j] == closeTarget[j-1])
			         continue;
			     }
			     for(int k = j+1; k < nums.length; k++){
			         if(k > j+1){
			         if(closeTarget[k] == closeTarget[k-1])
			         continue;
			         }
			       int sum = closeTarget[i] + closeTarget[j] + closeTarget[k];
			        if(Math.abs(sum-target) < Math.abs(close-target))
			        close = sum;
			     }
                }
            }
        
        
        return close;
    }
    }
     private  int[] sort(int[] a, int start, int end){
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
	    
	    private  int[] merge(int[] a, int[] b){
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
}
