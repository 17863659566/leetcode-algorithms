package 判断素数;

import java.util.Scanner;
//质数（Prime number），又称素数，指在大于1的自然数中，除了1和该数自身外，无法被其他自然数整除的数
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number == 1) {
			System.out.println("1不是素数");
			scanner.close();
			return;
		}
		if(number == 2) {
			System.out.println(number + "是素数");
			scanner.close();
			return;
		}
		for(int i = 2;i * i < number;i++) {
			if(number % i == 0) {
				System.out.println(number + "不是素数");
				scanner.close();
				return;
			}
		}
		System.out.println(number + "是素数");
		scanner.close();

	}

}
