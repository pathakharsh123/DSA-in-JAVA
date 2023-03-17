import java.util.*;
public class code18{
    public static void maxSubarray(int arr[]){
        int currsum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            int start  = i;
            for (int j=i;j<arr.length;j++){
                int end=j;
                currsum = 0; 
                for (int k=start;k<=end;k++){
                    currsum+=arr[k];
                }
                System.out.println(currsum);
                if (currsum>maxSum){
                    maxSum = currsum;
                }
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        maxSubarray(arr);

    }
}