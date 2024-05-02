package by.itstep.lomachenkov.exam.task2.model;

public class MatrixRotateLogic {
    public static int[][] rotateMatrix(int[][] matrix, String rotateSide) {
        int rotateRows = matrix[0].length;
        int rotateColumns = matrix.length;
        int[][] rotatedMatrix = new int[rotateRows][rotateColumns];

        for (int i = 0; i < rotateRows; i++) {
            for (int j = 0; j < rotateColumns; j++) {
                rotatedMatrix[i][j] = (rotateSide.equalsIgnoreCase("l")) ?
                        matrix[j][rotateRows - 1 - i] : matrix[rotateColumns - 1 - j][i];
            }
        }

        return rotatedMatrix;
    }
}
