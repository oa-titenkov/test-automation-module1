package module1.collections.optionaltask;

import java.util.Scanner;
import java.util.Stack;

public class Task2 {

  public static void main(String[] args) {
    Stack<Integer> digitsStack = new Stack<>();
    Scanner input = new Scanner(System.in);
    System.out.print("Введите число: ");
    String inputNumber = Integer.toString(input.nextInt());

    for(int i = 0; i < inputNumber.length(); i++) {
      digitsStack.push(inputNumber.charAt(i) - '0');
    }

    while(!digitsStack.isEmpty()) {
      System.out.print(digitsStack.pop());
    }
  }
}