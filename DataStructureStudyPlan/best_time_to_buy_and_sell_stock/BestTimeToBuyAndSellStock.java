package best_time_to_buy_and_sell_stock;

public class BestTimeToBuyAndSellStock {

	public static int maxProfit(int[] prices) {
		int lowestPrice = Integer.MAX_VALUE;
		int difference = 0;
		int output = 0;
		
		for(int i=0; i<prices.length; i++ ) {
			//set the lowest prices
			if(prices[i] < lowestPrice) {
				lowestPrice = prices[i];
			}
			//calculate the difference 
			difference = prices[i] - lowestPrice;
			if(output < difference) { 
				output = difference;
			}
		}
		return output;
	}

}
