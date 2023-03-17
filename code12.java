import java.util.*;
public class code12{
    public static int linearSearch(int arr[],int key){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,12,16,18};
        int key =510;
        System.out.println(linearSearch(arr,key));

    }
}