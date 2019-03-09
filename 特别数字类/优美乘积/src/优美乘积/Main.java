package 优美乘积;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int a = 26;
		int b = 4987;
		int c = a+b;
       if(!CharEqual(a,b,c))
    	   System.out.println("是优美乘积");
       else
    	   System.out.println("不是优美乘积");
	}

	private static boolean CharEqual(int a, int b, int c) {
		ArrayList<Character> list = new ArrayList<>();
		char[] aA = String.valueOf(a).toCharArray();
		for(int i = 0; i < aA.length;i++) {
			if(!list.contains(aA[i]))
				list.add(aA[i]);
			else
				return true;
			
		}
		char[] bA = String.valueOf(b).toCharArray();
		for(int i = 0; i < bA.length;i++) {
			if(!list.contains(bA[i]))
				list.add(bA[i]);
			else
				return true;
			
		}
		char[] cA = String.valueOf(c).toCharArray();
		for(int i = 0; i < cA.length;i++) {
			if(!list.contains(cA[i]))
				list.add(cA[i]);
			else
				return true;
			
		}
			
		return false;
	}

}
