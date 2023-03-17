public class i{
    public static int get_ithbit(int n,int i){
        int bitmask = 1<<i;
        if ((n & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int set_ithbit(int n ,int i){
        int bitmask = 1<<i;
        return (n | bitmask);
    }
    public static int clear_ithbit(int n,int i){
        int bitmask = ~(1<<i);
        return (n & bitmask);
    }
    public static int  update(int n,int i,int newbit){
        n = clear_ithbit(n,i);
        int bitmask   = newbit<<i;
        return (n | bitmask); 
    }
    public static int clear_bits(int n,int i){
        int bitmask = (~0)<<i;
        return (n & bitmask);
    }
    public static int clearRangeofBits(int n,int i,int j){
        int a = (~0)<<j+1;
        int b=  (1<<i)-1;
        int bitmask = a|b;
        return n & bitmask;

    }
    public static boolean ispowerOftwo(int n){
        return (n & (n-1))==0;
    }
    public static int countSetBits(int n){
        int count =0;
        while(n>0){
            if ((n & 1)!=0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static int fastExponention(int a,int n){
        int ans = 1;
        while(n>0){
            if ((n & 1) !=0 ){// check LSB
                ans= a*ans;
            }
            a=  a*a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        System.out.println(fastExponention(5,3));
    }
}