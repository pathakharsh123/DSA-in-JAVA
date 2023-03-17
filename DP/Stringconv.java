public class Stringconv {
    public static int LCS(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[n][m];
    }

    public static void stringconv(String str1, String str2) {
        int lcs = LCS(str1, str2);
        System.out.println(lcs);
        int x = Math.abs(lcs - str1.length());
        int y = Math.abs(str2.length() - lcs);
        System.out.print(x + " " + y);

    }

    public static void main(String[] args) {
        String str1 = "pear";
        String str2 = "sea";
        stringconv(str1, str2);
    }

}
