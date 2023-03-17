import java.util.*;
public class mergeSort{
    public static void MergeSort(int arr[],int si,int ei){
        // base case
        if (si>=ei){
            return;
        }
        // kaam
        int mid = si+(ei-si)/2;
        MergeSort(arr,si,mid);//leftsort
        MergeSort(arr,mid+1,ei);//rightsort
        merge(arr,si,ei,mid);
    }
    public static void merge(int arr[],int si,int ei,int mid){
        int temp[]  = new int [ei-si+1];
        int i = si; // for left part
        int j  = mid+1; // for right part
        int k = 0; // for temp
        while(i<=mid && j<=ei){
            if (arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // for leftover elements
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] =arr[j++];
        }
        for ( k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }

    }
    public static void printArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]  = {4,1,3,9,5,6,7,-2};
        MergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
}