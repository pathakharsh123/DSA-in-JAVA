import java.util.*;
public class g2 {
    public static void main(String args[]){
        int val[] = {60,100,120};
        int wt[]=  {10,20,30};
        int w = 50;
        double ratio[][] =new double[val.length][2];
        for (int i=0;i<val.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)wt[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        int capacity= w;
        int FinalVal = 0;
        for (int i=ratio.length-1;i>=0;i--){
            int idx  = (int)ratio[i][0];
            if (capacity>=wt[idx]){
                FinalVal +=val[idx];
                capacity-=wt[idx];
            }
            else{
                FinalVal+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.out.println(FinalVal);
    }
}
