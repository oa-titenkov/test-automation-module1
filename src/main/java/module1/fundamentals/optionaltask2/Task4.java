package module1.fundamentals.optionaltask2;

public class Task4 {

    protected static void findMaxMatrixNumberAndDeleteColumnsAndRowsWithIt(int[][] matrix) {
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

        findMaxMatrixNumberAndDeleteColumnsAndRowsWithIt(matrix, maxCount);
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

}
