/*
 * 求π的近似值 公式为
           π/2=2/1*2/3*4/3*4/5....*2n/(2n-1)*2n/(2n+1)
 */
public class Main {

	public static void main(String[] args) {
		int result = 1;
		int tmp;
		for(int i = 1; i < 100; i++) {
			tmp = (2 * i) / (2 * i - 1) * (2 * i) / (2 * i + 1);
			result *= tmp;
		}
		System.out.println("π≈" + result * 2);

	}

}
