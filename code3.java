import java.util.*;
public class code3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float  a = sc.nextFloat();
        float b = sc.nextFloat();
        float c= sc.nextFloat();
        float total = (a+b+c);
        float bill = (0.18f)*total;
        System.out.println(bill);
    }
}