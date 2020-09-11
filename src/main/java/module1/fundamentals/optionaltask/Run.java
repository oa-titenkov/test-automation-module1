package module1.fundamentals.optionaltask;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = input.nextInt();
        System.out.print("Введите числа: ");
        String[] numberArray = new String[n];

        for(int i = 0; i < n; i++){
            if(input.hasNextInt()){
                numberArray[i] = String.valueOf(input.nextInt());
            }
        }
        Task1.printLongestAndShortestNumber(numberArray);
        Task2.printNumbersSortedByLength(numberArray);
        Task3.printMoreAndLessThanAverageLengthNumbers(numberArray);
        Task4.printMinDifferentDigitsNumber(numberArray);
        Task5.printNumbersWithEvenAndSameEvenOddDigits(numberArray);
        Task6.printAscendingDigitsNumber(numberArray);
        Task7.printDifferentDigitsNumber(numberArray);
    }

}
