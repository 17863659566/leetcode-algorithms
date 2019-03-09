package 求众数;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
			int[] array = new int[] {3,2,3};
			System.out.println(majorityElement(array));
	}
	
	/*
	 * 首先请考虑最基本的摩尔投票问题，找出一组数字序列中出现次数大于总数1/2的数字（并且假设这个数字一定存在）。
	 * 显然这个数字只可能有一个。摩尔投票算法是基于这个事实：每次从序列里选择两个不相同的数字删除掉（或称为“抵消”），
	 * 最后剩下一个数字或几个相同的数字，就是出现次数大于总数一半的那个。
	 */
	 public static int majorityElement(int[] nums) {
		 ArrayList<Integer> list = new ArrayList<>();
		 list.add(nums[0]);
		 for(int i = 1;i < nums.length;i++) {
			 if(list.contains(nums[i])) {
				 list.remove(new Integer(nums[i]));
			 }else
				 list.add(nums[i]);
		 }
		 return list.get(0);
	 }
	/*
    public static int majorityElement(int[] nums) {
	      Map<Integer,Integer> map =  new HashMap<>(); 
	      for(int i = 0; i < nums.length;i++) {
	    	  if(map.containsKey(nums[i])) {
	    		  Integer integer = map.get(nums[i]);
	    		  map.replace(nums[i], integer+1);
	    	  }else
	    	    map.put(nums[i], 1);
	      }
	      System.out.println(map.size());
	      Integer max = Collections.max(map.values());
	      Iterator<Entry<Integer, Integer>> iterator = map.entrySet().iterator();
	      while(iterator.hasNext()) {
	    	  Entry<Integer, Integer> e = iterator.next();
	    	  if(e.getValue() == max)
	    		  return e.getKey();
	      }
	      return 0;
	}
*/
}
