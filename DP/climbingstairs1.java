import java.util.Arrays;

public class climbingstairs1 {
    public static int ways(int n, int ways[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (ways[n] != -1) {
            return ways[n];
        }
        return ways[n] = ways(n - 1, ways) + ways(n - 2, ways);
    }

    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n + 1];
        Arrays.fill(ways, -1);
        System.out.println(ways(n, ways));
    }
}