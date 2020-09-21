package module1.fundamentals.maintask;

import java.util.Random;
import java.util.Scanner;

public class MainTask3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Введите необходимое количество чисел: ");
    int inputNumber = input.nextInt();

    for(int i = 1; i <= inputNumber; i++){
      System.out.println(new Random().nextInt(10000));
    }

    for(int i = 1; i <= inputNumber; i++){
      System.out.print(new Random().nextInt(10000) + " ");
    }
  }

}
