package leetcode;

import java.util.*;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode _l1 = l1;
        ListNode _l2=  l2;
        ListNode root = new ListNode(0);
        ListNode head = root;
       while(_l1 != null || _l2 != null){
           int sum = 0;
           ListNode a = null;
           if(_l1 == null || _l2 == null)
           sum = (_l1 == null)?l2.val+carry:l1.val+carry;
           
           if(sum >= 10){
            a = new ListNode(sum-10);
           carry = 1;
           }
           
           else
              a = new ListNode(sum); 
           
           head.next = a;
           head = a;
           
           if(_l1 == null)
           
           _l2 = _l2.next;
           else if(_l2 == null)
           _l1 = _l1.next;
           else{
               _l1 = _l1.next;
               _l2 = _l2.next;
           }
       }
       if(carry == 1){
           ListNode last = new ListNode(1);
           head.next = last;
       }
       
    return root.next;
    }
	
	public static class ListNode  implements Comparable<ListNode> {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		      public int compareTo(ListNode that){
		    	  if (this == null || that == null) return 0;
		    	  if(this.val > that.val) return +1;
		    	  if(this.val < that.val) return -1;
		    	  return 0;
		      }
		  }
	public static void main(String[] args){
		ListNode[] a = new ListNode[3];
		a[0] = null;
		a[1] = new ListNode(2);
		a[2] = new ListNode(1);
		
		System.out.println(a[2].val);
	}
}
