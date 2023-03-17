import java.util.*;
public class code13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,6,4,9,8};
        int largest = Integer.MIN_VALUE;
        for (int i=1;i<arr.length;i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);  
    }
}