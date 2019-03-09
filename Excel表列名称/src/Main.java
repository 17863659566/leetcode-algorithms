/*
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称。

例如，

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
    ...
 */
public class Main {

	public static void main(String[] args) {
		System.out.println(convertToTitle(1));
		/*System.out.println(2600 / 27);
		System.out.println(2600 % 27);
		System.out.println('U' - 'A');*/
	}
	/*
	 * 应该不断的除26，如果得到的除数，但是好像只能用0~25来表示A～Z
	 */
	public static String convertToTitle(int n) {
		if(n <= 0)
			return null;
		StringBuffer buffer = new StringBuffer();
		while(n > 0 ) {
            n--;  //这里搞不明白
			buffer.append((char)(n % 26 + 'A'));
			n /= 26;
		}
	        return buffer.reverse().toString();
	}

}
