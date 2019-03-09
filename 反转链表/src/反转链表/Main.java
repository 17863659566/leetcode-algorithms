package 反转链表;
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
	}
public class Main {

	public static void main(String[] args) {

	}
    public ListNode reverseList(ListNode head) {
    	if(head == null || head.next.next == null)
    		return head;
    	ListNode p = new ListNode(0);
    	p.next = null;
    	ListNode k = head;
    	ListNode tmp;
    	while(k != null) {
    		tmp = k.next;
    		k.next = p.next;
    		p.next = k;
    		k = tmp;
    	}
    	
        return p.next;
    }
}
