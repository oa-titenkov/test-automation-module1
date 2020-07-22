package module1.fundamentals;

import java.util.*;

public class OptionalTask1 {

  public static void main(String[] args) {

    Scanner input  = new Scanner(System.in);
    System.out.println("Введите количество чисел: ");
    int n = input.nextInt();
    System.out.print("Введите числа: ");
    String[] numberArray = new String[n];

    for(int i = 0; i < n; i++){
      if(input.hasNextInt()){
        numberArray[i] = String.valueOf(input.nextInt());
      }
    }

    printLongestAndShortestNumber(numberArray);
    printNumbersSortedByLength(numberArray);
    printMoreAndLessThanAverageLengthNumbers(numberArray);
    printMinDifferentDigitsNumber(numberArray);
    printNumbersWithEvenAndSameEvenOddDigits(numberArray);
    printAscendingDigitsNumber(numberArray);
    printDifferentDigitsNumber(numberArray);
  }

  private static void printLongestAndShortestNumber(String[] numberArray) {
    String max = numberArray[0];
    String min = numberArray[0];

    for(String item : numberArray){
      if(item.replaceFirst("-", "").length() > max.replaceFirst("-", "").length()) {
        max = item;
      }
      if(item.replaceFirst("-", "").length() < min.replaceFirst("-", "").length()){
        min = item;
      }
    }

    System.out.println("1.\nmax = " + max + " length = " + max.replaceFirst("-", "").length()
            + ", min = " + min + " length = " + min.replaceFirst("-", "").length());
  }

  private static void printNumbersSortedByLength(String[] numberArray) {
    Arrays.sort(numberArray, Comparator.comparingInt(a -> a.replaceFirst("-", "").length()));
    System.out.print("2. \nASC: ");

    for(String item : numberArray){
      System.out.print(item + " ");
    }

    System.out.print("\nDESC: ");

    for(int i = numberArray.length - 1; i >= 0; i--){
      System.out.print(numberArray[i] + " ");
    }
  }

  private static void printMoreAndLessThanAverageLengthNumbers(String[] numberArray) {
    int arrayLengthSum = 0;

    for(String item : numberArray) {
      arrayLengthSum += item.replaceFirst("-", "").length();
    }

    double averageLength =  ((double)arrayLengthSum) / numberArray.length;

    System.out.println("\n3.\nAverage length: " + averageLength);
    System.out.print("> AVG LENGTH ");

    for(String item : numberArray) {
      if((double)item.replaceFirst("-", "").length() > averageLength){
        System.out.print(item +" ");
      }
    }

    System.out.print("\n< AVG LENGTH ");

    for(String item : numberArray) {
      if(item.replaceFirst("-", "").length() < averageLength){
        System.out.print(item +" ");
      }
    }
  }

  private static void printMinDifferentDigitsNumber(String[] numberArray) {
    String minDif = numberArray[0];

    for(String item : numberArray) {
      if(item.replaceAll("(.)\\1+", "$1").length() < minDif.length()){
        minDif = item;
      }
    }

    System.out.println("\n4.\nMin different digits number: " + minDif);
  }

  private static void printNumbersWithEvenAndSameEvenOddDigits(String[] numberArray) {
    int evenCount = 0;
    int evenOddCount = 0;

    for(String item : numberArray) {
      int even = 0;
      int odd = 0;

      for(char charItem : item.replace("-","").toCharArray()){
        if(charItem%2 == 0 ){
          even++;
        }
        else odd++;
      }

      if(odd == 0){
        evenCount++;
      }
      else if(even == odd){
        evenOddCount++;
      }
    }

    System.out.println("5.\nNumbers with only even digits: " + evenCount);
    System.out.println("Numbers with same number of odd and even digits: " + evenOddCount);
  }

  private static void printAscendingDigitsNumber(String[] numberArray) {
    Integer ascendingNumber = null;
    boolean ascendingFlag = false;

    for(String item : numberArray) {
      char[] charItem = item.toCharArray();

      if(charItem.length == 1){
        ascendingNumber = Integer.parseInt(item);
        break;
      }

      for(int i = 0; i < charItem.length - 1; i++){
        ascendingFlag = charItem[i] < charItem[i + 1];
        if(!ascendingFlag) break;
      }

      if(ascendingFlag){
        ascendingNumber = Integer.parseInt(item);
        break;
      }
    }

    System.out.println("6.\nAscending number: " + ascendingNumber);
  }

  private static void printDifferentDigitsNumber(String[] numberArray) {
    String differentDigits = null;

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
        differentDigits = item;
        break;
      }
    }

    System.out.println("7.\nAll different digits number: " + differentDigits);
  }

}
