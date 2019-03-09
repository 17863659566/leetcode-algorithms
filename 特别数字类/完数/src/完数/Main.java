package 完数;

import java.util.ArrayList;
import java.util.List;
/*
 * 完数：某自然数除了它本身以外的所有因子之和等于该数，则该数为完数
 * 注意：1不是完数，因为定义要除了它本身的所有因子之和等于它本身，而1除了它本身就没有了也就是0，所以不是
 * 关键：求出所有的约数，使用[查出所有约数](https://www.jianshu.com/p/0c113518fd03)
 * 
 * */
public class Main {

	public static void main(String[] args) {
		List<Integer> list ;
		int[] array = new int[10000];
		int k = 0;
		for(int num = 2; num < 10000;num++) {
			list = yueshu(num);
			int result = 0;
			for(int i : list) {
				result += i;
			}
			
			if(result == num)
				array[k++] = num;
			list.clear();
			
		}
		for(int i = 0;i < k;i++)
			System.out.print(array[i] + " ");
		
	}

	private static List<Integer> yueshu(int num) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
        for(int i = 2; i < Math.sqrt(num);i++) {
        	if(num % i == 0) {
        		list.add(i);
        		list.add(num / i);
        	}
        }
		return list;		
	}

}
