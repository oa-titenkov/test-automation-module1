package module1.fundamentals.optionaltask2;

public class Task3 {

    protected static void findSumBetweenTwoFirstPositiveNumbersOfRow(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            int firstPositiveIndex = 0;
            int secondPositiveIndex;
            int positiveCount = 0;
            int sum = 0;

            for(int j = 0; j < matrix.length; j++){
                if(matrix[i][j] >= 0 && positiveCount == 0) {
                    positiveCount++;
                    firstPositiveIndex = j;
                }
                else if(matrix[i][j] >= 0 && positiveCount == 1) {
                    positiveCount++;
                    secondPositiveIndex = j;

                    for(int k = firstPositiveIndex + 1; k < secondPositiveIndex; k++) {
                        sum = sum + matrix[i][k];
                    }

                    System.out.println("sum between two positive numbers of row " + i + " = " + sum);
                }
            }
            if(positiveCount < 2) {
                System.out.println("There are no two positive numbers in a row " + i);
            }
        }
        System.out.println();
    }

}
