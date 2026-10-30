class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];  // first element
        int diff = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            int m = Math.min(prices[i], prices[i + 1]);
            diff = Math.max(prices[i + 1] - prices[i], diff);
            // System.out.println("diff ::: " + diff );
            if (m < min) {
                // System.out.println("in if - ("+i + ", " + (i + 1) +")");
                min = m;
                continue;
            }
            for (int j = i + 1; j < prices.length; j++) {
                diff = Math.max(prices[j] - prices[i], diff);
                // System.out.println("diff set: " + diff + " for: ( " +prices[i] + "," + prices[j] + " )");
            }
        }
        return diff;
    }
}
