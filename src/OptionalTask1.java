import java.util.*;

public class OptionalTask1 {

  public static void main(String[] args) {

    Scanner input  = new Scanner(System.in);
    System.out.print("Введите количество чисел: ");
    int n = input.nextInt();
    String[] stringArray = new String[n];
    int[] intArray = new int[n];
    for(int i = 0; i < n; i++){
      if(input.hasNextInt()){
        int in = input.nextInt();
        stringArray[i] = String.valueOf(in);
        intArray[i] = in;
      }
    }

    int max = intArray[0];
    int min = intArray[0];

    for(int item : intArray){
      if(String.valueOf(Math.abs(item)).length() > String.valueOf(max).length()) {
        max = item;
      }
      if(String.valueOf(Math.abs(item)).length() < String.valueOf(min).length()){
        min = item;
      }
    }

    System.out.println("1.\nmax = " + max + " length = " + String.valueOf(Math.abs(max)).length()
                      + ", min = " + min + " length = " + String.valueOf(Math.abs(min)).length());

    String[] sortedArray = stringArray.clone();
    Arrays.sort(sortedArray, Comparator.comparingInt(a -> a.replaceFirst("-", "").length()));

    System.out.print("2. \nASC: ");
    for(String item : sortedArray){
      System.out.print(item + " ");
    }

    System.out.print("\nDESC: ");
    for(int i = sortedArray.length - 1; i >= 0; i--){
      System.out.print(sortedArray[i] + " ");
    }

    int arrayLengthSum = 0;
    for(String item : sortedArray) {
      arrayLengthSum += item.replaceFirst("-", " ").length();
  }

    double averageLength =  ((double)arrayLengthSum) / stringArray.length;
    System.out.println("\n3.\nAverage length: " + averageLength);
    System.out.print("> AVG LENGTH ");
    for(String item : sortedArray) {
      if(item.replaceFirst("-", " ").length() > averageLength){
        System.out.print(item +" ");
      }
    }
    System.out.print("\n< AVG LENGTH ");
    for(String item : sortedArray) {
      if(item.replaceFirst("-", " ").length() < averageLength){
        System.out.print(item +" ");
      }
    }

    String minDif = sortedArray[0];
    for(String item : sortedArray) {
      if(item.replaceAll("(.)\\1+", "$1").length() < minDif.length()){
        minDif = item;
      }
    }
    System.out.println("\n4.\nMin different digits number: " + minDif);

    int evenCount = 0;
    int evenOddCount = 0;

    for(String item : sortedArray) {

      int even = 0;
      int odd = 0;

      for(char charItem : item.toCharArray()){
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

    int ascendingNumber = 0;
    int differentDigits = 0;
    boolean ascFlag = false;
    boolean diffFlag = false;
    for(String item : stringArray) {
      char[] charItem = item.toCharArray();
      if(charItem.length == 1){
        ascendingNumber = Integer.parseInt(item);
        break;
      }
      for(int i = 0; i < charItem.length - 1; i++){
        ascFlag = charItem[i] < charItem[i + 1];
        if(!ascFlag) break;
      }
      if(ascFlag){
        ascendingNumber = Integer.parseInt(item);
        break;
      }
    }

    System.out.println("6.\nAscending number: " + ascendingNumber);





  }

}
