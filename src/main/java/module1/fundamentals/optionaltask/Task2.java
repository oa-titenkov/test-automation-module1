package module1.fundamentals.optionaltask;

import java.util.Arrays;
import java.util.Comparator;

public class Task2 {

    protected static void printNumbersSortedByLength(String[] numberArray) {
        Arrays.sort(numberArray, Comparator.comparingInt(a -> a.replaceFirst("-", "").length()));
        System.out.print("ASC: ");

        for(String item : numberArray){
            System.out.print(item + " ");
        }

        System.out.print("\nDESC: ");

        for(int i = numberArray.length - 1; i >= 0; i--){
            System.out.print(numberArray[i] + " ");
        }
    }

}
