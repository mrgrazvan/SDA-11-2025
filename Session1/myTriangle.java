public class myTriangle {
    public static void main(String[] args) {
        int n = 7;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 | j == i)
                    matrix[i][j] = 1;
                else if (j > i)
                    matrix[i][j] = 0;
                else
                    matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
