package 验证回文串;

public class Main {

	public static void main(String[] args) {
			if(isPalindrome("race a car"))
				System.out.println("是回文串");
			else
				System.out.println("不是回文串");
	}
	public static boolean isPalindrome(String s) {
	   //去掉字符串间的空格，然后转换成数组，进行一次头尾遍历，即可得到结果
		if(s == null)
			return false;
		char[] cs = s.replaceAll("\\W", "").toUpperCase().toCharArray();
		int i = 0;
		int j = cs.length - 1;
		while(i < j) {
			if(cs[i] != cs[j])
				return false;
			i++;
			j--;
		}
		return true;        
	}

}
