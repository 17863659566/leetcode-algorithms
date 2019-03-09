package 删除排序链表中的重复元素;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
	}
public class Main {

	public static void main(String[] args) {

	}
	
	/*
	 * 
	 * */
	public ListNode deleteDuplicates(ListNode head) {
	    ListNode first = head;  
	    ListNode second = first.next;

	    while(second != null) {
	    	if(second.val != first.val) {
	    		first = first.next;
	    		first.val = second.val;
	    	}
	    	second = second.next;
	    }
	    first.next = null;
	    return head;
	}

}
