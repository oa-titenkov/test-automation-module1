package module1.fundamentals.optionaltask2;

import java.util.Random;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix dimensions: ");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = new Random().nextInt(10 + 10) - 10;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

//        Task1.sortMatrixByColumnOrRow(matrix);
//        Task2.findLargestAscendingAndDescendingNumberSequence(matrix);
//        Task3.findSumBetweenTwoFirstPositiveNumbersOfRow(matrix);
        Task4.findMaxMatrixNumberAndDeleteColumnsAndRowsWithIt(matrix);

    }

}
