package com.zh;


/*
 * 1       2       3          4
 * L E E T C O D E I S  H  I  R  I  N  G     numRows = 3
 * 1           2              3
 * L E E T C O D E I S  H  I  R  I  N  G     numRows = 4
 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * */
public class Main {
      public static void main(String[] args) {
		
	}
      static String convert(String s, int numRows) {
    	  
    	  char[][] array = new char[100][numRows];
    	  int oneNums = numRows - 2;
    	  for(int i = 0; i < s.length();i++)
    		  array[i] = s.substring(i, numRows)
          return null;
      }
}
