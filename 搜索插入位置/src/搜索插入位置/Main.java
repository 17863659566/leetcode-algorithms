package 搜索插入位置;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(searchInsert(new int[] {1,3,5,6},0));
	}
    public static int searchInsert(int[] nums, int target) {
      int i = 0;
      if(nums == null)
    	  return 0;
      for(; i < nums.length;i++) {
    	  if(target <= nums[i])
    		  break; 
      }
      return i;
    }

}
