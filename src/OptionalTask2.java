import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class OptionalTask2 {

  public static void main(String[] args) {
    Scanner input  = new Scanner(System.in);
    System.out.print("Введите размерность матрицы: ");
    int n = input.nextInt();
    int[][] matrix = new int[n][n];
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        matrix[i][j] = new Random().nextInt(100);
        System.out.print(matrix[i][j]+" ");
      }
      System.out.print("\n");
    }

    System.out.println("Введите номер столбца:");
    int column = input.nextInt();
    Arrays.sort(matrix, Comparator.comparingInt(a -> a[column-1])); //по k-столбцу
    System.out.println("Sorted by column:");
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        System.out.print(matrix[i][j]+" ");
      }
      System.out.print("\n");
    }

    System.out.println("Введите номер строки:");
    int row = input.nextInt();
    Arrays.sort(matrix, (a, b) -> Double.compare(a[0], b[0])); //по k-столбцу
    System.out.println("Sorted by row:");
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        System.out.print(matrix[i][j]+" ");
      }
      System.out.print("\n");
    }

  }

}
