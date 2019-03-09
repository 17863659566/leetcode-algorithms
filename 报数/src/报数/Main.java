package 报数;
/*
 * 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
	1.     1
	2.     11
	3.     21
	4.     1211
	5.     111221
	1 被读作  "one 1"  ("一个一") , 即 11。
	11 被读作 "two 1s" ("两个一"）, 即 21。
	21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
	
	给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
	
	注意：整数顺序将表示为一个字符串。
	
    解题办法在：第一个数据的报数序列是第二个数据的输出值，第二个数据的报数序列是第三个数据的输出值
 */
public class Main {

	public static void main(String[] args) {
		System.out.println(countAndSay(11));
	}
	
	public static String countAndSay(int n) {
		String result = "1";
		for(int i = 1;i < n;i++)
			result = calculate(result);
		return String.valueOf(result);
		
		
    }

	private static String calculate(String n) {
		char[] cs = n.toCharArray();
		StringBuffer buffer = new StringBuffer();
		int count = 0;
		for(int i = 0; i < cs.length;i+=count) {
			count = 0;
			int tmp = i;
			for(int j = i;j < cs.length;j++) {
				if(cs[j] == cs[i]) {
					count++;
				}else
					break;
			}
			buffer.append(count);
			buffer.append(cs[tmp]);
			
		}
	        return buffer.toString();
	}

}
