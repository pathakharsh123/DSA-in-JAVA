import java.util.*;
public class code7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime = true;
        if (n==2){
            System.out.print("is prime");
        }else{
            for (int i=2;i<=Math.sqrt(n);i++){
                if (n%i==0){
                    isPrime=false;
                }
            }
            if (isPrime){
                System.out.print("is prime");
            }else{
                System.out.print("not prime");
        }   }
    }
}