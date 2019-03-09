package x的平方根;
/*
 *  牛顿迭代法求平方根
 *  public static int mySqrt(int x) {
    	double k=1.0; 
        while(Math.abs(k*k-x)>1e-9) { 
            k=(k+x/k)/2; 
        } 
        return (int) k; 
    }
 * */
public class Main {

	public static void main(String[] args) {
          System.out.println(mySqrt(8));
	}
    public static int mySqrt(int x) {
    	double k=1.0; 
        while(Math.abs(k*k-x)>1e-9) { 
            k=(k+x/k)/2; 
        } 
        return (int) k; 
    }

}
