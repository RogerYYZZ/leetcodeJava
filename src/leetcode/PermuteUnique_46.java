package leetcode;
import java.util.*;
public class PermuteUnique_46 {
	public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> perm = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0) return perm;
        Arrays.sort(nums);
    List<Integer> start = new ArrayList<Integer>();
    start.add(nums[0]);
    perm.add(start);
    for(int i = 1; i < nums.length; i++){
        List<List<Integer>> temp_perm = new ArrayList<List<Integer>>();
        for(int j = 0; j <= i; j++){
            for(int k = 0; k < perm.size(); k++){
        //        if(j > 0 && nums[i] == perm.get(k).get(j-1))
          //       continue;
            	int m = 0;
            if(j > 0){
            	
            	for( m = 0; m < j; m++){
            		if(nums[i] == perm.get(k).get(m))
            			break;
            	}
            }
                if(m == j){
                List<Integer> a = new ArrayList<Integer>(perm.get(k));
                a.add(j,nums[i]);
                temp_perm.add(a);
                }
                else
                	continue;
            
            }
        }
      perm = temp_perm;  
    }
    return perm;
    }
	public static void main(String[] args){
		int[] num = {1,2,2,3,3};
	//	System.out.println(permuteUnique(num).size());
		HashSet<String> a = new HashSet<String>();
		a.add("ab");
		System.out.println(a.contains("abc"));
		
	}
}
