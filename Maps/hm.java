import java.util.*;

public class hm {
    public static void main(String args[]) {
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1, 3, 3 };
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        for (Integer k : hm.keySet()) {
            if (hm.get(k) > arr.length / 3) {
                System.out.println(k);
            }
        }
    }
}
