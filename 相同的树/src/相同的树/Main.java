package 相同的树;

import java.util.ArrayList;

/*
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
   如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
   
   
   思路：树的很多操作都是在建立或者树的遍历过程中完成的，这道题也是一样，可以使用前序遍历，来判断
     1.判断树的节点个数是否相同，如果不同那么肯定两棵树不一样
     2.如果节点个数相同，那就检测根节点是否相同，如果相同，检测左子树是否相同，如果相同则比较又子树
 */

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}

public class Main {

	public static void main(String[] args) {
		

	}
	public  boolean isSameTree(TreeNode p, TreeNode q) {
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		judge(list1, p);
		judge(list2, q);
		if(list1.size() != list2.size())
			return false;
		for(int i = 0; i < list1.size();i++) {
			if(list1.get(i) != list2.get(i))
				return false;
		}
		return true;
	}
	private  void judge(ArrayList<String> list ,TreeNode p) {
		if(p != null) {
			list.add(String.valueOf(p.val));
			judge(list, p.left);
			judge(list, p.right);
		}else
			list.add("n");
			
	}

}
