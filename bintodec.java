import java.util.*;
public class bintodec{
    public static int bintodec(int bin){
        int dec = 0;
        int pow = 0;
        while(bin>0){
            int ld = bin%10;
            dec = dec + ld*(int)Math.pow(2,pow); 
            pow++;
            bin/=10;
        }
        return dec ;

    }
    public static void main(String args[]){
        System.out.println(bintodec(1000));
    }
}