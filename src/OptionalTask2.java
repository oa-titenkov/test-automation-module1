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

    //Task1

    System.out.println("Введите номер столбца:");
    int column = input.nextInt();
    Arrays.sort(matrix, Comparator.comparingInt(a -> a[column - 1])); //по k-столбцу
    System.out.println("Sorted by column:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.print("\n");
    }

//    System.out.println("Введите номер строки:");
//    int row = input.nextInt();
//    Arrays.sort(matrix, (a, b) -> Double.compare(a[0], b[0])); //по k-столбцу
//    System.out.println("Sorted by row:");
//    for (int i = 0; i < n; i++) {
//      for (int j = 0; j < n; j++) {
//        System.out.print(matrix[i][j] + " ");
//      }
//      System.out.print("\n");
//    }


    //Task2
    int ascNumber = 0;
    int ascMax = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - 1; j++) {
        if (matrix[i][j] < matrix[i][j + 1]) {
          ascNumber++;
        } else if (matrix[i][j] >= matrix[i][j + 1]) {
          if (ascNumber > ascMax) {
            if (ascNumber > ascMax) {
              ascMax = ascNumber;
              ascNumber = 0;
            } else ascNumber = 0;
          }
        }
      }
      System.out.println("Max ascending numbers count: " + ascMax);

      //Task3

      for (int i = 0; i < n; i++) {
        int rowSum = 0;
        int positiveCounter = 0;
        for (int j = 0; j < n; j++) {
          if (matrix[i][j] > 0 && positiveCounter < 2) {
            positiveCounter++;
          } else if (matrix[i][j] < 0 && positiveCounter < 2 && positiveCounter != 0) {
            rowSum += matrix[i][j];
          }
        }
        System.out.println("Sum on row " + (i + 1) + " = " + rowSum);
      }

    }
  }

}
