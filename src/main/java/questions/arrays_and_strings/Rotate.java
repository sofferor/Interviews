package questions.arrays_and_strings;

import java.util.ArrayList;
import java.util.List;

public class Rotate {
    public int[][] rotate(int[][] matrix, int rotateRightTimes) {
        rotateRightTimes %= 4;
        int size = matrix.length;
        if (rotateRightTimes == 0 || size <= 1) {
            return matrix;
        }
        int[][] rotatedMatrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                switch (rotateRightTimes) {
                    case 1:
                        rotatedMatrix[i][j] = matrix[size - 1 - j][i];
                        break;
                }
            }
        }
        return rotatedMatrix;
    }

    public void rotateInPlace(int[][] matrix, int rotateRightTimes) {
        rotateRightTimes %= 4;
        int size = matrix.length;
        if (rotateRightTimes == 0 || size <= 1) {
            return;
        }
        int temp;
        int numOfFrames = (int) Math.ceil(size/2);
        for (int i = 0; i < numOfFrames; i++) {
            for (int j = i; j < size; j++) {
                switch (rotateRightTimes) {
                    case 1:
                        temp = matrix[i][j];
                        matrix[i][j] = matrix[size - 1 - j][i];
                        matrix[size - 1 - j][i] = matrix[size - 1 - i][size - 1 - j];
                        matrix[size - 1 - i][size - 1 - j] = matrix[i][size - 1 - j];
                        break;
                }
            }
        }
    }
}
