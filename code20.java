import java.util.*;
public class code20{
    public static void Kadane(int arr[]){
        int currsum = 0;
        int maxSum= Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            currsum+=arr[i];
            if (currsum<0){
                currsum= 0;
            }
            maxSum = Math.max(currsum,maxSum);
        }
        System.out.println(maxSum);
    }
    public static void main(String args[]){
        int arr[] = {-2,-3,4,-1,-2};
        Kadane(arr);

    }
}