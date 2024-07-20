class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0)
            return 0;
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                max=max+(prices[i]-prices[i-1]);
            }
        }
        return max;
    }
}