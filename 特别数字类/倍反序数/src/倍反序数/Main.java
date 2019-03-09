package 倍反序数;
//倍反序数(一个数可被其反序数整除,且不相等)
public class Main {

	public static void main(String[] args) {
		int reverse;
        for(int i = 1; i < 1000; i++) {
        	reverse = convertReverse(i);
        	if(i != reverse && i % reverse == 0)
        		System.out.println(i);
        }
		
	}

	private static int convertReverse(int i) {
		StringBuffer buffer = new StringBuffer(String.valueOf(i));
		return Integer.parseInt(buffer.reverse().toString());
	}

}
