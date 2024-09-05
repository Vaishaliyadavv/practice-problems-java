package leetcode150;

public class Problem122 {
    public static void main(String[] args) {
        Problem122 problem122 = new Problem122();
        int[] prices = new int[]{1, 2, 3, 4, 5};
        System.out.println(problem122.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = 0;
        int length = prices.length;
        for (int i = 1; i < length; i++) {
            if (buyPrice < prices[i]) {
                maxProfit += prices[i] - buyPrice;
            }
            buyPrice = prices[i];
        }
        return maxProfit;
    }
}
