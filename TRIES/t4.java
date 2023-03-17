import java.util.*;

public class t4 {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    static String ans = "";

    public static String longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return "";
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow) {
                char ch = (char) (i + 'a');
                temp.append(ch);
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1);// backtracking
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        String words[] = { "ju", "k", "ja", "jp", "jpp", "u", "jpa", "ja", "j", "jph", "jps", "p" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        String res = longestWord(root, new StringBuilder(""));
        System.out.println(res);

    }
}
