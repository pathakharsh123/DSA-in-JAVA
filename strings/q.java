import java.util.*;
public class q{
    public static void main(String args[]){
        Scanner sc  =  new Scanner (System.in);
        String str = sc.next();
        int n = 0;
        int s =  0;
        int e = 0;
        int w = 0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='N'){
                n++;
            }
            if (str.charAt(i)=='S'){
                s++;
            }
            if (str.charAt(i)=='E'){
                e++;
            }
            if (str.charAt(i)=='W'){
                w++;
            }                                    
        }
        int x = e-w;
        int y = n-s;
        int ans = (int)Math.sqrt(x*x+y*y);
        System.out.println(ans);

    }
}