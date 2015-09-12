package leetcode;
import java.util.*;
public class PathSum {
	 public static List<List<Integer>> pathSum(TreeNode root, int sum) {
	        List<List<Integer>> path = new ArrayList<List<Integer>>();
	        if(root == null) return path;
	     buildPath(path, new ArrayList<Integer>(), root, sum);
	     return path;
	    }
	    private static  void buildPath(List<List<Integer>> path, List<Integer> road, TreeNode root, int sum){
	        if(root.left == null && root.right == null)
	        {
	            road.add(root.val);
	            int total = 0;
	            for(int n : road){
	                total += n;
	            }
	            if(total == sum)
	            path.add(road);
	            return;
	        }
	        if(root.left == null){
	            road.add(root.val);
	            buildPath(path,road,root.right,sum);
	        }
	        if(root.right == null){
	            road.add(root.val);
	          buildPath(path,road,root.left,sum);
	        }
	        if(root.left != null && root.right != null)
	        road.add(root.val);
	        List<Integer> newRoad = new ArrayList<Integer>(road);
	        buildPath(path,road,root.left,sum);
	        buildPath(path,newRoad,root.right,sum);
	        
	    }
	    public static class TreeNode {
	    	     int val;
	    	      TreeNode left;
	    	     TreeNode right;
	    	      TreeNode(int x) { val = x; }
	    	  }
	    public static void main(String[] args){
	    	TreeNode a = new TreeNode(1);
	    	TreeNode b = new TreeNode(2);
	    	a.left = b;
	    	pathSum(a, 0);
	    }
}
