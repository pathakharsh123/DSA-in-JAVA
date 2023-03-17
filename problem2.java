import java.util.*;
public class problem2{
    public static int BuySellStocks(int prices[]){
        int Maxprofit = 0;
        int bp = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if (prices[i]>bp){
                int profit = prices[i] - bp;
                Maxprofit = Math.max(profit,Maxprofit);
            }else{
                bp = prices[i];
            }
        }
        return Maxprofit;
    }
    public static void main(String args[]){
    int prices[] = {7,1,5,3,6,4};
    System.out.println(BuySellStocks(prices));
    }
}