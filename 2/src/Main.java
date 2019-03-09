import java.util.Scanner;

/*
 * 思想比较简单，就是根据所给公式计算结果
 * 迭代法求 a 的平方根的值 公式为:x[n+1]=(x[n]+a/x[n])/2;
 * 迭代法：就是不断根据公式，不断的接近最终结果，像这个代码
 *          int x1 = a / 3;
			int x2 = (x1 + a / x1) / 2;
			while(Math.abs(x2 - x1) >= 1e-5) {
				x1 = x2;
				x2 = (x1 + a / x1) / 2;
			}
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		scanner.close();
		double k = 1.0;
		while(Math.abs(k * k - a) >= 1e-5) {
			k = (k + a / k) / 2;
		}
		System.out.println(x2);
		

	}

}
