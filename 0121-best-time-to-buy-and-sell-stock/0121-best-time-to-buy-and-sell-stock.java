class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0],n=prices.length,maxprofit=0,profit=0;
        for(int i=0;i<n;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }
           profit=prices[i]-min;
           maxprofit=Math.max(maxprofit,profit);
        }

        return maxprofit;
        
    }
}