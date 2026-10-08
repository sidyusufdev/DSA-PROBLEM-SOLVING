
import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int sc = 0;
        int ec = matrix[0].length - 1;
        int sr = 0;
        int er = matrix.length - 1;

        while (sc <= ec && sr <= er) {

            // Top boundary
            for (int j = sc; j <= ec; j++) {
                ans.add(matrix[sr][j]);
            }

            // Right boundary
            for (int i = sr + 1; i <= er; i++) {
                ans.add(matrix[i][ec]);
            }

            // Bottom boundary
            if (sr < er) {
                for (int j = ec - 1; j >= sc; j--) {
                    ans.add(matrix[er][j]);
                }
            }

            // Left boundary
            if (sc < ec) {
                for (int i = er - 1; i > sr; i--) {
                    ans.add(matrix[i][sc]);
                }
            }

            // Move boundaries inward
            sc++;
            sr++;
            ec--;
            er--;
        }

        return ans;
    }
}
