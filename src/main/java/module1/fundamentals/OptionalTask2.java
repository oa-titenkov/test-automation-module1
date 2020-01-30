package module1.fundamentals;

import java.util.*;

public class OptionalTask2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter matrix dimensions: ");
    int n = input.nextInt();
    int[][] matrix = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = new Random().nextInt(20) - 10;
        System.out.print(matrix[i][j] + " ");
      }
      System.out.print("\n");
    }
    findLargestAscendingAndDescendingNumberSequence(matrix);
    findSumOfTwoFirstPositiveNumbersOfRow(matrix);
    sortMatrixByColumnOrRow(matrix);
    findMaxMatrixNumberAndDeleteColumnsAndRowsWithIt(matrix, maxNumberCount(matrix));

  }

  private static void sortMatrixByColumnOrRow(int[][] matrix) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter column number:");
    int column = input.nextInt();
    Arrays.sort(matrix, Comparator.comparingInt(a -> a[column - 1])); //по k-столбцу
    System.out.println("Sorted by column:");
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.print("\n");
    }

    System.out.println("Enter row number:");
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

  private static void findLargestAscendingAndDescendingNumberSequence(int[][] matrix) {
    int ascCount = 1;
    int descCount = 0;
    int ascMaxCount = 1;
    int descMaxCount = 0;
    for(int i = 0; i < matrix.length; i++) {
      if(i > 0 && matrix[i-1][matrix.length - 1] < matrix[i][0]){
        ascCount++;
      }
      else if(ascCount > ascMaxCount) {
        ascMaxCount = ascCount;
        ascCount = 1;
      }
      else ascCount = 1;
      if(i > 0 && matrix[i-1][matrix.length - 1] > matrix[i][0]){
        descCount++;
      }
      else if(descCount > descMaxCount) {
        descMaxCount = descCount;
        descCount = 1;
      }
      else descCount = 1;
      for(int j = 0; j < matrix.length - 1; j++){
        if(matrix[i][j] < matrix[i][j+1]) {
          ascCount++;
        }
        else if(ascCount > ascMaxCount) {
          ascMaxCount = ascCount;
          ascCount = 1;
        }
        else ascCount = 1;
        if(matrix[i][j] > matrix[i][j+1]) {
          descCount++;
        }
        else if(descCount > descMaxCount) {
          descMaxCount = descCount;
          descCount = 1;
        }
        else descCount = 1;
      }
    }
    System.out.println("Largest ascending sequence = " + ascMaxCount);
    System.out.println("Largest descending sequence = " + descMaxCount);
  }

  private static void findSumOfTwoFirstPositiveNumbersOfRow(int[][] matrix) {
    int positiveCount;
    int firstPositiveIndex = 0;
    int secondPositiveIndex;
    int sum;
    for(int i = 0; i < matrix.length; i++) {
      sum = 0;
      positiveCount = 0;
      for(int j = 0; j < matrix.length; j++){
        if(matrix[i][j] > 0 && positiveCount == 0) {
          positiveCount++;
          firstPositiveIndex = j;
        }
        else if(matrix[i][j] > 0 && positiveCount == 1) {
          positiveCount++;
          secondPositiveIndex = j;
          for(int k = firstPositiveIndex; k <= secondPositiveIndex; k++) {
            sum = sum + matrix[i][k];
          }
          System.out.println("sum of the row " + i + " = " + sum);
        }
      }
    }
  }
  private static int maxNumberCount(int[][] matrix) {
    int max = matrix[0][0];
    int maxCount = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if(matrix[i][j] > max) {
          max = matrix[i][j];
        }
      }
    }
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if(matrix[i][j] == max) {
          maxCount++;
        }
      }
    }
    return maxCount;
  }

  private static void findMaxMatrixNumberAndDeleteColumnsAndRowsWithIt(int[][] matrix, int maxNumberCount) {
    int max = matrix[0][0];
    int rowMax  = 0;
    int columnMax = 0;
    int count = maxNumberCount;
    if(count == 0) {
      return;
    }
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if(matrix[i][j] > max) {
          max = matrix[i][j];
          rowMax = i;
          columnMax = j;
        }
      }
    }
    System.out.println("Max number = " + max);
    System.out.println("Max number appearances = " + maxNumberCount);
    for(int i = rowMax, j = 0; j < matrix.length ; j++){
      if(matrix[i][j] == max){
        count--;
      }
    }
    for(int i = 0, j = columnMax; i < matrix.length ; i++){
      if(matrix[i][j] == max){
        count--;
      }
    }
    count++;
    System.out.println("New matrix:");
    int[][] noMaxMatrix = new int[matrix.length - 1][matrix.length - 1];
    int newRowIndex = 0;
    for(int i = 0; i < matrix.length; i++){
      int newColumnIndex = 0;
      if(i != rowMax){
        for(int j = 0; j < matrix.length; j++) {
          if(j != columnMax){
            noMaxMatrix[newRowIndex][newColumnIndex] = matrix[i][j];
            newColumnIndex++;
          }
        }
        newRowIndex++;
      }
    }

    for (int i = 0; i < noMaxMatrix.length; i++) {
      for (int j = 0; j < noMaxMatrix.length; j++) {
        System.out.print(noMaxMatrix[i][j] + " ");
      }
      System.out.print("\n");
    }

    findMaxMatrixNumberAndDeleteColumnsAndRowsWithIt(noMaxMatrix, count);
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
