package module1.fundamentals.optionaltask;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task7 {

    protected static void printDifferentDigitsNumber(String[] numberArray) {
        String differentDigitsNumber = null;

        for(String item : numberArray){
            char[] charArray = item.toCharArray();
            Set<Character> set = new LinkedHashSet<>();

            for(char ch : charArray){
                set.add(ch);
            }

            StringBuilder builder = new StringBuilder();

            for (Character character : set) {
                builder.append(character);
            }

            if(builder.toString().equals(item)){
                differentDigitsNumber = item;
                break;
            }
        }
        System.out.println("All different digits number: " + differentDigitsNumber);
    }

}
