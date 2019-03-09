package 斐波那契数列;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		if(N <= 0) {
            scanner.close();
			return;	
		}
		int[] array = new int[N];
		array[0] = 1;
		array[1] = 1;
		for(int i = 2; i < N;i++)
			array[i] = array[i - 1] + array[i - 2];
		for(int i = 0 ; i < N;i++)
			System.out.print(array[i] + " ");
		scanner.close();
		

	}

}
