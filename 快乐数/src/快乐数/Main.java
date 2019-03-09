package 快乐数;

public class Main {

	public static void main(String[] args) {
		

	}
    public boolean isHappy(int n) {
        int count = String.valueOf(Integer.MAX_VALUE).length();
        while(n != 1 && count > 0) {
        	int k = n;
            int result = 0;
        	while(k != 0) {
        		int tmp = k % 10;
        		k /= 10;
        		result += tmp * tmp;
        	}
        	n = result;
        	count--;
        }
        
        if(n != 1 && count == 0)
        	return false;
        else
        	return true;
    }
}
