/*
 * 设 a、b、c 均是 0 到 9 之间的数字,abc、bcc 是两个三位数,且有:abc+bcc=532。求满
 * 足条件的所有 a、b、c 的值
 * 分析可得a属于[1,4],b属于[1,4],c属于[0,9]三次循环可得结果
 * 
 * */
public class Main {

	public static void main(String[] args) {
         for(int a = 1; a <= 4; a++)
        	 for(int b = 1; b <= 4;b++)
        		 for(int c = 0; c <=9 ;c++) {
        			int num1 = a * 100 + b * 10 + c; //abc
        			int num2 = b * 100 + c * 10 + c;
        			if(num1 + num2 == 532)
        				System.out.println("a = " + a + " b = " + b + " c = " + c);
        		 }
	}

}
