/* 1. 什么是幻方
 *   幻方是一种将数字安排在正方形格子中，使每行、每列和对角线上的数字和都相等的方法
 *   生成幻方算法
 *    奇数阶幻方
 *       口诀
 *          1（最小值）居上行正中央
 *          依次歇填切莫忘
 *          上出框界右底行
 *          右出框时左上放
 *          重复便在下格写
 *          出角也在下格写
 *      算法（罗泊算法）
 *        1.将最小值放在array[0][rank/2] 数组表示array[i][j]
 *        2.如果 i < -1 
 *           i = rank-1,j += 1; 
 *          如果 j + 1 == rank   j = 0;
 *          array[i][j] = num, num+=1;
 *          如果 i = 0 && j = rank - 1
 *              i = 1,array[i][j] = num, num+=1; 
 *        
 *    偶阶幻方
 *      一个n阶幻方，当n为偶数时，称此幻方为偶阶幻方
 *      单偶阶幻方
 *        当n不能被4整除时，称为单偶幻方
 *      双偶幻方
 *        当n能被4整除时，称为双偶幻方
 * 
 */
public class Main {

	public static void main(String[] args) {
		int[][] magic = oddMagic(1,5);
		for(int i = 0; i < 5;i++) {
			for(int j = 0; j < 5;j++)
				System.out.print(magic[i][j] + " ");
			System.out.println();
		}
			
	}
	
	static int[][]  oddMagic(int num,int rank) {
		int[][] array = new int[rank][rank];
		int n = rank * rank;
		//用于判断是否有数据
		for(int i = 0; i < rank;i++)
			for(int j = 0;j < rank;j++)
				array[i][j] = -1;
		
		array[0][rank / 2] = num;
		num++;
		int i = 0;
		int j = rank / 2;
		while((--n) > 0) {
			//总体趋势是向右上角跑，然后处理特殊情况
			i--;
			j++;
			if(i == -1) {
				if(j != rank) {
					i = rank - 1;
				}else {
					i+=2;
					j--;
				}
			}else if(j == rank) {
				j = 0;
			}
			if(array[i][j] != -1) {
				i += 2;
				j--;
			}
		
			array[i][j] = num;
			num++;
		}
		return array;
		
	}

}
