package Programs;

public class question1 {
	public static void main(String[] args) {
		
	}
	    public int maxProfit(int[] prices) {
	        int min = prices[0];
	        int profit = 0;
	        for(int i = 1; i < prices.length; i++) {
	            if(prices[i] < min) {
	                min = prices[i];
	            } else if(profit < (prices[i] - min)) {
	                profit = prices[i] - min;
	             }
	        }        
	        return profit;
	    }
	}

