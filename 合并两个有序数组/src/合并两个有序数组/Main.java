package 合并两个有序数组;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		merge(new int[] {1,0,0,0,0,0,0,0,0,0},1,new int[] {1},1);
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
	      ArrayList<Integer> list = new ArrayList<>();
	      for(int i = 0 ; i < m;i ++)
	    	  list.add(nums1[i]);
	      for(int i = 0 ; i < n;i++) {
	    	  list.add(nums2[i]);
	      }
	      list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
	      for(int i = 0; i < list.size();i++) {
	    	  nums1[i] = list.get(i);
	      }
	      
	}
}
