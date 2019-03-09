package 路径总和;
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
 }
public class Main {
	int count = 0;
	public static void main(String[] args) {

	}
	/*
	 * 对于树的各种遍历，如果要使用局部变量，那返回值一定是可拼接，如可加，否则是不能用的，
	 * 如果返回值类似这种boolean，而且要求数字计算的，最好使用参数传递，使用递归会重复修改这个参数，直到达到要求
	 */
	public boolean hasPathSum(TreeNode root, int sum) {
	 if(root == null)
		 return false;
	 sum -= root.val;
	 if(root.left == null && root.right == null)
		if(sum == 0)
			return true;
	 
	return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
	  
		  
	}

}
