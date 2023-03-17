import java.util.*;
public class search{
    public static int search(int arr[],int tar,int si,int ei){
        if (si>ei){
            return -1;
        }
        int mid  =  si+(ei-si)/2;
        if (tar == arr[mid]){
            return mid;
        }
        //case1 tar on line 1
        if (arr[si]<=arr[mid]){
            // case a 
            if (tar <= arr[mid] && tar >= arr[si]){
                return search(arr,tar,si,mid-1);
            }else{
                return search(arr,tar,mid+1,ei);
            }
        }else{
            if (tar <= arr[ei] && tar >= arr[mid]){
                return search(arr,tar,mid+1,ei);
            }else{
                return search(arr,tar,si,mid-1);
            }
        }
    }
    public static void main(String args[]){
        int arr[] =  {4,5,6,7,2,0,1,2};
        int tar = 0;
        int tarindx=search(arr,tar,0,arr.length-1);  
        System.out.println(tarindx);
    }
}