package 相交链表;
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
		}
	}
public class Main {

	public static void main(String[] args) {

	}
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	int ALength = getListLength(headA);
    	int BLength = getListLength(headB);
    	int wait = ALength - BLength;
    	if(wait >= 0) {
    		while(wait-- > 0)
    			headA = headA.next;
    	}else {
    		while(wait-- > 0)
    			headB = headB.next;
    	}
    	
    	while(headA != null && headB != null) {
    		if(headA == headB)
    			return headA;
    		headA = headA.next;
    		headB = headB.next;
    	}
    	
		return null;
	        
	    }
	private int getListLength(ListNode head) {
		ListNode p = head;
		int count = 0;
		while(p != null) {
			count += 1;
			p = p.next;
		}
		return count;
	}
}
