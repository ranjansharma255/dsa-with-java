public class MatrixChainMultiplicationRecursive {
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 2, 5};
        int n = arr.length;
        System.out.println("Minimum Number of Multiplications is " + MatrixChainOrder(arr, 1, n -1));
    }
    static int MatrixChainOrder(int[] p, int i, int j) {
        if (i == j) return 0;

        int min = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            int count = MatrixChainOrder(p, i , k) + MatrixChainOrder(p, k + 1, j)
                        + p[i - 1] * p[k] * p[j];

            if(count < min) min = count;
        }
        return min;
    }
}
