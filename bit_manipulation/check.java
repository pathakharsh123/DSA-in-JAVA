public class check{
    public static void even_odd(int n){
        int bitmask = 1;
        if ((n & bitmask) == 0){
            System.out.println("number is even");
        }else if ((n & bitmask) == 1){
            System.out.println("number is oddd");
        }
    }
    public static void main(String args[]){
        even_odd(3);
        even_odd(4);
    }
}