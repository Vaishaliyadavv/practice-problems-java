package classProblems;

public class Leetcode121 {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }


    public int maxProfit1(int[] prices) {
        int[] left = new int[prices.length];
        int[] right = new int[prices.length];
        left[0] = prices[0];
        right[prices.length - 1] = prices[prices.length - 1];
        for (int i = 1; i < prices.length; i++) {
            left[i] = Math.min(left[i - 1], prices[i]);
        }
        for (int i = prices.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], prices[i]);
        }
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            max = Math.max(max, right[i] - left[i]);
        }
        return max;
    }
}
