package module1.fundamentals.optionaltask;

public class Task5 {

    protected static void printNumbersWithEvenAndSameEvenOddDigits(String[] numberArray) {
        int evenDigitsNumbersCount = 0;
        int evenOddDigitsTheSameNumbersCount = 0;

        for(String item : numberArray) {
            int evenDigitsCount = 0;
            int oddDigitsCount = 0;

            for(char charItem : item.replace("-","").toCharArray()){
                if(charItem%2 == 0 ){
                    evenDigitsCount++;
                }
                else oddDigitsCount++;
            }

            if(oddDigitsCount == 0){
                evenDigitsNumbersCount++;
            }
            else if(evenDigitsCount == oddDigitsCount){
                evenOddDigitsTheSameNumbersCount++;
            }
        }

        System.out.println("Numbers with only even digits: " + evenDigitsNumbersCount);
        System.out.println("Numbers with same number of odd and even digits: " + evenOddDigitsTheSameNumbersCount);
    }

}
