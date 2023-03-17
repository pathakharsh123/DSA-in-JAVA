import java.util.*;
public class palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = "";
        for (int i=1;i<=str.length();i++){
            str1+=str.charAt(str.length()-i);
        }
        System.out.println(str1);
        if (str.equals(str1)){
            System.out.println("is palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}