/*
 * 用二分法求方程的根,2*x3-4*x2+3*x-6=0 在(-10,10)之间的根
 * 使用的定理为零点定理
 *     如果f(a) * f(b) < 0 则root 属于(a,b)
 *     如果f(a) * f((a+b)/2) > 0 则root 属于 ((a+b)/2 , b)
 *     如果f((a+b) / 2) * f(b) > 0 则 root 属于 (a,(a+b)/2)
 */
public class Main {

	public static void main(String[] args) {
		System.out.println(getResult(-10,10));
	}
	
	static double getResult(double a, double b) {
		double i = (a + b) / 2;
		if(Math.abs(b - a) <= 1e-5)
			return i;

	}
	static double f(double x) {
		return 2*Math.pow(x,3)-4*Math.pow(x,2)+3*x-6;
	}

}
