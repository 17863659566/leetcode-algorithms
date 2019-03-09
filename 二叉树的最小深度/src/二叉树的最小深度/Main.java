package 二叉树的最小深度;
class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
 }
public class Main {

	public static void main(String[] args) {

	}
	 public int minDepth(TreeNode root) {
		if(root == null)
		       return 0;
		//注意下面两个判断，这是为了解决左斜树和右斜树的问题，这是和求树的最大深度改了之后的区别
        if(root.left == null)
            return  minDepth(root.right) + 1;
        if(root.right == null)
            return minDepth(root.left) + 1;
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        if(leftDepth - rightDepth <= 0)
            return leftDepth + 1;
        else
            return rightDepth + 1;
	 }
}
