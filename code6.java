import java.util.*;
public class code6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            if (n%10==0){
                break;
            }
            else{
                n=sc.nextInt();
            }
        }
    }
}