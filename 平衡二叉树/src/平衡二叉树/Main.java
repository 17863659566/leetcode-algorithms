package 平衡二叉树;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}

public class Main {

	public static void main(String[] args) {

	}
	/*
	 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
	 */
    public boolean isBalanced(TreeNode root) {
        if(root == null)
        	return true;
       int leftHeight = getHeight(root.left);
       int rightHeight = getHeight(root.right);
       if(Math.abs(leftHeight - rightHeight) >= 2)
    	   return false;
       else
    	   return isBalanced(root.left) && isBalanced(root.right);
    }
	private int getHeight(TreeNode root) {
		if(root == null)
			return 0;
		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);
		if(leftHeight >= rightHeight)
			return leftHeight + 1;
		else
			return rightHeight + 1;
	}

}
