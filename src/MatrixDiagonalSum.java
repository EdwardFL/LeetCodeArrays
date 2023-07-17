public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int row = mat.length;
        int column = mat[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == j) {
                    sum+= mat[i][j];
                } else if ((i + j == mat.length - 1) && (i != j)) {
                    sum+= mat[i][j];
                }
            }
        }
        return sum;
    }
}
