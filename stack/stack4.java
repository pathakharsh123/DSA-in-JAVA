import java.util.Stack;

public class stack4 {
    public static void main(String args[]) {
        int arr[] = { 6, 8, 0, 1, 3 };
        int nextGreater[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            // step1- while
            while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }
            // step2 - if-else
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }
            // step -3
            s.push(i);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }
}
