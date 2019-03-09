package 位1的个数;

public class Main {

	public static void main(String[] args) {

	}
    public int hammingWeight(int n) {
        char[] cs = Integer.toBinaryString(n).toCharArray();
        int count = 0;
        for(int i = 0; i < cs.length;i++)
        	if(cs[i] == '1')
        	  count++;
        return count;
    }

}
