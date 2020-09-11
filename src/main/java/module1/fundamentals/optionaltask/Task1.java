package module1.fundamentals.optionaltask;

public class Task1 {

    protected static void printLongestAndShortestNumber(String[] numberArray) {
        String max = numberArray[0];
        String min = numberArray[0];

        for(String item : numberArray){
            if(item.replaceFirst("-", "").length() > max.replaceFirst("-", "")
                    .length()) {
                max = item;
            }
            if(item.replaceFirst("-", "").length() < min.replaceFirst("-", "")
                    .length()){
                min = item;
            }
        }

        System.out.println("max = " + max +
                            " length = " + max.replaceFirst("-", "").length() +
                            ", min = " + min +
                            " length = " + min.replaceFirst("-", "").length());
    }

}
