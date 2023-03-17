import java.util.*;

public class Quicksort {
    public static void Quicksort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pIndx = partiton(arr, si, ei);
        Quicksort(arr, si, pIndx - 1);
        Quicksort(arr, pIndx + 1, ei);
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int partiton(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;// to make space for smaller element
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String args[]) {
        int arr[] = { 5, 2, 3, 7, 5, 6, 8, 9 };
        Quicksort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}