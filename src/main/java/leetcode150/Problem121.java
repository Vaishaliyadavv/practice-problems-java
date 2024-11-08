package leetcode150;

public class Problem121 {

    public static void main(String[] args) {
        Problem121 problem121 = new Problem121();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(problem121.maxProfit(prices));
    }


//    -----------------BETTER APPROACH ---------------
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

//    public int maxProfit2(int[] prices) {
//        int[] left = new int[prices.length];
//        int[] right = new int[prices.length];
//        left[0] = prices[0];
//        right[prices.length - 1] = prices[prices.length - 1];
//        for (int i = 1; i < prices.length; i++) {
//            left[i] = Math.min(left[i - 1], prices[i]);
//        }
//        for (int i = prices.length - 2; i >= 0; i--) {
//            right[i] = Math.max(right[i + 1], prices[i]);
//        }
//        int max = 0;
//        for (int i = 0; i < prices.length; i++) {
//            max = Math.max(max, right[i] - left[i]);
//        }
//        return max;
//    }
}
