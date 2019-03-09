package strStr;

public class Main {

	public static void main(String[] args) {
		System.out.println(strStr("aaaa", ""));

	}
    public static int strStr(String haystack, String needle) {
    	if(haystack == null || needle == null)
    		return -1;
        return haystack.indexOf(needle);
    }

}
