import java.util.ArrayList;
import java.util.Scanner;

/*
 * n=5 时,输出
	25 16 9 4 1
	16 9 4 1 25
	9 4 1 25 16
	4 1 25 16 9
	1 25 16 9 4
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rank = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = rank; i > 0;i--)
			list.add(i);
		for(int i = 0; i < rank;i++) {
			for(int j : list)
				System.out.print(j * j + "  ");
			System.out.println();
			int number = list.get(0);
			list.remove(0);
			list.add(number);
			
		}

	}

}
