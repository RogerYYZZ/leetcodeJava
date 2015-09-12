package leetcode;
import java.util.*;
public class ReverseLink {
	public static ListNode reverseBetween(ListNode head, int m, int n) {
	   
	    if(head == null) return null;
	     if(head.next == null || n == 1 || m == n) return head;
	    ListNode p = head;
	  //  ListNode a = null;
	  ArrayList<ListNode> returnNode = new ArrayList<ListNode>();
	    if(m == 1){
	   
	   ListNode newNode = reverse(returnNode, head, null, 0, n).get(0);
	        head.next = reverse(returnNode, head, null, 0, n).get(1);
	        return newNode;
	    }
	    int count  = 1;
	    while(count < m-1){
	        p = p.next;
	        count++;
	    }
	    ListNode t = p.next;
	    p.next = reverse(returnNode, p.next, null,count, n).get(0);
	    t.next = reverse(returnNode, p.next, null,count, n).get(1);
	    return head;
	    
	    }
	    
	    private static ArrayList<ListNode> reverse(ArrayList<ListNode> returnNode, ListNode s, ListNode newhead, int count, int n){
	        if(count == n)
	        {   
	           returnNode.add(newhead);
	           returnNode.add(s);
	            return returnNode;
	        }
	        
	        ListNode temp = s.next;
	        s.next = newhead;
	        count++;
	        return reverse(returnNode,temp, s, count, n);
	        
	    }
		    public static class ListNode {
		    	      int val;
		    	      ListNode next;
		    	     ListNode(int x) { val = x; }
		    	  }
		    public static void main(String[] args){
		    	ListNode a = new ListNode(3);
		    	ListNode b = new ListNode(5);
		    //	ListNode c = new ListNode(2);
		    //	ListNode d = new ListNode(4);
		    	a.next = b;
		    //	b.next = c;
		    //	c.next = d;
		    	reverseBetween(a,1,2);
		    }
}
