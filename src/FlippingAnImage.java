public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int column = image[0].length;
        int[][] res = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                res[i][j] = image[i][column - j - 1];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                res[i][j] = res[i][j] == 1 ? 0 : 1;
            }
        }
        return res;
    }
}
