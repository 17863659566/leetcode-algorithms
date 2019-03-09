package 颠倒二进制位;

public class Main {

	public static void main(String[] args) {
		reverseBits(-3);
	}
	 public static int reverseBits(int n) {
	    String string = Integer.toBinaryString(n);
	    StringBuffer buffer = new StringBuffer();
	    for(int i = 0; i < 32 - string.length();i++) {
	        buffer.insert(0, "0");
	    }
	    buffer.append(string);
	    StringBuffer buffer2 = buffer.reverse();
	    Long l = Long.valueOf(buffer2.toString(),2);
	    return l.intValue();
	}

}
