package module1.fundamentals.optionaltask2;

public class Task2 {

//TODO can be done simpler?

    protected static void findLargestAscendingAndDescendingNumberSequence(int[][] matrix) {
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
            else {
                ascCount = 1;
            }

            if(i > 0 && matrix[i-1][matrix.length - 1] > matrix[i][0]){
                descCount++;
            }
            else if(descCount > descMaxCount) {
                descMaxCount = descCount;
                descCount = 1;
            }
            else {
                descCount = 1;
            }

            for(int j = 0; j < matrix.length - 1; j++){
                if(matrix[i][j] < matrix[i][j+1]) {
                    ascCount++;
                }
                else if(ascCount > ascMaxCount) {
                    ascMaxCount = ascCount;
                    ascCount = 1;
                }
                else{
                    ascCount = 1;
                }

                if(matrix[i][j] > matrix[i][j+1]) {
                    descCount++;
                }
                else if(descCount > descMaxCount) {
                    descMaxCount = descCount;
                    descCount = 1;
                }
                else{
                    descCount = 1;
                }
            }
        }

        System.out.println("Largest ascending sequence = " + ascMaxCount);
        System.out.println("Largest descending sequence = " + descMaxCount + "\n");
    }

}
