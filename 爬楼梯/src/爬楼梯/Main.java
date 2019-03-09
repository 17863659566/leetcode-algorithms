package 爬楼梯;
/*
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
   每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class Main {

	public static void main(String[] args) {
		System.out.println(climbStairs(45));
	}
	/*
	 * 爬楼梯算法当只能上一个台阶和两个台阶的时候其实就是一个类斐波那契数列，因为斐波那契数列的第二项为1
	 */
	public static int climbStairs(int n) {
		 int[] array = new int[n];
         if(n <= 2)
            return n;
        array[0] = 1;
        array[1] = 2;
        int i = 2;
        for(;i < n;i++){
            array[i] = array[i - 1] + array[i - 2];
        }
        
        return array[i - 1];
    }

}
