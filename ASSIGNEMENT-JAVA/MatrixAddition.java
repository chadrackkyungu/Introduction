
/*
 * 3.1  You are given two matrices, each represented by a 2D array. Your task is to write a Java program to add these two matrices and return the result. It must include a Java method named addMatrices that takes two parameters, matrix1 and matrix2, both of type int[][], representing the matrices to be added. The method should return a 2D array representing the result of adding matrix1 and matrix2. Your program should handle matrices of arbitrary dimensions but ensure that both input matrices have the same number of rows and columns.
Write the addMatrices method with the following signature public static int[][] addMatrices(int[][] matrix1, int[][] matrix2)                           (15 Marks)
 * 
 */

public class MatrixAddition {

    public static void main(String[] args) {
        // Example matrices
        int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] matrix2 = { { 7, 8, 9 }, { 10, 11, 12 } };

        // Adding the matrices
        int[][] result = addMatrices(matrix1, matrix2);

        // Printing the result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        // Assuming matrix1 and matrix2 are non-null and have the same dimensions
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }
}
