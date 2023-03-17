import java.util.*;

public class Btree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node Buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = Buildtree(nodes);
            newNode.right = Buildtree(nodes);

            return newNode;
        }

        // public static void preorder(Node root) {
        // if (root == null) {
        // System.out.print(-1 + " ");
        // return;
        // }
        // System.out.print(root.data + " ");
        // preorder(root.left);
        // preorder(root.right);
        // }

        // public static void inorder(Node root) {
        // if (root == null) {
        // return;
        // }
        // inorder(root.left);
        // System.out.print(root.data + " ");
        // inorder(root.right);
        // }

        // public static void postorder(Node root) {
        // if (root == null) {
        // return;
        // }
        // postorder(root.left);
        // postorder(root.right);
        // System.out.print(root.data + " ");
        // }

        public static void levelorder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }

            }
        }

        // public static int height(Node root) {
        // if (root == null) {
        // return 0;
        // }
        // int lh = height(root.left);
        // int rh = height(root.right);
        // return Math.max(lh, rh) + 1;
        // }

        // public static int count(Node root) {
        // if (root == null) {
        // return 0;
        // }
        // int leftCount = count(root.left);
        // int rightCount = count(root.right);
        // return leftCount + rightCount + 1;
        // }

        // public static int Sum(Node root) {
        // if (root == null) {
        // return 0;
        // }
        // int leftSum = Sum(root.left);
        // int rightSum = Sum(root.right);
        // return leftSum + rightSum + root.data;
        // }

        // public static int diam2(Node root) {// O(n^2)
        // if (root == null) {
        // return 0;
        // }
        // int ld = diam2(root.left);
        // int lh = height(root.left);
        // int rh = height(root.right);
        // int rd = diam2(root.right);

        // int self = lh + rh + 1;
        // return Math.max(ld, Math.max(rd, self));
        // }

        // static class Info {// O(n)
        // int diam;
        // int ht;

        // public Info(int diam, int ht) {
        // this.diam = diam;
        // this.ht = ht;
        // }
        // }

        // public static Info diam(Node root) {
        // if (root == null) {
        // return new Info(0, 0);
        // }
        // Info leftInfo = diam(root.left);
        // Info rightInfo = diam(root.right);
        // int diam = Math.max(leftInfo.diam, Math.max(rightInfo.diam, leftInfo.ht +
        // rightInfo.ht + 1));
        // int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        // return new Info(diam, ht);
        // }

        public static boolean isIdentical(Node node, Node subRoot) {
            if (node == null && subRoot == null) {
                return true;
            } else if (node == null || subRoot == null || node.data != subRoot.data) {
                return false;
            }
            if (!isIdentical(node.left, subRoot.left)) {
                return false;
            }
            if (!isIdentical(node.right, subRoot.right)) {
                return false;
            }
            return true;
        }

        // public static boolean isSubtree(Node root, Node subRoot) {
        // if (root == null) {
        // return false;
        // }
        // if (root.data == subRoot.data) {
        // if (isIdentical(root, subRoot)) {
        // return true;
        // }
        // }
        // return (isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot));

        // }

        static class Info {
            Node node;
            int hd;

            public Info(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        public static void topView(Node root) {
            Queue<Info> q = new LinkedList<>();
            HashMap<Integer, Node> map = new HashMap<>();
            int min = 0, max = 0;
            q.add(new Info(root, 0));
            q.add(null);
            while (!q.isEmpty()) {
                Info curr = q.remove();
                if (curr == null) {
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    if (!map.containsKey(curr.hd)) {
                        map.put(curr.hd, curr.node);
                    }
                    if (curr.node.left != null) {
                        q.add(new Info(curr.node.left, curr.hd - 1));
                        min = Math.min(min, curr.hd - 1);
                    }
                    if (curr.node.right != null) {
                        q.add(new Info(curr.node.right, curr.hd + 1));
                        max = Math.max(max, curr.hd + 1);

                    }
                }

            }
            for (int i = min; i <= max; i++) {
                System.out.print(map.get(i).data + " ");
            }
            System.out.println();
        }

        public static void Klevel(Node root, int level, int K) {
            if (root == null) {
                return;
            }
            if (K == level) {
                System.out.print(root.data + " ");
                return;
            }
            Klevel(root.left, level + 1, K);
            Klevel(root.right, level + 1, K);
        }

        public static boolean getPath(Node root, int n, ArrayList<Node> path) {
            if (root == null) {
                return false;
            }
            path.add(root);
            if (root.data == n) {
                return true;
            }
            boolean leftFound = getPath(root.left, n, path);
            boolean rightFound = getPath(root.right, n, path);
            if (leftFound || rightFound) {
                return true;
            }
            path.remove(path.size() - 1);
            return false;
        }

        public static Node lca2(Node root, int n1, int n2) {
            if (root == null || root.data == n1 || root.data == n2) {
                return root;
            }
            Node leftLca = lca2(root.left, n1, n2);
            Node rightLca = lca2(root.right, n1, n2);
            if (leftLca == null) {
                return rightLca;
            }
            if (rightLca == null) {
                return leftLca;
            }
            return root;
        }

        public static Node lca(Node root, int n1, int n2) {
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();
            getPath(root, n1, path1);
            getPath(root, n2, path2);
            int i = 0;
            for (; i < path1.size() && i < path2.size(); i++) {
                if (path1.get(i) != path2.get(i)) {
                    break;
                }
            }
            Node lca = path1.get(i - 1);
            return lca;

        }

        public static int lcadist(Node root, int n) {
            if (root == null) {
                return -1;
            }
            if (root.data == n) {
                return 0;
            }
            int leftdist = lcadist(root.left, n);
            int rightdist = lcadist(root.right, n);
            if (leftdist == -1 && rightdist == -1) {
                return -1;
            } else if (leftdist == -1) {
                return rightdist + 1;
            } else {
                return leftdist + 1;
            }

        }

        public static int minDist(Node root, int n1, int n2) {
            Node lca = lca2(root, n1, n2);
            int dist1 = lcadist(lca, n1);
            int dist2 = lcadist(lca, n2);

            return dist1 + dist2;
        }

        public static int kAncestor(Node root, int n, int k) {
            if (root == null) {
                return -1;
            }
            if (root.data == n) {
                return 0;
            }
            int leftDist = kAncestor(root.left, n, k);
            int rightDist = kAncestor(root.right, n, k);
            if (leftDist == -1 && rightDist == -1) {
                return -1;
            }
            int max = Math.max(leftDist, rightDist);
            if (max + 1 == k) {
                System.out.println(root.data);
            }
            return max + 1;
        }

        public static int transform(Node root) {
            if (root == null) {
                return 0;
            }

            int leftchild = transform(root.left);
            int rightchild = transform(root.right);
            int data = root.data;
            int newLeft = root.left == null ? 0 : root.left.data;
            int newRight = root.right == null ? 0 : root.right.data;
            root.data = leftchild + newLeft + rightchild + newRight;
            return data;
        }

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String args[]) {
        // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        // Node root = tree.Buildtree(nodes);
        // System.out.println(root.data);
        // tree.levelorder(root);
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // System.out.println(tree.height(root));
        // System.out.println(tree.count(root));
        // System.out.println(tree.Sum(root));
        // System.out.print(tree.diam(root).diam);
        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        // subRoot.right = new Node(5);

        // System.out.println(tree.isSubtree(root, subRoot));
        // tree.Klevel(root, 1, 1);
        // int n1 = 4, n2 = 7;
        // System.out.println(tree.minDist(root, n1, n2));
        // int n = 7;
        // int k = 2;
        // tree.kAncestor(root, n, k);
        tree.transform(root);
        tree.preorder(root);

    }
}
