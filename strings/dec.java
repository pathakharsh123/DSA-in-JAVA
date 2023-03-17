import java.util.*;
public class dec{
    public static void printLetters(String str){
        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc=  new Scanner (System.in);
        // decleration of string 
        String str = "abcd";
        String str2 = new String("abcd");
        // input output in string 
        //String name = sc.nextLine();
        //System.out.println(name);
        // length of string
        String fullName = "Tony Stark";
        //System.out.println(fullName.length()); 
        //System.out.println(fullName.charAt(0));
        printLetters(fullName);
    
    }
}
