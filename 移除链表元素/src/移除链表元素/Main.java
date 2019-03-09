package 移除链表元素;
class ListNode {
 int val;
 ListNode next;
 ListNode(int x) { val = x; }
 }
/*
 * 对于数组的两组操作（使用双指针操作）
 * 	1. 删除重复元素
 *      1. 如果数组只有一个元素或者没有元素，可以直接返回
 *      2. 设置指针i，j分别指向第一个位置和第二个位置
 *      3. 如果i和j元素相同则j++
 *      4. 否则就将j元素的位置赋值给i++所在位置的元素
 *  2. 删除指定元素
 *      1. 如果数组根本没有元素，可以直接返回
 *      2. 否则设置i，j指针指向第一个位置的元素
 *      3. 如果j指向的元素不等于指定元素，则i++,j++ && nums[i] = nums[j]
 *      4. 否则j++
 */
public class Main {

	public static void main(String[] args) {

	}
	public ListNode removeElements(ListNode head, int val) {
		if(head == null)
			return null;
		ListNode p = new ListNode(0);
		ListNode k = p;
		p.next = head;
		while(p != null) {
			if(p.next != null && p.next.val == val)
				p.next = p.next.next;
			else
			    p = p.next;
		}
	        return k.next;
	}

}
