package leetcode;
import java.util.*;
public class MergeKLists {
	public static ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        if(lists.length == 1) return lists[0];
        ArrayList<ListNode> _listNode = new ArrayList<ListNode>();
        for(int i = 0; i< lists.length; i++){
            if(lists[i] != null) 
            _listNode.add(lists[i]);
        }
        if(_listNode.size() == 0) return null;
        if(_listNode.size() == 1) return _listNode.get(0);
        ListNode[] newLists = new ListNode[_listNode.size()];
        for(int j = 0; j < _listNode.size(); j++){
            newLists[j] = _listNode.get(j);
        }
        Arrays.sort(newLists);
        for(int i = 1; i < newLists.length; i++){
            mergeTwoLists(newLists[0], newLists[i]);
        }
        ListNode newNode = newLists[0];
        return newNode;
    }
   
    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        if(l1 == null) {
            l1 = l2;
            return l1;}
            
        if(l2 == null) return l1;
        ListNode first = l1;
        ListNode second = l2;
        ListNode first_front = l1;
        if(l1.val > l2.val){
        ListNode _second = second;
            second = second.next;
            _second.next = first;
            first_front = _second;
            l1 = _second;
        }
      
        else{
            
           first_front = first;
        first = first.next;}
        while(first != null || second != null){
            if(first == null) {
                first_front.next = second;
                return l1;}
            if(second == null) return l1;
            if(first.val < second.val)
            {   first_front = first;
                first = first.next;
            }
            else{
            ListNode cmp = second.next;
                second.next = first;
                first_front.next = second;
                first_front = second;
                second = cmp;
            }
        }
        return l1;
    }
    public static class ListNode implements Comparable<ListNode>{
    	      int val;
    	     ListNode next;
    	      ListNode(int x) { val = x; }
    	   public int compareTo(ListNode that){
    	                
    			    	  if(this.val > that.val) return +1;
    			    	  if(this.val < that.val) return -1;
    			    	  return 0;
    			      }
    	  }
    
    public static void main(String[] args){
    	ListNode[] a = new ListNode[3];
    	a[0] = new ListNode(1);
    	a[1] = new ListNode(0);
    	a[2] = new ListNode(2);
    //	ListNode c = mergeKLists(a);
    	System.out.println(mergeKLists(a).next.next.val);
    	
    }
}
