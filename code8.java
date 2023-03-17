import java.util.*;
public class code8{
    public static void main(Stirng args[]){
        Scanner sc=new Scanner(System.in);
        int sum_even=0;
        int sum_odd=0;
        do{
            int n=sc.nextInt();
            if (n%2==0){
                sum_even+=n;
            }else{
                sum_odd+=n;
            }
        }while(true);
    }
}