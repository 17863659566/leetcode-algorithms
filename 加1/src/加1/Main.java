package 加1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int[] array = plusOne(new int[] {8,9,9});
		for(int i = 0 ; i < array.length; i++)
			System.out.println(array[i]);

	}
	/*
	 * 主要思想：
	 *  直接模拟加法的计算顺序就好，使用k来标记是不是需要进位，并把k加在前一位上
	 */
	 public static int[] plusOne(int[] digits) {
		if(digits.length == 0)
			return new int[] {1};
		ArrayList<Integer> list = new ArrayList<>();
		int k = 0;
		if(digits[digits.length - 1] + 1 >= 10)
			k = 1;
		list.add((digits[digits.length - 1] + 1) % 10);
		for(int i = digits.length - 2; i >= 0;i--) {
			list.add(0, (digits[i] + k)%10);
			if((digits[i] + k) >= 10)
				k = 1;
			else
				k = 0;
		}
		if(k == 1)
			list.add(0,1);
		int[] array = new int[list.size()];
		for(int i = 0; i < list.size();i++)
			array[i] = list.get(i);
        return array;
	 }

}
