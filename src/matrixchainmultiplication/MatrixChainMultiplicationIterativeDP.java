import java.util.*;
public class MatrixChainMultiplicationIterativeDP {
	public static void main(String[] args) {
		int n = 5;
		int p[] = {5, 4, 6, 2, 7};
		int m[][] = new int[5][5];
		int s[][] = new int[5][5];
		for(int[] row : m) {
			Arrays.fill(row, 0);
		}
		for(int[] row : s) {
			Arrays.fill(row, 0);
		}
		
		int j, min, q;
		// d is the difference value btw each diagonal multiplication i and j
		// i is running from initially i = 1 - 3 then 1 - 2, 1 - 1
		// j is the column which is i + d
		// k ranges from i<=k<j
		for(int d = 1; d < n - 1; d++) {
			for(int i = 1; i < n - d; i++) {
				j = i + d;
				min = Integer.MAX_VALUE;
				for(int k = i; k <= j - 1; k++) {
					q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
					if ( q < min) {
						min = q;
						s[i][j] = k;
					}
				}
				m[i][j] = min;
			}
		}
		System.out.println(m[1][n-1]);
		
	}
}
