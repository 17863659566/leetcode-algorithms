package 旋转数组;
/*
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 */
public class Main {

	public static void main(String[] args) {
		rotate(new int[] {1,2,3,4,5,6},2);
	}
	/*
	 * 其他的方法没弄出来，只有0~n-1后移，然后把第n个值赋给第1个
	 */
	public static void rotate(int[] nums, int k) {
	  if(nums.length <= 1)
			return;
	  while(k > 0) {
		  k--;
		  int tmp = nums[nums.length - 1];
		  for(int i = nums.length - 2;i>=0;i--) {
			  nums[i + 1] = nums[i];
		  }
		  nums[0] = tmp;
		  
	  }
	}

}
