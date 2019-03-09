package 最后一个单词的长度;

public class Main {

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord(" "));

	}
	public static int lengthOfLastWord(String s) {
        if(s == null || s.equals(""))
        	return 0;
		String[] strs = s.split(" ");
		if(strs.length == 0)
			return 0;
		else
		return strs[strs.length - 1].length();
    }

}
