package code;

public class Solution121 {
    public int maxProfit(int prices[]) {
        if (prices.length == 0) {
            return 0;
        }
        int minprice = prices[0];
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            }else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }
}
