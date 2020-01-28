package module1.fundamentals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class OptionalTask2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Введите размерность матрицы: ");
    int n = input.nextInt();
    int[][] matrix = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = new Random().nextInt(200) - 100;
        System.out.print(matrix[i][j] + " ");
      }
      System.out.print("\n");
    }
    sortMatrixByColumnOrRow(matrix);
  }

  private static void sortMatrixByColumnOrRow(int[][] matrix) {
    Scanner input = new Scanner(System.in);
    System.out.println("Type column number:");
    int column = input.nextInt();
    Arrays.sort(matrix, Comparator.comparingInt(a -> a[column - 1])); //по k-столбцу
    System.out.println("Sorted by column:");
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.print("\n");
    }

    System.out.println("Type row number:");
    int row = input.nextInt();
    bubbleSort(matrix, matrix.length, row);
    System.out.println("Sorted by row:");
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.print("\n");
    }
  }

  private static void bubbleSort(int matrix[][], int length, int row)
  {
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

}
