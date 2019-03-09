/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
   设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
   注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）
   
   思路：其实就是前后正数叠加，负数不卖
 * @author young
 *
 */
public class Main {

	public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5};
        System.out.println("max = " + maxProfit(array));
	}
	public static int maxProfit(int[] prices) {
		if(prices.length == 1 || prices.length == 0)
			return 0;
		int result = 0;
		for(int j = 1,i = 0; j < prices.length;j++,i++) {
			int profile = prices[j] - prices[i];
			if(profile > 0) {
				result += profile;
			}
				
			
		}
		return result;
	}

}
