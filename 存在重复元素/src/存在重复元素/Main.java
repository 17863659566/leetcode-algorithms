package 存在重复元素;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		System.out.println(containsDuplicate(new int[] {1,2,3,1}));
	}
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i < nums.length;i++) {
        	if(map.containsKey(nums[i])) {
        		map.put(nums[i], 2);
        	}else
        	map.put(nums[i], 1);
        }
        
        Iterator<Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
        	Entry<Integer, Integer> entry = iterator.next();
        	if(entry.getValue() >= 2)
        		return true;
        }
        return false;
    }

}
