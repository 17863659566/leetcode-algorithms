package 二进制加法;

public class Main {

	public static void main(String[] args) {
		System.out.println(addBinary("1010","1011"));

	}
	 public static String addBinary(String a, String b) {
		 StringBuffer buffer = new StringBuffer();
		 int al = a.length();
		 int bl = b.length();
		 int carry = 0;
		 while(al > 0 || bl > 0) {
			
			 int ac = al > 0 ? a.charAt(--al) - '0' : 0;
			 int bc = bl > 0 ? b.charAt(--bl) - '0' : 0;
			 buffer.insert(0, (ac + bc + carry) % 2);
			 if((ac + bc + carry) >= 2)
				 carry = 1;
			 else
				 carry = 0;
		 }
		 if(carry == 1)
			 buffer.insert(0, carry);
		 return buffer.toString();
	 }

}
