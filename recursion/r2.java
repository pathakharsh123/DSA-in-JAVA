import java.util.*;

public class r2 {
    public static int TilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical
        // int fnm1 = TilingProblem(n-1);
        // horizontal
        // int fnm2 = TilingProblem(n-2);
        // int Totalways = fnm1+fnm2;
        return TilingProblem(n - 1) + TilingProblem(n - 2);
    }

    public static int FriendParing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return FriendParing(n - 1) + (n - 1) * FriendParing(n - 2);
    }

    public static void BinaryString(int n, int Lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        BinaryString(n - 1, 0, str + "0");
        if (Lastplace == 0) {
            BinaryString(n - 1, 1, str + "1");
        }
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        // kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static void main(String args[]) {
        String str = "cbacdcbc";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}