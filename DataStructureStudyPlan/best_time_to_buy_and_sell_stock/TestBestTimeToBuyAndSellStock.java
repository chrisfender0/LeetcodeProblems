package best_time_to_buy_and_sell_stock;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBestTimeToBuyAndSellStock {

	@Test
	void test1() {
		int[] prices = {7, 1, 5, 3, 6, 4};
		int output = 5;
		assertEquals(output, BestTimeToBuyAndSellStock.maxProfit(prices));
	}
	
	@Test
	void test2() {
		int[] prices = {7, 6, 4, 3, 1};
		int output = 0;
		assertEquals(output, BestTimeToBuyAndSellStock.maxProfit(prices));
	}

}
