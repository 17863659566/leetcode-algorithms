import java.util.Scanner;
//求 m 与 n 之间的所有能够被 3 整除,且至少有一位数字为 5 的整数,例如 15,51,513 均符合
public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        char[] array;
        for(int i = m; i <= n;i++) {
        	if(i % 3 == 0) {
        	   array = String.valueOf(i).toCharArray();	
        	   for(int j = 0; j < array.length;j++) {
        		   if(array[j] == '5')
        			   System.out.println(i);
        	   }
        	}
        }
      
	}

}
