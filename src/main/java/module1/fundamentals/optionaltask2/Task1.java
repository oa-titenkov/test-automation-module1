package module1.fundamentals.optionaltask2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task1 {

    protected static void sortMatrixByColumnOrRow(int[][] matrix) {
        int[][] matrixSortedByColumn = new int[matrix.length][];
        int[][] matrixSortedByRow = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            matrixSortedByColumn[i] = Arrays.copyOf(matrix[i], matrix[i].length);
            matrixSortedByRow[i] = Arrays.copyOf(matrix[i], matrix[i].length);
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Enter column number:");
        int column = input.nextInt();
        Arrays.sort(matrixSortedByColumn, Comparator.comparingInt(a -> a[column]));
        System.out.println("Sorted by column: " + column);
        printMatrix(matrixSortedByColumn);

        System.out.println("Enter row number:");
        int row = input.nextInt();
        bubbleSort(matrixSortedByRow, matrixSortedByRow.length, row);
        System.out.println("Sorted by row: " + row);
        printMatrix(matrixSortedByRow);
    }

    private static void bubbleSort(int matrix[][], int length, int row) {
        if (length == 1) return;

        for (int i = 0; i < (length-1); i++)
            if (matrix[row][i] > matrix[row][i+1])
            {
                for(int j = 0; j < matrix.length; j++){
                    int temp = matrix[j][i];
                    matrix[j][i] = matrix[j][i+1];
                    matrix[j][i+1] = temp;
                }
            }
        bubbleSort(matrix, length - 1, row);
    }

    private static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println();
    }

}
