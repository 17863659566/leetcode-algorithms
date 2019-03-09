package 最大子序和;
/*
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 根据题意：nums最起码长度会大于等于1，所以不用担心会不会出现空指针的问题
 * 大体思路是：首先比较出1位数的最大值，然后是2位数，直到nums.length都加起来的最大值
 */
public class Main {

	public static void main(String[] args) {
		int[] array = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(array));
       
	}
    public static int maxSubArray(int[] nums) {
    	int max = nums[0];
    	int k=0;
    	for(int i = 0; i < nums.length - k;i++) {
    		int thisMax = 0;
    		for(int j = i; j < nums.length;j++) {
    			thisMax += nums[j];
    			if(max < thisMax)
    				max = thisMax;
    		}
    		
    	}
    	
    	
    	return max;
    }

}
