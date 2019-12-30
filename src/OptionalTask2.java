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
        matrix[i][j] = new Random().nextInt();
        System.out.println(matrix[i][j]);
      }
    }

  }

}
