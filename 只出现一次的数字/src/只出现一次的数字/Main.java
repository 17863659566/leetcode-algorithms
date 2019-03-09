package 只出现一次的数字;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 */
public class Main {

	public static void main(String[] args) {
		System.out.println(singleNumber(new int[]{1}));
	}
    public static int singleNumber(int[] nums) {
    	if(nums.length == 1)
    		return nums[0];
    	 ArrayList<Integer> list = new ArrayList<>();
         for(int i = 0; i < nums.length;i++)
        	 list.add(nums[i]);
         Collections.sort(list);
         int i = 0;
        
         for(int j = 1; j < list.size();) {
        	 int tmp = list.get(i);
        	 if(tmp == list.get(j)) {
        		 j+=2;
        		 i+=2;
        	 }
        	 else
        		 break;
        		 
         }
         return list.get(i);
        	 
	}

    
}
