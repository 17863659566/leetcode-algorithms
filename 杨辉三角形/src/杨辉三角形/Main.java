package 杨辉三角形;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		generate(5);

	}
	public static List<List<Integer>> generate(int numRows) {
	     List<List<Integer>> list = new ArrayList<>();
	     for(int i = 0;i < numRows;i++) {
	    	 List<Integer> tmp = new ArrayList<>();
	    	 tmp.add(1);
	    	 for(int j = 2; j <= i;j++) {
	    		 List<Integer> list2 = list.get(i - 1);
	    		 tmp.add(list2.get(j - 1) + list2.get(j - 2));
	    	 }
	    	 if(i != 0)
	    		 tmp.add(1);
	    	 list.add(tmp);
	    	 }
	     return list;
	}
	

}
