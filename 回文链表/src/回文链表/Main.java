package 回文链表;

import java.util.ArrayList;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
	}
public class Main {

	public static void main(String[] args) {

	}
    public boolean isPalindrome(ListNode head) {
       if(head == null)
    	   return true;
       ListNode p1 = new ListNode(0); //逆置链表
       p1.next = null;
       ListNode p2 = head;  //原链表
       while(p2 != null) {
    	  ListNode tmp = new ListNode(p2.val);
    	  tmp.next = p1.next;
    	  p1.next = tmp;
    	  p2 = p2.next;
    	   
       }
       p1 = p1.next;
       p2 = head;
       while(p1 != null && p2 != null) {
    	   if(p1.val != p2.val)
    		   return false;
    	   p1 = p1.next;
    	   p2 = p2.next;
       }
       if(p1 == null && p2 == null)
    	   return true;
       return false;
    }
    

}
