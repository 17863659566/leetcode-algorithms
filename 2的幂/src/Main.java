
public class Main {

	public static void main(String[] args) {

	}
    public boolean isPowerOfTwo(int n) {
    	int i = 0;
        while(Math.pow(2, i) < n)
        	i++;
        if(Math.pow(2, i) == n)
        	return true;
        else
        	return false;
    }

}
