import java.util.ArrayList;
public class a2{
    public static int  storeWater(ArrayList<Integer>list){
        int maxWater =  0;
        // 2 pointer approach
        int lp= 0;
        int rp= list.size()-1;
        while(lp<rp){
            int ht  = Math.min(list.get(lp),list.get(rp));
            int wt = rp-lp;
            int cuurWater =  ht*wt;
            maxWater = Math.max(cuurWater,maxWater);
            // pointer update
            if (list.get(lp)<list.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(storeWater(list));
    }
}