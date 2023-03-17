import java.util.*;
public class g5 {
    public static void main(String args[]){
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        int amount = 590;
        int countOfcoins=0;
        ArrayList<Integer> coinlist = new ArrayList<>();
        Arrays.sort(coins,Comparator.reverseOrder());
        for (int i=0;i<coins.length;i++){
            if (coins[i]<=amount){
                while(coins[i]<=amount){
                    countOfcoins++;
                    coinlist.add(coins[i]);
                    amount = amount-coins[i];
                }
            }
        }
        System.out.println(countOfcoins);
        for (int i=0;i<coinlist.size();i++){
            System.out.print(coinlist.get(i)+" ");
        }
        System.out.println();
    }
}


