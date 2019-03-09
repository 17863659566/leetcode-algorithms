
public class Main {

	public static void main(String[] args) {
         System.out.println(titleToNumber("CUZ"));
	}
    public static int titleToNumber(String s) {
    	if(s == null || s.length() == 0)
    		return 0;
        char[] cs = s.toUpperCase().toCharArray();
        int result = 0;
        int k = 0;
        for(int i = cs.length - 1;i >= 0;i--) {
        	result += (cs[i] - 'A'+1) * Math.pow(26, k++);
        }
        
        return result;
    }

}
