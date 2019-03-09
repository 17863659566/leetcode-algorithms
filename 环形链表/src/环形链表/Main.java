package 环形链表;

import java.util.ArrayList;

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
	/*
	 * 将所遍历过的指针内容存入到List，使用List.contains()函数来判定是否存在环
	 */
	public boolean hasCycle(ListNode head) {
		ArrayList<ListNode> list = new ArrayList<>();
		ListNode p = head;
		while(!list.contains(p) && p != null) {
			list.add(p);
			p = p.next;	
		}
		if(p == null)
			return false;
	    return true;
	}

}
