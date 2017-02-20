package com.usc.karthik;

public class ShareMaxProfit {
	
	public static void main(String[] args) {
		int[] prices = new int[]{100,1,2,101,102,100,201};
		int profit = ShareMaxProfit.findProfit(prices);
		System.out.println("Maximum profit for the shares :" + profit);
	}

	private static int findProfit(int[] prices) {
		if (prices==null || prices.length <=1) {
            return 0 ;
        }      
        int max = 0 ;
        int sofarMin = prices[0] ;
        
        for (int i = 1; i < prices.length; ++i) {
            if (prices[i] > sofarMin) {
                max = Math.max(max, prices[i] - sofarMin) ;
            } else{
               sofarMin = prices[i];  
            }
        }       
       return max;
	}
}
