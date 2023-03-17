public class g12 {
    public void helper(int[][] image, int sr, int sc, int color, boolean vis[][], int origincol) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc]
                || image[sr][sc] != origincol) {
            return;
        }
        image[sr][sc] = color;
        vis[sr][sc] = true;
        // left
        helper(image, sr, sc - 1, color, vis, origincol);
        // right
        helper(image, sr, sc + 1, color, vis, origincol);
        // up
        helper(image, sr - 1, sc, color, vis, origincol);
        // down
        helper(image, sr + 1, sc, color, vis, origincol);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

    public static void main(String[] args) {

    }
}
