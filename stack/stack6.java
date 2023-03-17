import java.util.Stack;

public class stack6 {
    public static void Maxarea(int arr[]) {
        int maxArea = 0;
        Stack<Integer> s = new Stack<>();
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        for (int i = 0; i < arr.length; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int height = arr[i];
            int area = height * width;
            maxArea = Math.max(maxArea, area);
        }
        System.out.println(maxArea);

    }

    public static void main(String args[]) {
        int arr[] = { 2, 4 };
        Maxarea(arr);
    }

}
