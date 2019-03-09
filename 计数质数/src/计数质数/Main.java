package 计数质数;

/*
 * 计算质数的过程所使用的方法在计算因数的时候也类似
 * 计算因数的过程是：如果能除开则加2，因为在根号n左边和右边分别有一个，最后再判断一次，i * i 是否等于n，如果相等再加1
 */
public class Main {

	public static void main(String[] args) {
		System.out.println(countPrimes(3));
	}
    public static int countPrimes(int n) {
    	int count = 0;
        for(int i = 2;i < n;i++) {
        	if(isPrime(i))
        		count++;
        }
    	return count;
    }
	private static boolean isPrime(int num) {
		for(int i = 2; i * i<= num;i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}

}
