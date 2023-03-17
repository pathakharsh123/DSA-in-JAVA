import java.util.*;
public class code14{
    public static int BinarySearch(int arr[],int key){
        int start= 0;
        int end= arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if (arr[mid]==key){
                return mid;
            }
            else if (key<arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,9,10,12,14};
        int key = 19;
        System.out.println(BinarySearch(arr,key));
    }
}