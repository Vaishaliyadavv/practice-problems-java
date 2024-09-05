package leetcode150;

public class Problem121 {

    public static void main(String[] args) {
        Problem121 problem121 = new Problem121();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(problem121.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            }

            profit = Math.max(profit, prices[i] - buyPrice);
        }

        return profit;
    }
}
