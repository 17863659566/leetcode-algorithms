package 二叉搜索树的最近公共祖先;
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class Main {

	public static void main(String[] args) {

	}
	//假设p,q都已经在root里了，否则还不能这么写
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	if(root == null || (root.left == null && root.right == null))
    		return root;
    	if(hasNode(root.left,p) && hasNode(root.left,q)) //p,q都在左子树中
    		return lowestCommonAncestor(root.left, p, q);
    	if(hasNode(root.right, p) && hasNode(root.right, q)) //p,q都在右子树中
    		return lowestCommonAncestor(root.right, p, q);
    	return root; //p,q一个在左子树中，一个在右子树中
    }

	private boolean hasNode(TreeNode root, TreeNode p) {
		if(root == null)
			return false;
		if(root == p)
			return true;
		return hasNode(root.left,p) || hasNode(root.right, p);
	}

}
