package 水仙花数;

import java.util.Scanner;

//水仙花数：一个三位数，它的每个位上的数字的3次幂之和等于它本身
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int k = number;
		int result  = 0;
		for(int i = 0; i < 3;i++) {
			int tmp = number % 10;
			result += tmp * tmp * tmp;
			number /= 10;
		}
		if(result == k)
			System.out.println(k + "是水仙花数");
		else
			System.out.println(k + "不是水仙花数");
		scanner.close();
		

	}

}
