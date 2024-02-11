/*
 * @lc app=leetcode id=733 lang=java
 *
 * [733] Flood Fill
 */

// @lc code=start
class Solution {
    private final int[] DX = {0, 0, 1, -1};
    private final int[] DY = {-1, 1, 0, 0};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        DFS(image, sr, sc, color);
        return image;
    }

    private boolean isValid(int[][] image, int r, int c) {
        return r >= 0 && r < image.length && c >= 0 && c < image[r].length;
    }

    public void DFS(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) {
            return;
        }

        int currentColor = image[sr][sc];
        image[sr][sc] = color;

        for(int i = 0; i < DX.length; i++) {
            int nr = sr + DX[i];
            int nc = sc + DY[i];
            
            if(isValid(image, nr, nc) && image[nr][nc] == currentColor) {
                DFS(image, nr, nc, color);
            }
        }
    }
}
// @lc code=end

