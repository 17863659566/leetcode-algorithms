import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
  }
public class Main {

}
class Solution{

	    public List<List<Integer>> levelOrderBottom(TreeNode root) {
	            LinkedList<TreeNode> list = new LinkedList<TreeNode>();
	             List<List<Integer>> resultList = new ArrayList<>();
	             if(root == null)
	                return resultList;
	             list.add(root);
	             TreeNode nLast = null;
	             TreeNode last = root;
	             ArrayList<Integer> tmp = new ArrayList<>();

	             while(list.size() > 0) {
	                TreeNode node = list.poll();
	                 tmp.add(node.val);
	                 

	                if(node.left != null) {

	                    list.add(node.left);
	                    nLast = node.left;
	                }
	                if(node.right != null) {
	                    list.add(node.right);
	                    nLast = node.right;
	                }

	                if(node == last) {
	                     resultList.add(0,tmp);
	                     tmp = new ArrayList<>();
	                     last = nLast;
	                 }
	             }
	             return resultList;
	    }
	}
