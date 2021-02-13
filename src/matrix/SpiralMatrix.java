/*Input: 2D Matrix MxN
	int a[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
Output:
	1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10*/
	
package matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> ans = new ArrayList<Integer>();

		if (matrix.length == 0)
			return ans;

		int R = matrix.length, C = matrix[0].length;
		boolean[][] seen = new boolean[R][C];
		int[] dr = { 0, 1, 0, -1 };
		int[] dc = { 1, 0, -1, 0 };
		int r = 0, c = 0, di = 0;

		for (int i = 0; i < R * C; i++) {
			ans.add(matrix[r][c]);
			seen[r][c] = true;
			int cr = r + dr[di];
			int cc = c + dc[di];

			if (0 <= cr && cr < R && 0 <= cc && cc < C && !seen[cr][cc]) {
				r = cr;
				c = cc;
			} else {
				di = (di + 1) % 4;
				r += dr[di];
				c += dc[di];
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 4 }, 
						{ 5, 6, 7, 8 }, 
						{ 9, 10, 11, 12 }, 
						{ 13, 14, 15, 16 } };

		System.out.println(spiralOrder(a));
	}

}
