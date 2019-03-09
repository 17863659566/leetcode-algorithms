package 买卖股票的最佳时机;
/*
 *  最终归结到求最大值，利润 = 卖出的价格 - 买入的价格
 * */
public class Main {

	public static void main(String[] args) {
       int[] array = new int[] {1,2,3,4,5};
       System.out.println("max = " + maxProfit(array));
	}
	 public static int maxProfit(int[] prices) {
		 if(prices.length == 1 || prices.length == 0)
			 return 0;
		 int max = -1;
	     for(int i = 0;i < prices.length;i++) {
	    	 for(int j = i+1; j < prices.length;j++) {
	    		 int k = prices[j] - prices[i];
	    		 if( k > 0 && max < k)
	    			 max = k;
	    	 }
	     }
	     if(max > 0)
	    	 return max;
	     else
		     return 0;   
	 }

}
