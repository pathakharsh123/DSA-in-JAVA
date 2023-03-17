public class Rodcutting {
    public static int rodCutting(int length[], int prices[], int rodLength) {
        int n = length.length;
        int dp[][] = new int[n + 1][rodLength + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < rodLength + 1; j++) {
                if (length[i - 1] <= j) {
                    dp[i][j] = Math.max(prices[i - 1] + dp[i][j - length[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }

            }
        }
        return dp[n][rodLength];
    }

    public static void main(String[] args) {
        int length[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int prices[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int rodLength = 8;
        System.out.println(rodCutting(length, prices, rodLength));
    }
}
