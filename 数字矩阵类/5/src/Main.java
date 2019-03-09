import java.util.Scanner;

/**
 * 层叠矩阵
 * 对于数字图形的打印，千万不要想着直接去打印，一般是打不出来的，要想着用数组去做
 * @author young
 *
 */
public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rank = scanner.nextInt();
		scanner.close();
		int value = 1;
		int[][] array = new int[rank + 1][rank + 1];
		for(int column = 1; column <= rank;column++) {
			int row1 = 0;
			int column1 = column - 1;
		    //行增
			for(int row = 1; row <= column;row++) {
				row1 = row;
				array[row][column] = value;
				value++;
			}
			//列减
			for(;column1 > 0;column1--) {
				array[row1][column1] = value;
				value++;
			}
			
		}
		for(int i = 1; i <= rank;i++) {
			for(int j = 1; j <= rank;j++) {
				System.out.print(array[i][j] + "  ");
			}
			System.out.println();
		}
			
		
	}
}
