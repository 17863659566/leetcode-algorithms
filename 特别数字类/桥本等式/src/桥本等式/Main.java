package 桥本等式;

import java.util.ArrayList;
import java.util.Scanner;

class fenshi{
	int fenzi;
	int fenmu;
}
public class Main {

	public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          fenshi plus_1 = new fenshi();
          fenshi plus_2 = new fenshi();
          fenshi result = new fenshi();
          plus_1.fenzi = scanner.nextInt();
          plus_1.fenmu = scanner.nextInt();
          plus_2.fenzi = scanner.nextInt();
          plus_2.fenmu = scanner.nextInt();
          scanner.close();
          
          boolean flag = true;
          ArrayList<Character> list = new ArrayList<>();
          StringBuilder builder = new StringBuilder();
          builder.append(String.valueOf(plus_1.fenzi));
          builder.append(String.valueOf(plus_1.fenmu));
          builder.append(String.valueOf(plus_2.fenzi));
          builder.append(String.valueOf(plus_2.fenmu));
          char[] array = builder.toString().toCharArray();
          for(int i = 0; i < array.length;i++) {
        	  if(!list.contains(array[i]))
        		  list.add(array[i]);
        	  else {
        		  flag = false;
        		  break;
        	  }
        		  
        	  
        		  
          }
          if(!flag) {
        	  System.out.println("不是桥本等式");
        	  return;
          }
        	 
          builder.delete(0, builder.length());
          int miniMultiple = getMultiple(plus_1.fenmu,plus_2.fenmu);
          plus_1.fenzi *= (miniMultiple / plus_1.fenmu);
          plus_2.fenzi *= (miniMultiple / plus_2.fenmu);
          result.fenzi = plus_1.fenzi + plus_2.fenzi;
          result.fenmu = miniMultiple;
          int maxDivisor = getDivisor(result.fenzi,result.fenmu);
          result.fenzi /= maxDivisor;
          result.fenmu /= maxDivisor;
          builder.append(String.valueOf(result.fenzi));
          builder.append(String.valueOf(result.fenmu));
          char[] array1 = builder.toString().toCharArray();
          for(int i = 0; i < array1.length;i++) {
        	  if(!list.contains(array1[i]))
        		  list.add(array1[i]);
        	  else
        		  flag = false;
        		  
          }
          if(!flag) 
        	  System.out.println("不是桥本等式");
          else
        	  System.out.println("是桥本等式");
          
          
	}

	//求最大公约数
	private static int getDivisor(int num1, int num2) {
		if(num1 < num2) {
			num1 += num2;
			num2 = num1 - num2;
			num1 = num1 - num2;
		}
		int r= num1 % num2;
		while(r != 0) {
			num1 = num2;
			num2 = r;
			r = num1 % num2;
		}
		
		return num2;
	}

	//求最大公倍数
	private static int getMultiple(int num1, int num2) {
		int multiple = getDivisor(num1, num2);
		return num1 * num2 / multiple;
	}

}
