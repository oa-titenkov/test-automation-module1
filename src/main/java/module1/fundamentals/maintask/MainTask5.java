package module1.fundamentals.maintask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTask5
{
  public static void main(String[] args) {
    String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
    Scanner input = new Scanner(System.in);
    System.out.print("Введите число месяца: ");

    try {
      int monthNumber = input.nextInt();
      System.out.println(months[monthNumber - 1]);
    } catch(InputMismatchException | ArrayIndexOutOfBoundsException e){
      System.out.println("Число месяца введено неверно!");
    }
  }

}
