package 最小公倍数和最大公约数;

import java.util.Scanner;
/*
 * 最大公约数取法
 *    辗转相除法
 *      设a,b(a > b)
 *      1. a % b = q ... r1  若r1 = 0 则b就是最大公约数
 *      2. 否则 a = b, b = r1 得到余数 r1, 若r1 = 0, 则b就是最大公约数
 *      3. 重复进行1.2.直到r2为0，则b就是最大公约数 
 * 最小公倍数
 *      两数之积除以最大公约数
 * */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int k1 = number1;
		int k2 = number2;
		int r1;
		if(number1 < number2) {
			number1 = number1 + number2;
			number2 = number1 - number2;
			number1 = number1 - number2;
		}
		System.out.println("number1 = " + number1 + " number2 = " + number2);
		//得到number1 > number2
		r1 = number1 % number2;
		while(r1 != 0) {
			number1 = number2;
			number2 = r1;
			r1 = number1 % number2;
				
		}
		System.out.println("最大公约数为" + number2);
		System.out.println("最小公倍数为" + k1 * k2 / number2);
		scanner.close();
		

	}

}
