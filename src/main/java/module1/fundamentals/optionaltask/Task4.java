package module1.fundamentals.optionaltask;

public class Task4 {

    protected static void printMinDifferentDigitsNumber(String[] numberArray) {
        String minDiffNumber = numberArray[0];
        int minDiffLength = numberArray[0].length();

        for (String number : numberArray) {
            String numberWithoutRepeatedDigits = number.replaceFirst("-", "")
                    .replaceAll("(.)\\1+", "$1");
            if (numberWithoutRepeatedDigits.length() < minDiffLength) {
                minDiffNumber = number;
                minDiffLength = numberWithoutRepeatedDigits.length();
            }
        }

        System.out.println("Min different digits number: " + minDiffNumber);
    }

}
