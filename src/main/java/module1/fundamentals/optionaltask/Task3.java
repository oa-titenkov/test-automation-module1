package module1.fundamentals.optionaltask;

public class Task3 {

    protected static void printMoreAndLessThanAverageLengthNumbers(String[] numberArray) {
        int arrayLengthSum = 0;
        for(String item : numberArray) {
            arrayLengthSum += item.replaceFirst("-", "").length();
        }
        double averageLength =  ((double)arrayLengthSum) / numberArray.length;
        System.out.println("Average length: " + averageLength);

        System.out.print("> AVG LENGTH ");
        for(String item : numberArray) {
            if(item.replaceFirst("-", "").length() > averageLength){
                System.out.print(item + " ");
            }
        }

        System.out.print("\n< AVG LENGTH ");
        for(String item : numberArray) {
            if(item.replaceFirst("-", "").length() < averageLength){
                System.out.print(item + " ");
            }
        }
    }

}
