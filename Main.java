class Main {
  public static void main(String[] args) {

    /*

    You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.


    EX: 
        Input: prices = [7,1,5,3,6,4]
        Output: 5



    */

    int[] prices = {7,1,5,3,6,4};

    System.out.println(maxProfit(prices));


    /**

      SOLUTION: 
        - First, set three variables, 
            1.) buy_low will be set to the max integer value, and be used to keep track of the lowest possibly purchase point or "buy in" price of the stock.
            2.) current_profit will be set to 0 and keep track of the possible profit made if the stock is sold on that particular day. 
            3.) best_profit will be set to minimum integer value, and be used at the end to calculate the best possible profit to be made, and be returned as the solution to this particular problem.
        - Now, to begin the solution, we will initiate a for loop to traverse through the prices array.
        - Within the loop, we create an if statement that checks if the current value within prices is the lowest value by comparing it to buy_low, if it is the current lowest value, set buy_low = prices[i];
        - Within the loop, we set current_profit = prices[i] - buy_low to keep track of profit at that time.
        - Within the loop, we set best_profit = Math.max(current_profit, best_profit); to find the true best time to sell the given stock.
        - Lastly, and outside of the loop, we return best_profit to end the program solution.


    **/
      
  }



   public static int maxProfit(int[] prices) {
        
        int buy_low = Integer.MAX_VALUE;
        int current_profit = 0;
        int best_profit = Integer.MIN_VALUE;
        
        for (int i = 0; i < prices.length; i++)
        {
            
            if (prices[i] < buy_low)
            {
                buy_low = prices[i];
            }
            
            current_profit = prices[i] - buy_low;
            
            best_profit = Math.max(current_profit, best_profit);
        
        }
        
        return best_profit;
    }
}