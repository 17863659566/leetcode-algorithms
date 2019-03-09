/*二维数组的鞍点：
 *   设array[i][j]是二维数组的鞍点，则该值一定是i行的最大值，j列的最小值
 */
class Max{
	int value;
	int column;
}
public class Main {

	public static void main(String[] args) {
		int[][] array = {
				{1,2,3,4},
				{2,4,5,6},
				{5,6,7,8},
				{6,7,8,9}
		};
		Max max;
		for(int i = 0; i < array.length;i++) {
			max = new Max();
			max.value = array[i][0];
			//当循环走完，肯定max.value是该行的最大值,column记录的是最大值所在列
			for(int j = 0; j < array[i].length;j++) {
				if(max.value < array[i][j]) {
					max.value = array[i][j];
					max.column = j;
				}
			}
			int min = array[0][max.column];
			//当循环走完，min存储的就是max.column的最小值
			for(int j = 0; j < array.length;j++) {
				if(min > array[j][max.column])
					min = array[j][max.column];
			}
			//如果该行的最大值和该列的最小值相等，那么该值就是鞍点
			if(max.value == min)
				System.out.println(max.value);
		}
			

	}

}
