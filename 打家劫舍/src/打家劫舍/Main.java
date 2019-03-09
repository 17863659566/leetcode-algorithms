package 打家劫舍;


public class Main {

	public static void main(String[] args) {
		int[] rooms = new int[] {41,2,3,43,2,4,3};
		System.out.println(rob(rooms));
	}
    public static int rob(int[] nums) {
    	if(nums == null || nums.length == 0)
    		return 0;
    	int[] opt = new int[nums.length];
    	int i = 0;
    	for(; i < nums.length;i++) {
    		if(i == 0)
    			opt[0] = Math.max(0, nums[0]);
    		if(i == 1)
    			opt[1] = Math.max(nums[1], opt[0]);
    		if(i >= 2)
    			opt[i] = Math.max(nums[i]+opt[i-2], opt[i-1]);
    	}
        
    	return opt[i-1];
    }

}
