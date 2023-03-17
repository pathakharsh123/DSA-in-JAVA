import java.util.*;
public class r1{
    public static void Printdec(int n){
        if (n==1){
            System.out.println(n);
            return;
        } 
        System.out.print(n+" ");
        Printdec(n-1);
    }
    public static void Printinc(int n){
        if (n==1){
            System.out.print(n+" ");
            return;
        }
        Printinc(n-1);
        System.out.println(n+" ");
    }
    public static int fact(int n){
        if (n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n*fnm1;
        return fn;
    }
    public static int sum(int n){
        if (n==1){
            return 1;
        }
        int snm1 = sum(n-1);
        int sn = n+snm1;
        return sn;
    }

    public static int fib(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);
        int fibn = fibnm1 +fibnm2;
         return fibn;
    }
    public static boolean isSorted(int arr[],int i){
        if (i==arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static int LastOccurence(int arr[],int key,int i ){
        if (i==-1){
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
        return LastOccurence(arr,key,i-1);
    }
    public static int OptimizedPower(int a,int n){//o(logn)
        if (n==0){
            return 1;
        }
        int halfPower = OptimizedPower(a,n/2);
        int halfPowersq = halfPower*halfPower;

        if (n%2!=0){
            halfPowersq = a*halfPower*halfPower;
        }
        return halfPowersq;
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println(OptimizedPower(2,3));

    }
}