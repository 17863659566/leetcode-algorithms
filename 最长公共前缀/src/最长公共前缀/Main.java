package 最长公共前缀;

public class Main {

	public static void main(String[] args) {
		String[] strs = {""};
		System.out.println(longestCommonPrefix(strs));
	}
	public static String longestCommonPrefix(String[] strs) {
		 int k = 1;
		  if(strs == null || strs.length == 0)
			  return "";
	     
		  for(int i = 0; i <strs[0].length();i++) {
			  String str = strs[0].substring(0, k);
			  int m = 0;
			  for(int j  = 1;j < strs.length;j++) {
				 if(strs[j].startsWith(str)) {
					 m++;
				 }
			  }
			  
			  if(m != strs.length - 1)
				  break;
			  else
				  k++;
		  }
	        if( k == 0)
	            return "";
	        else
	        
		        return strs[0].substring(0, k-1);
	}
}
