package 将有序数组转换为二叉搜索树;
/*
 * 使用有序数组创建平衡二叉树，只要每次从中间分割，分为lr,rr |lr - rr| <= 1,就会满足题意
 */
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
    TreeNode(int x) { val = x; }
 }
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public TreeNode sortedArrayToBST(int[] nums) {
	    if(nums == null || nums.length == 0)
	    		return null;
	        return build(nums,0,nums.length-1) ;
	    }
		private TreeNode build(int[] nums,int start, int end) {
			if(start > end)
				return null;
			int mid = start + (end - start) / 2;  //注意这里需要加start,
			TreeNode node = new TreeNode(nums[mid]);
			node.left = build(nums,start,mid-1);
			node.right = build(nums,mid+1,end);
			return node;
	    }

}
