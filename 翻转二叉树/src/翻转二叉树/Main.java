package 翻转二叉树;
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}
public class Main {

	public static void main(String[] args) {

	}
    public TreeNode invertTree(TreeNode root) {
    	if(root == null || (root.left == null && root.right == null))
			return root;
		TreeNode k = root.left;
		root.left = root.right;
		root.right = k;
		invertTree(root.left);
		invertTree(root.right);
		return root;
    }
}
