package 梅森素数;

import java.util.ArrayList;
import java.util.List;

/*
 * 梅森素数：
 *   1. 2^p - 1 是素数时，p也是素数，则2^p-1为梅森素数
 *   参考答案有问题
 *  
 * 
 * */
public class Main {

	public static void main(String[] args) {
		List<Integer> primes = generatePrime(10000);
		for(int i = 0; i < primes.size();i++) {
			double result = Math.pow(2, primes.get(i)) - 1;
			if(result % 2 != 0)
				System.out.println(result);
		}

	}

	private static List<Integer> generatePrime(int times) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(2);
		int flag = 0;
		for(int i = 3; i <= times;i++) {
			for(int j = 2;j <= Math.sqrt(i);j++) {
				if(i % j == 0) {
					flag = 1;
					break;
				}
			}
			if(flag == 0)
				arrayList.add(i);
			flag = 0;
			
		}
		return arrayList;
		
	}

}
